package io.test.www.dto.elastic.indices;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jcjang on 2017. 2. 15..
 */
public class Reason {
    private String type;
    private String reason;
    @JsonProperty("caused_by")
    private CausedBy causedBy;

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

    public CausedBy getCausedBy() {
        return causedBy;
    }

    public void setCausedBy(CausedBy causedBy) {
        this.causedBy = causedBy;
    }
}
