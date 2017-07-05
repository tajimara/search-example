package io.test.www.dto.elastic.cluster.state;

/**
 * Created by jcjang on 2016. 12. 19..
 */
public class Properties {
    private String type;
    private String format;
    private String index;
    private String store;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }
}
