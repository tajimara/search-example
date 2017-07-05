package io.test.www.dto.elastic.cluster.stats;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jcjang on 2016. 12. 15..
 */
public class Count {
    private Integer total;
    private int data;
    @JsonProperty("coordinating_only")
    private int coordinatingOnly;
    private int master;
    private int ingest;
    @JsonProperty("master_only")
    private Integer masterOnly;
    @JsonProperty("data_only")
    private Integer dataOnly;
    @JsonProperty("master_data")
    private Integer masterData;
    private Integer client;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getCoordinatingOnly() {
        return coordinatingOnly;
    }

    public void setCoordinatingOnly(int coordinatingOnly) {
        this.coordinatingOnly = coordinatingOnly;
    }

    public int getMaster() {
        return master;
    }

    public void setMaster(int master) {
        this.master = master;
    }

    public int getIngest() {
        return ingest;
    }

    public void setIngest(int ingest) {
        this.ingest = ingest;
    }

    public Integer getMasterOnly() {
        return masterOnly;
    }

    public void setMasterOnly(Integer masterOnly) {
        this.masterOnly = masterOnly;
    }

    public Integer getDataOnly() {
        return dataOnly;
    }

    public void setDataOnly(Integer dataOnly) {
        this.dataOnly = dataOnly;
    }

    public Integer getMasterData() {
        return masterData;
    }

    public void setMasterData(Integer masterData) {
        this.masterData = masterData;
    }

    public Integer getClient() {
        return client;
    }

    public void setClient(Integer client) {
        this.client = client;
    }
}
