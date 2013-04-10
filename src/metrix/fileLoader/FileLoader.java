package metrix.fileLoader;

import java.io.File;

public class FileLoader {
   private File projectDirectory;

    public FileLoader(File projectDirectory) {
        this.projectDirectory = projectDirectory;
    }
   
   public File nextFile(){
       return null;
   }
   
   public boolean hasNext(){
       return true;
   }
    
   
}
