package io.test.www.dto.elastic.cluster.state;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * Created by jcjang on 2016. 12. 19..
 */
public class Metadata {
    @JsonProperty("cluster_uuid")
    private String clusterUuid;
    private Templates templates;
    private Map<String, Indices> indices;

    public String getClusterUuid() {
        return clusterUuid;
    }

    public void setClusterUuid(String clusterUuid) {
        this.clusterUuid = clusterUuid;
    }

    public Templates getTemplates() {
        return templates;
    }

    public void setTemplates(Templates templates) {
        this.templates = templates;
    }

    public Map<String, Indices> getIndices() {
        return indices;
    }

    public void setIndices(Map<String, Indices> indices) {
        this.indices = indices;
    }
}
