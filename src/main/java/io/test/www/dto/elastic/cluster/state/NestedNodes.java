package io.test.www.dto.elastic.cluster.state;

//import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jcjang on 2016. 12. 19..
 */
public class NestedNodes {
    private String name;
    @JsonProperty("ephemeral_id")
    private String ephemeralId;
    @JsonProperty("transport_address")
    private String transportAddress;
    private Attributes attributes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEphemeralId() {
        return ephemeralId;
    }

    public void setEphemeralId(String ephemeralId) {
        this.ephemeralId = ephemeralId;
    }

    public String getTransportAddress() {
        return transportAddress;
    }

    public void setTransportAddress(String transportAddress) {
        this.transportAddress = transportAddress;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }
}
