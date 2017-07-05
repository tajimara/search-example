package io.test.www.service.core;

import io.test.www.dto.search.QueryParam;
import org.elasticsearch.action.search.SearchResponse;


/**
 * Created by jihoon on 2015. 5. 19..
 */
public interface SearchService {
    public SearchResponse select(QueryParam queryParam) throws Exception;
    public SearchResponse autocompleteSelect(String queryParam) throws Exception;
    public String getPaging(String targetUrl, String q, Long totalCnt, QueryParam queryParam) throws Exception;


    public SearchResponse selectStore(QueryParam queryParam) throws Exception;
}

