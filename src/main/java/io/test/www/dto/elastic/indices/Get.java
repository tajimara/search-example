package io.test.www.dto.elastic.indices;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jcjang on 2017. 2. 14..
 */
public class Get {
    private long total;
    @JsonProperty("get_time")
    private String getTime;
    @JsonProperty("time_in_millis")
    private long timeInMillis;
    @JsonProperty("exists_total")
    private long existsTotal;
    @JsonProperty("exists_time")
    private String existsTime;
    @JsonProperty("exists_time_in_millis")
    private long existsTimeInMillis;
    @JsonProperty("missing_total")
    private long missingTotal;
    @JsonProperty("missing_time")
    private String missingTime;
    @JsonProperty("missing_time_in_millis")
    private long missingTimeInMillis;
    private long current;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public String getGetTime() {
        return getTime;
    }

    public void setGetTime(String getTime) {
        this.getTime = getTime;
    }

    public long getTimeInMillis() {
        return timeInMillis;
    }

    public void setTimeInMillis(long timeInMillis) {
        this.timeInMillis = timeInMillis;
    }

    public long getExistsTotal() {
        return existsTotal;
    }

    public void setExistsTotal(long existsTotal) {
        this.existsTotal = existsTotal;
    }

    public String getExistsTime() {
        return existsTime;
    }

    public void setExistsTime(String existsTime) {
        this.existsTime = existsTime;
    }

    public long getExistsTimeInMillis() {
        return existsTimeInMillis;
    }

    public void setExistsTimeInMillis(long existsTimeInMillis) {
        this.existsTimeInMillis = existsTimeInMillis;
    }

    public long getMissingTotal() {
        return missingTotal;
    }

    public void setMissingTotal(long missingTotal) {
        this.missingTotal = missingTotal;
    }

    public String getMissingTime() {
        return missingTime;
    }

    public void setMissingTime(String missingTime) {
        this.missingTime = missingTime;
    }

    public long getMissingTimeInMillis() {
        return missingTimeInMillis;
    }

    public void setMissingTimeInMillis(long missingTimeInMillis) {
        this.missingTimeInMillis = missingTimeInMillis;
    }

    public long getCurrent() {
        return current;
    }

    public void setCurrent(long current) {
        this.current = current;
    }
}
