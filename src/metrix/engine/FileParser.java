

package metrix.engine;

import java.io.File;

public abstract class FileParser {
    private File file;

    public FileParser(File file) {
        this.file = file;
    }
    
    public abstract Integer countAttributes();
    public abstract Integer countMethods();
    public abstract Integer countLinesOfCcodes();
    public abstract Integer countInternalDependencies();
    public abstract Integer countExternalDependencies();
}
