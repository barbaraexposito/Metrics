package metrix.metrics;

import java.io.BufferedReader;
import java.io.IOException;
import metrix.Metric;
import metrix.files.ReaderFile;

public class Methods extends Metric {
    
    private String[] patterns = {"for", "while", "switch", "if", "catch", "try", ":", "abstract"};
    private int num = 0;
    private BufferedReader buffer;
    private String line;
    private ReaderFile readerFile;

    public Methods(double value) {
        super(value);
    }
    
    public int numMethods(String file) throws IOException {
        readerFile = new ReaderFile();
        buffer = readerFile.getBufferTextLines(file);
        while ((line = buffer.readLine()) != null) {
            if (isFunction(line)) {
                num++;
            }
        }
        return num;
    }
    
    public boolean isConditionType(String line) {
        return (isPatternCondition(line)) ? true : false;
    }
    
    private boolean isPatternCondition(String line) {
        for (String pattern : patterns) {
            if (line.contains(pattern)) {
                return true;
            }
        }
        return false;
    }

    public boolean isFunction(String line) {
        return (!isConditionType(line) && line.contains("(") && line.contains("{") ) ? true : false;
    }
    
}
