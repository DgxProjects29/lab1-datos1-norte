package pseudofiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class PseudoFileReader {

    private HashMap<String, String> currRegister;
    private BufferedReader buffReader;
    private PseudoFile pseudoFile;
    private boolean efoState;

    public PseudoFileReader(PseudoFile pseudoFile) throws FileNotFoundException {
        this.pseudoFile = pseudoFile;
        this.efoState = false;
        currRegister = new HashMap<>();
        buffReader = new BufferedReader(new FileReader(pseudoFile.getFile()));

        String[] columnNames = pseudoFile.getColumns();
        for (String columnName : columnNames) {
            currRegister.put(columnName, "");
        }
        
    }

    public void readRegister() throws IOException {
        String line = buffReader.readLine();
        if (line != null){
            String[] fields = line.split(",");
            String[] columnNames = pseudoFile.getColumns();
            for (int i = 0; i < columnNames.length; i++) {
                currRegister.replace(columnNames[i], fields[i]);
            }
        }else{
            efoState = true;
        }
    }

    public String getField(String columName){
        return currRegister.get(columName);
    }

    public String[] getCurrRow(){
        String[] currRow = new String[currRegister.size()];
        String[] columnNames = pseudoFile.getColumns();
        for (int i = 0; i < columnNames.length; i++) {
            currRow[i] = currRegister.get(columnNames[i]);
        }
        return currRow;
    }

    public boolean EFO(){
        return efoState;
    }

    public void close() throws IOException {
        buffReader.close();
    }
}
