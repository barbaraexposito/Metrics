package metrix;

import static org.junit.Assert.*;
import org.junit.Test;
public class MetrixTest {
    
    @Test
    public void testMetrics(){
        ProjectAnalyser analyser = getProjectAnalizer();
        analyser.analyseProject();
        MetricList metrics = analyser.getProjectMetrics();
        assertEquals(8, metrics.getMetric("LinesOfCode"));
        assertEquals(194, metrics.getTotalLinesOfCode());
        assertEquals(148, metrics.getEffectiveLinesOfCode());
        assertEquals(0, metrics.getCommentedLinesOfCode());
        assertEquals(46, metrics.getBlankLinesOfCode());
    }
    
    @Test
    public void testMetricsForASingleClass(){
        ProjectAnalyser analyser = getProjectAnalizer();
        analyser.getMetricsForFile("Clash.java");
    }

    private ProjectAnalyser getProjectAnalizer() {
        return new ProjectAnalyser(getSourceFolder());
    }
    
    private String getSourceFolder(){
        return "Metrix/resources";
    }
}
