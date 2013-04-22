package metrix;

import java.io.File;
import metrix.engine.PackageCounter;
import metrix.fileLoader.FileLoader;

public class ProjectAnalyser {

    
    private String projectPath;
    private int classes;
    private int effectiveLinesOfCode;
    private int commentedLinesOfCode;
    private int blankLinesOfCode;
    private int totalLinesOfCode;
    private FileLoader fileLoader;
    
    public ProjectAnalyser(String projectPath) {
        this.projectPath = projectPath;
        this.fileLoader = new FileLoader(new File(projectPath));
    }
    
    public void analyseProject(){
    }
}
