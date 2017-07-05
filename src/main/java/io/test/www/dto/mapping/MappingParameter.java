package io.test.www.dto.mapping;

import java.util.List;

/**
 * Created by jcjang on 2017. 4. 20..
 */
public class MappingParameter {
    private String indexName;
    private String mappingName;
    private String name;
    private String datatype;
    private String analyzer;
    private String index;
    private String store;
    private String boost;
    private List<MappingParameter> list;

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public String getMappingName() {
        return mappingName;
    }

    public void setMappingName(String mappingName) {
        this.mappingName = mappingName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public String getAnalyzer() {
        return analyzer;
    }

    public void setAnalyzer(String analyzer) {
        this.analyzer = analyzer;
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

    public String getBoost() {
        return boost;
    }

    public void setBoost(String boost) {
        this.boost = boost;
    }

    public List<MappingParameter> getList() {
        return list;
    }

    public void setList(List<MappingParameter> list) {
        this.list = list;
    }
}
