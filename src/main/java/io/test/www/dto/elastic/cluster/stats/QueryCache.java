package io.test.www.dto.elastic.cluster.stats;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jcjang on 2016. 12. 15..
 */
public class QueryCache {
    @JsonProperty("memory_size")
    String memorySize;
    @JsonProperty("memory_size_in_bytes")
    Long memorySizeInBytes;
    @JsonProperty("total_count")
    Long totalCount;
    @JsonProperty("hit_count")
    Long hitCount;
    @JsonProperty("miss_count")
    Long missCount;
    @JsonProperty("cache_size")
    Long cacheSize;
    @JsonProperty("cache_count")
    Long cacheCount;
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

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getHitCount() {
        return hitCount;
    }

    public void setHitCount(Long hitCount) {
        this.hitCount = hitCount;
    }

    public Long getMissCount() {
        return missCount;
    }

    public void setMissCount(Long missCount) {
        this.missCount = missCount;
    }

    public Long getCacheSize() {
        return cacheSize;
    }

    public void setCacheSize(Long cacheSize) {
        this.cacheSize = cacheSize;
    }

    public Long getCacheCount() {
        return cacheCount;
    }

    public void setCacheCount(Long cacheCount) {
        this.cacheCount = cacheCount;
    }

    public Integer getEvictions() {
        return evictions;
    }

    public void setEvictions(Integer evictions) {
        this.evictions = evictions;
    }
}
