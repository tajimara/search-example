package io.test.www.dto.elastic.indices;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.test.www.dto.elastic.cluster.stats.*;

/**
 * Created by jcjang on 2017. 2. 14..
 */
public class IndexStats {
    private Docs docs;
    private Store store;
    private Indexing indexing;
    private Get get;
    private Search search;
    private Merges merges;
    private Refresh refresh;
    private Flush flush;
    private Warmer warmer;
    @JsonProperty("query_cache")
    private QueryCache queryCache;
    private Fielddata fielddata;
    private Percolate percolate;
    private Completion completion;
    private Segments segments;
    private Translog translog;
    private Suggest suggest;
    @JsonProperty("request_cache")
    private RequestCache requestCache;
    private Recovery recovery;

    public Docs getDocs() {
        return docs;
    }

    public void setDocs(Docs docs) {
        this.docs = docs;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Indexing getIndexing() {
        return indexing;
    }

    public void setIndexing(Indexing indexing) {
        this.indexing = indexing;
    }

    public Get getGet() {
        return get;
    }

    public void setGet(Get get) {
        this.get = get;
    }

    public Search getSearch() {
        return search;
    }

    public void setSearch(Search search) {
        this.search = search;
    }

    public Merges getMerges() {
        return merges;
    }

    public void setMerges(Merges merges) {
        this.merges = merges;
    }

    public Refresh getRefresh() {
        return refresh;
    }

    public void setRefresh(Refresh refresh) {
        this.refresh = refresh;
    }

    public Flush getFlush() {
        return flush;
    }

    public void setFlush(Flush flush) {
        this.flush = flush;
    }

    public Warmer getWarmer() {
        return warmer;
    }

    public void setWarmer(Warmer warmer) {
        this.warmer = warmer;
    }

    public QueryCache getQueryCache() {
        return queryCache;
    }

    public void setQueryCache(QueryCache queryCache) {
        this.queryCache = queryCache;
    }

    public Fielddata getFielddata() {
        return fielddata;
    }

    public void setFielddata(Fielddata fielddata) {
        this.fielddata = fielddata;
    }

    public Percolate getPercolate() {
        return percolate;
    }

    public void setPercolate(Percolate percolate) {
        this.percolate = percolate;
    }

    public Completion getCompletion() {
        return completion;
    }

    public void setCompletion(Completion completion) {
        this.completion = completion;
    }

    public Segments getSegments() {
        return segments;
    }

    public void setSegments(Segments segments) {
        this.segments = segments;
    }

    public Translog getTranslog() {
        return translog;
    }

    public void setTranslog(Translog translog) {
        this.translog = translog;
    }

    public Suggest getSuggest() {
        return suggest;
    }

    public void setSuggest(Suggest suggest) {
        this.suggest = suggest;
    }

    public RequestCache getRequestCache() {
        return requestCache;
    }

    public void setRequestCache(RequestCache requestCache) {
        this.requestCache = requestCache;
    }

    public Recovery getRecovery() {
        return recovery;
    }

    public void setRecovery(Recovery recovery) {
        this.recovery = recovery;
    }
}
