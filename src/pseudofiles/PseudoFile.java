package pseudofiles;

import java.io.File;

public class PseudoFile {
    
    private File file;
    private String[] columns;

    public PseudoFile(File file, String[] columns) {
        this.file = file;
        this.columns = columns;
    }

    //This cotr is only use for writting purposes
    public PseudoFile(File file) {
        this.file = file;
        this.columns = new String[1];
    }

    public File getFile() {
        return file;
    }

    public String[] getColumns() {
        return columns;
    } 
    
}
