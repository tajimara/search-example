package io.test.www.dto.elastic.cluster.stats;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jcjang on 2016. 12. 15..
 */
public class Percolate {
    Long total;
    String time;
    @JsonProperty("time_in_millis")
    Long timeInMills;
    Long current;
    @JsonProperty("memory_size_in_bytes")
    Long memorySizeInBytes;
    @JsonProperty("memory_size")
    String memorySize;
    Long queries;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Long getTimeInMills() {
        return timeInMills;
    }

    public void setTimeInMills(Long timeInMills) {
        this.timeInMills = timeInMills;
    }

    public Long getCurrent() {
        return current;
    }

    public void setCurrent(Long current) {
        this.current = current;
    }

    public Long getMemorySizeInBytes() {
        return memorySizeInBytes;
    }

    public void setMemorySizeInBytes(Long memorySizeInBytes) {
        this.memorySizeInBytes = memorySizeInBytes;
    }

    public String getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(String memorySize) {
        this.memorySize = memorySize;
    }

    public Long getQueries() {
        return queries;
    }

    public void setQueries(Long queries) {
        this.queries = queries;
    }
}
