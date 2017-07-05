package io.test.www.dto.elastic.indices;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jcjang on 2017. 2. 14..
 */
public class Recovery {
    @JsonProperty("current_as_source")
    private long currentAsSource;
    @JsonProperty("current_as_target")
    private long currentAsTarget;
    @JsonProperty("throttle_time")
    private String throttleTime;
    @JsonProperty("throttle_time_in_millis")
    private long throttleTimeInMillis;

    public long getCurrentAsSource() {
        return currentAsSource;
    }

    public void setCurrentAsSource(long currentAsSource) {
        this.currentAsSource = currentAsSource;
    }

    public long getCurrentAsTarget() {
        return currentAsTarget;
    }

    public void setCurrentAsTarget(long currentAsTarget) {
        this.currentAsTarget = currentAsTarget;
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
