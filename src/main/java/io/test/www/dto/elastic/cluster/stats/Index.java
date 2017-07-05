package io.test.www.dto.elastic.cluster.stats;


import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jcjang on 2016. 12. 15..
 */
public class Index {
    @JsonProperty("shards")
    IndexShards indexShards;
    Primaries primaries;
    Replication replication;

    public IndexShards getIndexShards() {
        return indexShards;
    }

    public void setIndexShards(IndexShards indexShards) {
        this.indexShards = indexShards;
    }

    public Primaries getPrimaries() {
        return primaries;
    }

    public void setPrimaries(Primaries primaries) {
        this.primaries = primaries;
    }

    public Replication getReplication() {
        return replication;
    }

    public void setReplication(Replication replication) {
        this.replication = replication;
    }
}
