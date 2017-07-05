package io.test.www.dto.elastic.cluster.stats;

/**
 * Created by jcjang on 2016. 12. 15..
 */
public class OpenFileDescriptors {
    Long min;
    Long max;
    Long avg;

    public Long getMin() {
        return min;
    }

    public void setMin(Long min) {
        this.min = min;
    }

    public Long getMax() {
        return max;
    }

    public void setMax(Long max) {
        this.max = max;
    }

    public Long getAvg() {
        return avg;
    }

    public void setAvg(Long avg) {
        this.avg = avg;
    }
}
