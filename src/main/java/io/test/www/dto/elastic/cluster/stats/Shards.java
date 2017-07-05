package io.test.www.dto.elastic.cluster.stats;

/**
 * Created by jcjang on 2016. 12. 15..
 */
public class Shards {
    Integer total;
    Integer primaries;
    Double replication;
    Index index;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPrimaries() {
        return primaries;
    }

    public void setPrimaries(Integer primaries) {
        this.primaries = primaries;
    }

    public Double getReplication() {
        return replication;
    }

    public void setReplication(Double replication) {
        this.replication = replication;
    }

    public Index getIndex() {
        return index;
    }

    public void setIndex(Index index) {
        this.index = index;
    }
}
