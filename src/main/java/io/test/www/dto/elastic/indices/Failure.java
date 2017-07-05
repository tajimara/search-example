package io.test.www.dto.elastic.indices;

/**
 * Created by jcjang on 2017. 2. 15..
 */
public class Failure {
    private long shard;
    private String index;
    private String status;
    private Reason reason;

    public long getShard() {
        return shard;
    }

    public void setShard(long shard) {
        this.shard = shard;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Reason getReason() {
        return reason;
    }

    public void setReason(Reason reason) {
        this.reason = reason;
    }
}
