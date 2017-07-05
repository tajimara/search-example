package io.test.www.dto.elastic;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jcjang on 2017. 2. 13..
 */
public class Error {
    @JsonProperty("root_cause")
    private Error[] rootCause;
    private String type;
    private String reason;
    private String index;

    public Error[] getRootCause() {
        return rootCause;
    }

    public void setRootCause(Error[] rootCause) {
        this.rootCause = rootCause;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}
