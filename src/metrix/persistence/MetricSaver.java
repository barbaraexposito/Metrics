package metrix.persistence;

import metrix.Metric;
import metrix.MetricList;

public interface MetricSaver {

    public boolean saveMtric(Metric metric);

    public boolean saveMtrics(MetricList metricList);
}
