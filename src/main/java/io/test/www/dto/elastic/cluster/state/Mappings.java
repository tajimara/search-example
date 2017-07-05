package io.test.www.dto.elastic.cluster.state;

import java.util.Map;

/**
 * Created by jcjang on 2016. 12. 19..
 */
public class Mappings {
    private Map<String, Properties> properties;

    public Map<String, Properties> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Properties> properties) {
        this.properties = properties;
    }
}
