package io.test.www.dto.elastic.indices;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jcjang on 2017. 2. 14..
 */
public class Search {
    @JsonProperty("open_contexts")
    private long openContexts;
    @JsonProperty("query_total")
    private long queryTotal;
    @JsonProperty("query_time")
    private String queryTime;
    @JsonProperty("query_time_in_millis")
    private long queryTimeInMillis;
    @JsonProperty("query_current")
    private long queryCurrent;
    @JsonProperty("fetch_total")
    private long fetchTotal;
    @JsonProperty("fetch_time")
    private String fetchTime;
    @JsonProperty("fetch_time_in_millis")
    private long fetchTimeInMillis;
    @JsonProperty("fetch_current")
    private long fetchCurrent;
    @JsonProperty("scroll_total")
    private long scrollTotal;
    @JsonProperty("scroll_time")
    private String scrollTime;
    @JsonProperty("scroll_time_in_millis")
    private long scrollTimeInMillis;
    @JsonProperty("scroll_current")
    private long scrollCurrent;

    public long getOpenContexts() {
        return openContexts;
    }

    public void setOpenContexts(long openContexts) {
        this.openContexts = openContexts;
    }

    public long getQueryTotal() {
        return queryTotal;
    }

    public void setQueryTotal(long queryTotal) {
        this.queryTotal = queryTotal;
    }

    public String getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(String queryTime) {
        this.queryTime = queryTime;
    }

    public long getQueryTimeInMillis() {
        return queryTimeInMillis;
    }

    public void setQueryTimeInMillis(long queryTimeInMillis) {
        this.queryTimeInMillis = queryTimeInMillis;
    }

    public long getQueryCurrent() {
        return queryCurrent;
    }

    public void setQueryCurrent(long queryCurrent) {
        this.queryCurrent = queryCurrent;
    }

    public long getFetchTotal() {
        return fetchTotal;
    }

    public void setFetchTotal(long fetchTotal) {
        this.fetchTotal = fetchTotal;
    }

    public String getFetchTime() {
        return fetchTime;
    }

    public void setFetchTime(String fetchTime) {
        this.fetchTime = fetchTime;
    }

    public long getFetchTimeInMillis() {
        return fetchTimeInMillis;
    }

    public void setFetchTimeInMillis(long fetchTimeInMillis) {
        this.fetchTimeInMillis = fetchTimeInMillis;
    }

    public long getFetchCurrent() {
        return fetchCurrent;
    }

    public void setFetchCurrent(long fetchCurrent) {
        this.fetchCurrent = fetchCurrent;
    }

    public long getScrollTotal() {
        return scrollTotal;
    }

    public void setScrollTotal(long scrollTotal) {
        this.scrollTotal = scrollTotal;
    }

    public String getScrollTime() {
        return scrollTime;
    }

    public void setScrollTime(String scrollTime) {
        this.scrollTime = scrollTime;
    }

    public long getScrollTimeInMillis() {
        return scrollTimeInMillis;
    }

    public void setScrollTimeInMillis(long scrollTimeInMillis) {
        this.scrollTimeInMillis = scrollTimeInMillis;
    }

    public long getScrollCurrent() {
        return scrollCurrent;
    }

    public void setScrollCurrent(long scrollCurrent) {
        this.scrollCurrent = scrollCurrent;
    }
}
