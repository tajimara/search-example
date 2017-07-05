package io.test.www.dto.elastic.cluster.state;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jcjang on 2016. 12. 19..
 */
public class SettingsIndex {
    @JsonProperty("creation_date")
    private String creationDate;
    private String uuid;
    @JsonProperty("number_of_replicas")
    private String numberOfReplicas;
    @JsonProperty("number_of_shards")
    private String numberOfShards;
    private Version version;
    @JsonProperty("provided_name")
    private String providedName;

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNumberOfReplicas() {
        return numberOfReplicas;
    }

    public void setNumberOfReplicas(String numberOfReplicas) {
        this.numberOfReplicas = numberOfReplicas;
    }

    public String getNumberOfShards() {
        return numberOfShards;
    }

    public void setNumberOfShards(String numberOfShards) {
        this.numberOfShards = numberOfShards;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public String getProvidedName() {
        return providedName;
    }

    public void setProvidedName(String providedName) {
        this.providedName = providedName;
    }
}
