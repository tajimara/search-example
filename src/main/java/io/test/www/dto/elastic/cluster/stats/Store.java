package io.test.www.dto.elastic.cluster.stats;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jcjang on 2016. 12. 15..
 */
public class Store {
    @JsonProperty("size_in_bytes")
    String size;
    @JsonProperty("size_in_bytes")
    Long sizeInBytes;
    @JsonProperty("throttle_time")
    String throttleTime;
    @JsonProperty("throttle_time_in_millis")
    Long throttleTimeInMillis;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    public void setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    public String getThrottleTime() {
        return throttleTime;
    }

    public void setThrottleTime(String throttleTime) {
        this.throttleTime = throttleTime;
    }

    public Long getThrottleTimeInMillis() {
        return throttleTimeInMillis;
    }

    public void setThrottleTimeInMillis(Long throttleTimeInMillis) {
        this.throttleTimeInMillis = throttleTimeInMillis;
    }
}