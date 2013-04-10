package metrix.persistence;

import metrix.Metric;
import metrix.MetricList;

public interface MetricLoader {

    public Metric loadMetric(String metricName);
    public MetricList loadMetrics(String metricName);
}
