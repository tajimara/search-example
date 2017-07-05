package io.test.www.web;

import io.test.www.dto.search.QueryParam;
import io.test.www.service.core.SearchService;
import io.test.www.service.util.PageUtil;
import org.apache.log4j.Logger;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.aggregations.bucket.terms.Terms;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightField;
import org.elasticsearch.search.suggest.Suggest;
import org.elasticsearch.search.suggest.completion.CompletionSuggestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.swing.text.Highlighter;
import java.io.UnsupportedEncodingException;
import java.text.Normalizer;
import java.util.*;

@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = {"/demo1"})
@Controller
public class Demo1Controller {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    SearchService searchService;

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "/search")
    public ModelAndView result(QueryParam queryParam, ModelMap model) throws UnsupportedEncodingException {
        try {
            SearchResponse searchResponse = searchService.select(queryParam);
            List<Map<String,Object>> esData = new ArrayList<Map<String,Object>>();
            List<Map<String,HighlightField>> hlData = new ArrayList<Map<String,HighlightField>>();
            for(SearchHit hit : searchResponse.getHits()){
                esData.add(hit.getSource());
                hlData.add(hit.getHighlightFields());
            }
            List<String> spellList = new ArrayList<String>();
            Suggest suggest = searchResponse.getSuggest();

            if (suggest != null) {
                List<? extends Suggest.Suggestion.Entry<? extends Suggest.Suggestion.Entry.Option>> entries = suggest.getSuggestion("my-suggestion").getEntries();
                for(int i=0 ; i < entries.size(); i++){
                    String temp  = entries.get(i).getOptions().get(0).getText().toString();
                    spellList.add(Normalizer.normalize(temp, Normalizer.Form.NFC));
                }
                model.put("spellResult", spellList);
            }
            /*페이징*/
            PageUtil<Map<String, Object>> page = new PageUtil<Map<String, Object>>(String.valueOf(queryParam.getPage()),String.valueOf(queryParam.getSize()),(int)searchResponse.getHits().getTotalHits());
            model.put("page",page);

            String keyword = "";
            model.put("q", queryParam.getQ());

            /*어그리게이션*/
            Terms authorAgg = searchResponse.getAggregations().get("author_agg");
            Terms rateAgg = searchResponse.getAggregations().get("rate_agg");



            /*하일라이트*/
//            List<Map<String,String>> authorAggList = new ArrayList<Map<String,String>>();
//            for(Map<String,HighlightField> aa : hlData){
//                HighlightField aab = aa.get("title");
//                aab.getFragments();
//                aab.getFragments();
//                //aab.fragments()
//
//            }

            //getDocCount
                    //getKeyAsString
            model.put("authorAgg",authorAgg.getBuckets());
            model.put("rateAgg",rateAgg.getBuckets());
            model.put("hlData",hlData);
            model.put("rFacet",queryParam.getRateFacet());
            model.put("aFacet",queryParam.getAuthorFacet());
            model.put("priceFrom", queryParam.getPriceFrom());
            model.put("priceTo", queryParam.getPriceTo());
            model.put("queryParam",queryParam);
            model.put("result", esData);
            model.put("totalCnt", searchResponse.getHits().getTotalHits());
        } catch (Exception ex){
            ex.printStackTrace();
        }

        return new ModelAndView("front/demo/blog/main", model);
    }


    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "/search/cateogry")
    public ModelAndView resultDetail(QueryParam queryParam, ModelMap model) throws UnsupportedEncodingException {
        //메뉴 조정
        model.put("current_menu0", "");
        model.put("current_menu1", "");
        model.put("current_menu2", "");
        model.put("current_menu3", "");


        model.put("title", "검색엔진 클라우드 플랫폼");
        model.put("keyword", "오픈소스,검색엔진,클라우드,Lucene,Solr,Elastic Search,검색,대용량");
        model.put("description", "오픈소스 검색엔진을 이용하여 클라우드를 구성하여 Saas 형태의 서비스를 제공 및 오픈 소수 검색엔진 구축 개발");

        //model = super.getMainFacetData(model, queryParam);

        return new ModelAndView("front/search_detail", model);

    }



    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "/search/detail")
    public ModelAndView searchCategory(QueryParam queryParam, ModelMap model) throws UnsupportedEncodingException {
        //메뉴 조정
        model.put("current_menu0", "");
        model.put("current_menu1", "");
        model.put("current_menu2", "");
        model.put("current_menu3", "");


        model.put("title", "검색엔진 클라우드 플랫폼");
        model.put("keyword", "오픈소스,검색엔진,클라우드,Lucene,Solr,Elastic Search,검색,대용량");
        model.put("description", "오픈소스 검색엔진을 이용하여 클라우드를 구성하여 Saas 형태의 서비스를 제공 및 오픈 소수 검색엔진 구축 개발");

        //model = super.getMainFacetData(model, queryParam);


        return new ModelAndView("front/search_detail", model);

    }

    /*Pagination
    * 2015/02/10
    * by jehee
    * */
    public String getPage(String targetUrl, String q, Long totalCnt, int rows, int start, int page) {
        String paramStr = "";
        String htmlPage = "";
        String pageUrl = "";

        int targetPageValue;
        int pagingMin;
        int pageSeed;
        int pageBlock = page;
        int countInPage = page;
        int loopCnt = 0;
        int currentPage = 0;

        try {
            double totalPage;
            switch (rows) {
                case 8:
                    currentPage = start / 8;
                    break;
                case 16:
                    currentPage = start / 16;
                    break;
                case 24:
                    currentPage = start / 24;
                    break;

                case 10:
                    currentPage = start / 10;
                    break;
                case 20:
                    currentPage = start / 20;
                    break;
                case 50:
                    currentPage = start / 50;
                    break;
                case 100:
                    currentPage = start / 100;
                    break;
                default:
                    currentPage = start / rows;
                    break;
            }

            pagingMin = ((currentPage - 1) / countInPage) * countInPage;
            if (currentPage > 5) {
                pageSeed = currentPage - 4;
            } else {
                pageSeed = pagingMin;
            }
            double flTotalPage = Float.parseFloat(totalCnt.toString()) / rows;

            totalPage = Math.ceil(flTotalPage);

            paramStr = "q=" + q;




            if (currentPage != 0) {          //이전
                pageUrl = targetUrl + "?" + paramStr + "&start=" + (start - rows);
                htmlPage += "<li><a href=\"" + pageUrl + "\"></a></li>\n";
            }

            while (loopCnt < pageBlock && pageSeed < totalPage) {
                if (pageSeed == currentPage) {
                    targetPageValue = pageSeed;
                    htmlPage += "<li class=\"active\"><a href=\"javascript:;\">" + (targetPageValue + 1) + "</a></li>\n";
                } else {
                    targetPageValue = pageSeed;
                    pageUrl = targetUrl + "?" + paramStr + "&start=" + targetPageValue * rows;
                    htmlPage += "<li><a href=\"" + pageUrl + "\">" + (targetPageValue + 1) + "</a></li>\n";
                }
                pageSeed++;
                loopCnt++;
            }

            if (currentPage < totalPage - 1) {          //다음
                pageUrl = targetUrl + "?" + paramStr + "&start=" + (start + rows);
                htmlPage += "<li><a href=\"" + pageUrl + "\"></a></li>";
            }

            return htmlPage;
        } catch (Exception e) {
            System.out.println("getPage : " + e.toString());
            return "";
        }
    }

    /**
     * @return 통합검색
     */
    @RequestMapping(method = { RequestMethod.GET, RequestMethod.POST }, value = "/autocomplete")
    public ResponseEntity<String> autocomplete(@RequestParam(value = "query") String query,HttpServletResponse response) {
        String resultStr ="";
        try {
            SearchResponse searchResponse = searchService.autocompleteSelect(query);
//            QueryResponse queryResponse = searchService.autocompleteSelect(query);
//            SolrDocumentList results = queryResponse.getResults();
//
            resultStr = "{";
            resultStr += "\"query\":\"" + query + "\",";
            resultStr += "\"suggestions\": [";

            int i = 0;

            for(SearchHit hit : searchResponse.getHits().getHits()){
                Map<String,Object> source=hit.getSource();
                String value = source.get("suggest").toString();

                if (i == 0) {
                    resultStr += "\"" + value + "\"";
                } else {
                    resultStr += ",\"" + value + "\"";
                }
                i++;
            }
            resultStr += "]}";
        } catch (Exception e){
            e.printStackTrace();
        }
        //String returnValue = JSONUtil.toJSON(results);
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.add("Content-Type", "text/html; charset=UTF-8");
        return new ResponseEntity<String>(resultStr, responseHeaders, HttpStatus.CREATED);
    }
}