package metrix.metrics;

import java.io.BufferedReader;
import java.io.IOException;
import metrix.Metric;
import metrix.files.ReaderFile;

public class EffectiveLinesOfCode extends Metric{
    
    private int num = 0;
    private BufferedReader buffer;
    private String line;
    private ReaderFile readerFile;
    
    public EffectiveLinesOfCode(double value) {
        super(value);
    }
    
    public int numLinesEffectives(String file) throws IOException {
        readerFile = new ReaderFile();
        buffer = readerFile.getBufferTextLines(file);
        while ((line = buffer.readLine()) != null) {
            if (!line.trim().equals("")) {
                num++;
            }
        }
        return num;
    }
}
