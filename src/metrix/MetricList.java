package metrix;

import java.util.ArrayList;

public class MetricList extends ArrayList<Metric> {

    public Metric getMetric(String name) {
        for (Metric metric : this)
            if (metric.getClass().getSimpleName().equals(name)) return metric;
        return null;
    }
}
