package metrix;

import java.io.File;
import java.io.IOException;
import metrix.metrics.NumsFiles;
import static org.junit.Assert.*;
import org.junit.Test;


public class MetrixTest {
    
    /*@Test
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
    }*/
    
    @Test
    public void analyserMetric() throws IOException{
        String path = "src/metrix/Language.java";
        ProjectAnalyser analyser = new ProjectAnalyser(path);
        analyser.analyseProject();
        assertEquals(11, analyser.getLinesEffectives());
        assertEquals(15, analyser.getLinesOfCode());
        assertEquals(4, analyser.getLinesBlank());
        assertEquals(2, analyser.getNumMethods());
        assertEquals(0, analyser.getNumAttributes());
    }
    
    @Test
    public void analyserMetric2() throws IOException{
        String path = "src/metrix/fileLoader/FileLoader.java";
        ProjectAnalyser analyser = new ProjectAnalyser(path);
        analyser.analyseProject();
        assertEquals(14, analyser.getLinesEffectives());
        assertEquals(19, analyser.getLinesOfCode());
        assertEquals(5, analyser.getLinesBlank());
        assertEquals(3, analyser.getNumMethods());
        assertEquals(1, analyser.getNumAttributes());
    }
    
    @Test
    public void analyserMetric3() throws IOException{
        String path = "src/metrix/engine/FileParser.java";
        ProjectAnalyser analyser = new ProjectAnalyser(path);
        analyser.analyseProject();
        assertEquals(13, analyser.getLinesEffectives());
        assertEquals(19, analyser.getLinesOfCode());
        assertEquals(6, analyser.getLinesBlank());
        assertEquals(1, analyser.getNumMethods());
        assertEquals(1, analyser.getNumAttributes());
    }
    
    @Test
    public void numFiles(){
        File f = new File("src/");
        NumsFiles filenumclass = new NumsFiles();
        assertEquals(18, filenumclass.listNumFiles(f, 0));
    }
    
}
