package io.test.www.web;

import io.test.www.dto.search.QueryParam;
import io.test.www.service.core.SearchService;
import org.apache.log4j.Logger;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = {"/demo2"})
@Controller
public class Demo2Controller {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    SearchService searchService;
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = {"/search"})
    public ModelAndView storeMain(QueryParam queryParam, ModelMap model, HttpServletRequest request) throws UnsupportedEncodingException {
        String urlParam = request.getQueryString();
        try {
            SearchResponse searchResponse = searchService.selectStore(queryParam);
            List<Map<String,Object>> esData = new ArrayList<Map<String,Object>>();
            for(SearchHit hit : searchResponse.getHits()){
                esData.add(hit.getSource());
            }
//
//
//            model.put("q", queryParam.getQ());
//            model.put("fq", queryParam.getFq());
            model.put("queryParam",queryParam);
            model.put("result", esData);
            model.put("totalCnt", searchResponse.getHits().getTotalHits());
//
//            List<String> spellList = new ArrayList<String>();
//
//            if (queryResponseSpell != null) {
//                for(SpellCheckResponse.Collation collation : queryResponseSpell.getSpellCheckResponse().getCollatedResults()) {
//                    spellList.add(Normalizer.normalize(collation.getCollationQueryString(), Normalizer.Form.NFC));
//                }
//                model.put("spellResult", spellList);
//            }
//
//
//
//
//
//            model.put("solrResult", queryResponse.getResults());
//            model.put("solrHighlight", queryResponse.getHighlighting());
//            model.put("rateFacet", queryResponse.getFacetField("rate").getValues());
//            model.put("categoryFacet", queryResponse.getFacetField("category").getValues());
//
//            //model.put("pivotFacets",pivotFieldsList);
//            model.put("totalCnt", queryResponse.getResults().getNumFound());
//            model.put("pagingHtml", pagingHtml);
//            SolrDocumentList solr=queryResponse.getResults();

        } catch (Exception ex){
            ex.printStackTrace();
        }

        return new ModelAndView("front/demo/store/main", model);
    }
    @RequestMapping(value="/api/select", method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String,Object>>  getShopInJSON(QueryParam queryParam) throws Exception {
        SearchResponse searchResponse = searchService.selectStore(queryParam);
        List<Map<String,Object>> esData = new ArrayList<Map<String,Object>>();
        for(SearchHit hit : searchResponse.getHits()){
            esData.add(hit.getSource());
        }
        return esData;
    }
}

