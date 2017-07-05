package io.test.www.dto.elastic.indices;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jcjang on 2017. 2. 14..
 */
public class Translog {
    private long operations;
    private String size;
    @JsonProperty("size_in_bytes")
    private long sizeInBytes;

    public long getOperations() {
        return operations;
    }

    public void setOperations(long operations) {
        this.operations = operations;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public long getSizeInBytes() {
        return sizeInBytes;
    }

    public void setSizeInBytes(long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }
}
