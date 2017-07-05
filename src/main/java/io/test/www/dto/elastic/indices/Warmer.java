package io.test.www.dto.elastic.indices;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jcjang on 2017. 2. 14..
 */
public class Warmer {
    private long current;
    private long total;
    @JsonProperty("total_time")
    private String totalTime;
    @JsonProperty("total_time_in_millis")
    private long totalTimeInMillis;

    public long getCurrent() {
        return current;
    }

    public void setCurrent(long current) {
        this.current = current;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public String getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }

    public long getTotalTimeInMillis() {
        return totalTimeInMillis;
    }

    public void setTotalTimeInMillis(long totalTimeInMillis) {
        this.totalTimeInMillis = totalTimeInMillis;
    }
}
