package io.test.www.dto.elastic.cluster.stats;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jcjang on 2016. 12. 15..
 */
public class Mem {
    private String total;
    @JsonProperty("total_in_bytes")
    private Long totalInBytes;
    private long free;
    @JsonProperty("free_in_bytes")
    private long free_in_bytes;
    private String used;
    @JsonProperty("used_in_bytes")
    private long usedInBytes;
    @JsonProperty("free_percent")
    private int freePercent;
    @JsonProperty("used_percent")
    private int usedPercent;

    @JsonProperty("heap_used")
    private String heapUsed;
    @JsonProperty("heap_used_in_bytes")
    private Long heapUsedInBytes;
    @JsonProperty("heap_max")
    private String heapMax;
    @JsonProperty("heap_max_in_bytes")
    private Long heapMaxInBytes;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Long getTotalInBytes() {
        return totalInBytes;
    }

    public void setTotalInBytes(Long totalInBytes) {
        this.totalInBytes = totalInBytes;
    }

    public long getFree() {
        return free;
    }

    public void setFree(long free) {
        this.free = free;
    }

    public long getFree_in_bytes() {
        return free_in_bytes;
    }

    public void setFree_in_bytes(long free_in_bytes) {
        this.free_in_bytes = free_in_bytes;
    }

    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }

    public long getUsedInBytes() {
        return usedInBytes;
    }

    public void setUsedInBytes(long usedInBytes) {
        this.usedInBytes = usedInBytes;
    }

    public int getFreePercent() {
        return freePercent;
    }

    public void setFreePercent(int freePercent) {
        this.freePercent = freePercent;
    }

    public int getUsedPercent() {
        return usedPercent;
    }

    public void setUsedPercent(int usedPercent) {
        this.usedPercent = usedPercent;
    }

    public String getHeapUsed() {
        return heapUsed;
    }

    public void setHeapUsed(String heapUsed) {
        this.heapUsed = heapUsed;
    }

    public Long getHeapUsedInBytes() {
        return heapUsedInBytes;
    }

    public void setHeapUsedInBytes(Long heapUsedInBytes) {
        this.heapUsedInBytes = heapUsedInBytes;
    }

    public String getHeapMax() {
        return heapMax;
    }

    public void setHeapMax(String heapMax) {
        this.heapMax = heapMax;
    }

    public Long getHeapMaxInBytes() {
        return heapMaxInBytes;
    }

    public void setHeapMaxInBytes(Long heapMaxInBytes) {
        this.heapMaxInBytes = heapMaxInBytes;
    }
}
