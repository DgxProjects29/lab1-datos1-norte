package pseudofiles;

import java.io.File;

public class PseudoFile {
    
    private File file;
    private String[] columns;

    public PseudoFile(File file, String[] columns) {
        this.file = file;
        this.columns = columns;
    }

    public File getFile() {
        return file;
    }

    public String[] getColumns() {
        return columns;
    } 
    
}
