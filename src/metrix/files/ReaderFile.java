package metrix.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReaderFile {
    private ArrayList<String> LinesFile = new ArrayList<>();
    private File file;
    private FileReader filereader;
    private BufferedReader buffer;

    public ReaderFile(){
    }
    
    public BufferedReader getBufferTextLines(String path) throws IOException {
        file = new File(path);
        filereader = new FileReader(file);
        buffer = new BufferedReader(filereader);
        return buffer;
    }

}
