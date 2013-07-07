package metrix.metrics;

import java.io.File;

public class NumsFiles {
    
    public boolean extension(File dir, String extension) {
        return dir.getName().endsWith(extension);
    }
    
    public int listNumFiles(File folder, int num){
        if (!folder.exists()) {
            return num;
        }
        File[] files = folder.listFiles();
        for (int x = 0; x < files.length; x++) {
            if (files[x].isDirectory()) {
                num = listNumFiles(files[x], num);
                
            }
            if (extension(files[x], ".java") ) {
                num++;
            }
        }
        return num;
    }
}
