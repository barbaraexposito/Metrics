package metrix;

import java.io.File;
import java.io.IOException;
import metrix.fileLoader.FileLoader;
import metrix.metrics.Attributes;
import metrix.metrics.BlankLinesOfCode;
import metrix.metrics.EffectiveLinesOfCode;
import metrix.metrics.LinesOfCode;
import metrix.metrics.Methods;

public class ProjectAnalyser {
    
    private String projectPath;
    private int classes;
    private int effectiveLinesOfCode;
    private int blankLinesOfCode;
    private int totalLinesOfCode;
    private int totalMethods;
    private int totalAttributes;
    private FileLoader fileLoader;
    
    public ProjectAnalyser(String projectPath) {
        this.projectPath = projectPath;
        this.fileLoader = new FileLoader(new File(projectPath));
    }
    
    public void analyseProject() throws IOException{
        EffectiveLinesOfCode effectiveLines = new EffectiveLinesOfCode(0.0);
        LinesOfCode linesCode = new LinesOfCode(0.0);
        BlankLinesOfCode blankLines = new BlankLinesOfCode(0.0);
        Methods numMethods = new Methods(0.0);
        Attributes numAttributes = new Attributes(0.0);
        totalLinesOfCode = linesCode.numLines(projectPath);
        effectiveLinesOfCode = effectiveLines.numLinesEffectives(projectPath);
        blankLinesOfCode = blankLines.numLinesBlank(projectPath);
        totalMethods = numMethods.numMethods(projectPath);
        totalAttributes = numAttributes.numAttributes(projectPath);
    }
    
    public int getLinesOfCode(){
        return totalLinesOfCode;
    }
    
    public int getLinesEffectives(){
        return effectiveLinesOfCode;
    }
    
    public int getLinesBlank(){
        return blankLinesOfCode;
    }
    
    public int getNumMethods(){
        return totalMethods;
    }
    
    public int getNumAttributes(){
        return totalAttributes;
    }
    
}
