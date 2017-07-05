package io.test.www.dto.elastic.cluster.stats;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jcjang on 2016. 12. 15..
 */
public class Fs {
    String total;
    @JsonProperty("total_in_bytes")
    Long totalInBytes;
    String free;
    @JsonProperty("free_in_bytes")
    Long freeInBytes;
    String available;
    @JsonProperty("available_in_bytes")
    Long availableInBytes;

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

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }

    public Long getFreeInBytes() {
        return freeInBytes;
    }

    public void setFreeInBytes(Long freeInBytes) {
        this.freeInBytes = freeInBytes;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public Long getAvailableInBytes() {
        return availableInBytes;
    }

    public void setAvailableInBytes(Long availableInBytes) {
        this.availableInBytes = availableInBytes;
    }
}
