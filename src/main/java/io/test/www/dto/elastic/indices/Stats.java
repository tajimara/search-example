package io.test.www.dto.elastic.indices;

import java.util.Map;

/**
 * Created by jcjang on 2017. 2. 14..
 */
public class Stats {
    private Shards _shards;
    private Index _all;
    private Map<String, Index> indices;

    public Shards get_shards() {
        return _shards;
    }

    public void set_shards(Shards _shards) {
        this._shards = _shards;
    }

    public Index get_all() {
        return _all;
    }

    public void set_all(Index _all) {
        this._all = _all;
    }

    public Map<String, Index> getIndices() {
        return indices;
    }

    public void setIndices(Map<String, Index> indices) {
        this.indices = indices;
    }
}
