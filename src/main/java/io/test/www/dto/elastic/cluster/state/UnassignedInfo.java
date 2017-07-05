package io.test.www.dto.elastic.cluster.state;

/**
 * Created by jcjang on 2016. 12. 19..
 */
public class UnassignedInfo {
    private String reason;
    private String at;
    private String details;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getAt() {
        return at;
    }

    public void setAt(String at) {
        this.at = at;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
