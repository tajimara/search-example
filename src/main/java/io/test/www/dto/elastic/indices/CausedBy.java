package io.test.www.dto.elastic.indices;

/**
 * Created by jcjang on 2017. 2. 15..
 */
public class CausedBy {
    private String type;
    private String reason;

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
}
