package io.test.www.dto.elastic.cluster.stats;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jcjang on 2016. 12. 15..
 */
public class Fielddata {
    @JsonProperty("memory_size")
    String memorySize;
    @JsonProperty("memory_size_in_bytes")
    Long memorySizeInBytes;
    Integer evictions;

    public String getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(String memorySize) {
        this.memorySize = memorySize;
    }

    public Long getMemorySizeInBytes() {
        return memorySizeInBytes;
    }

    public void setMemorySizeInBytes(Long memorySizeInBytes) {
        this.memorySizeInBytes = memorySizeInBytes;
    }

    public Integer getEvictions() {
        return evictions;
    }

    public void setEvictions(Integer evictions) {
        this.evictions = evictions;
    }
}
