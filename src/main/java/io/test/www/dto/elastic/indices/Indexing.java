package io.test.www.dto.elastic.indices;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jcjang on 2017. 2. 14..
 */
public class Indexing {
    @JsonProperty("index_total")
    private int indexTotal;
    @JsonProperty("index_time")
    private String indexTime;
    @JsonProperty("index_time_in_millis")
    private long indexTimeInMillis;
    @JsonProperty("index_current")
    private long indexCurrent;
    @JsonProperty("index_failed")
    private long indexFailed;
    @JsonProperty("delete_total")
    private long deleteTotal;
    @JsonProperty("delete_time")
    private String deleteTime;
    @JsonProperty("delete_time_in_millis")
    private long deleteTimeInMillis;
    @JsonProperty("delete_current")
    private Long deleteCurrent;
    @JsonProperty("noop_update_total")
    private Long noopUpdateTotal;
    @JsonProperty("is_throttled")
    private boolean isThrottled;
    @JsonProperty("throttle_time")
    private String throttleTime;
    @JsonProperty("throttle_time_in_millis")
    private long throttleTimeInMillis;

    public int getIndexTotal() {
        return indexTotal;
    }

    public void setIndexTotal(int indexTotal) {
        this.indexTotal = indexTotal;
    }

    public String getIndexTime() {
        return indexTime;
    }

    public void setIndexTime(String indexTime) {
        this.indexTime = indexTime;
    }

    public long getIndexTimeInMillis() {
        return indexTimeInMillis;
    }

    public void setIndexTimeInMillis(long indexTimeInMillis) {
        this.indexTimeInMillis = indexTimeInMillis;
    }

    public long getIndexCurrent() {
        return indexCurrent;
    }

    public void setIndexCurrent(long indexCurrent) {
        this.indexCurrent = indexCurrent;
    }

    public long getIndexFailed() {
        return indexFailed;
    }

    public void setIndexFailed(long indexFailed) {
        this.indexFailed = indexFailed;
    }

    public long getDeleteTotal() {
        return deleteTotal;
    }

    public void setDeleteTotal(long deleteTotal) {
        this.deleteTotal = deleteTotal;
    }

    public String getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
    }

    public long getDeleteTimeInMillis() {
        return deleteTimeInMillis;
    }

    public void setDeleteTimeInMillis(long deleteTimeInMillis) {
        this.deleteTimeInMillis = deleteTimeInMillis;
    }

    public Long getDeleteCurrent() {
        return deleteCurrent;
    }

    public void setDeleteCurrent(Long deleteCurrent) {
        this.deleteCurrent = deleteCurrent;
    }

    public Long getNoopUpdateTotal() {
        return noopUpdateTotal;
    }

    public void setNoopUpdateTotal(Long noopUpdateTotal) {
        this.noopUpdateTotal = noopUpdateTotal;
    }

    public boolean isThrottled() {
        return isThrottled;
    }

    public void setThrottled(boolean throttled) {
        isThrottled = throttled;
    }

    public String getThrottleTime() {
        return throttleTime;
    }

    public void setThrottleTime(String throttleTime) {
        this.throttleTime = throttleTime;
    }

    public long getThrottleTimeInMillis() {
        return throttleTimeInMillis;
    }

    public void setThrottleTimeInMillis(long throttleTimeInMillis) {
        this.throttleTimeInMillis = throttleTimeInMillis;
    }
}
