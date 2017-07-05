package io.test.www.dto.elastic.indices;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jcjang on 2017. 2. 14..
 */
public class Merges {
    private long current;
    @JsonProperty("current_docs")
    private long currentDocs;
    @JsonProperty("current_size")
    private String currentSize;
    @JsonProperty("current_size_in_bytes")
    private long currentSizeInBytes;
    private long total;
    @JsonProperty("total_time")
    private String totalTime;
    @JsonProperty("total_time_in_millis")
    private long totalTimeInMillis;
    @JsonProperty("total_docs")
    private long totalDocs;
    @JsonProperty("total_size")
    private String totalSize;
    @JsonProperty("total_size_in_bytes")
    private long totalSizeInBytes;
    @JsonProperty("total_stopped_time")
    private String totalStoppedTime;
    @JsonProperty("total_stopped_time_in_millis")
    private long totalStoppedTimeInMillis;
    @JsonProperty("total_throttled_time")
    private String totalThrottledTime;
    @JsonProperty("total_throttled_time_in_millis")
    private long totalThrottledTimeInMillis;
    @JsonProperty("total_auto_throttle")
    private String totalAutoThrottle;
    @JsonProperty("total_auto_throttle_in_bytes")
    private long totalAutoThrottleInBytes;

    public long getCurrent() {
        return current;
    }

    public void setCurrent(long current) {
        this.current = current;
    }

    public long getCurrentDocs() {
        return currentDocs;
    }

    public void setCurrentDocs(long currentDocs) {
        this.currentDocs = currentDocs;
    }

    public String getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(String currentSize) {
        this.currentSize = currentSize;
    }

    public long getCurrentSizeInBytes() {
        return currentSizeInBytes;
    }

    public void setCurrentSizeInBytes(long currentSizeInBytes) {
        this.currentSizeInBytes = currentSizeInBytes;
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

    public long getTotalDocs() {
        return totalDocs;
    }

    public void setTotalDocs(long totalDocs) {
        this.totalDocs = totalDocs;
    }

    public String getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(String totalSize) {
        this.totalSize = totalSize;
    }

    public long getTotalSizeInBytes() {
        return totalSizeInBytes;
    }

    public void setTotalSizeInBytes(long totalSizeInBytes) {
        this.totalSizeInBytes = totalSizeInBytes;
    }

    public String getTotalStoppedTime() {
        return totalStoppedTime;
    }

    public void setTotalStoppedTime(String totalStoppedTime) {
        this.totalStoppedTime = totalStoppedTime;
    }

    public long getTotalStoppedTimeInMillis() {
        return totalStoppedTimeInMillis;
    }

    public void setTotalStoppedTimeInMillis(long totalStoppedTimeInMillis) {
        this.totalStoppedTimeInMillis = totalStoppedTimeInMillis;
    }

    public String getTotalThrottledTime() {
        return totalThrottledTime;
    }

    public void setTotalThrottledTime(String totalThrottledTime) {
        this.totalThrottledTime = totalThrottledTime;
    }

    public long getTotalThrottledTimeInMillis() {
        return totalThrottledTimeInMillis;
    }

    public void setTotalThrottledTimeInMillis(long totalThrottledTimeInMillis) {
        this.totalThrottledTimeInMillis = totalThrottledTimeInMillis;
    }

    public String getTotalAutoThrottle() {
        return totalAutoThrottle;
    }

    public void setTotalAutoThrottle(String totalAutoThrottle) {
        this.totalAutoThrottle = totalAutoThrottle;
    }

    public long getTotalAutoThrottleInBytes() {
        return totalAutoThrottleInBytes;
    }

    public void setTotalAutoThrottleInBytes(long totalAutoThrottleInBytes) {
        this.totalAutoThrottleInBytes = totalAutoThrottleInBytes;
    }
}
