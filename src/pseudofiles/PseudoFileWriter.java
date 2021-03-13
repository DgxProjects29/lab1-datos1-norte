package pseudofiles;

import java.io.FileWriter;
import java.io.IOException;

public class PseudoFileWriter {

    private FileWriter fileWriter;
    private StringBuilder registers;

    public PseudoFileWriter(PseudoFile pseudoFile, 
        boolean append) throws IOException {
        fileWriter = new FileWriter(pseudoFile.getFile(), append);
        registers = new StringBuilder();
    }

    public void addRegister(Object[] row){
        
        //validate row lenght?

        String csvRow = createRow(row);
        registers.append(csvRow);
    }

    public void addObjectRegister(Object obj){
        String csvRow = obj.toString();
        registers.append(csvRow);
    }

    public void write() throws IOException {
        fileWriter.append(registers);
        fileWriter.flush();
        registers.setLength(0);
    }

    public void close() throws IOException{
        fileWriter.close();
    }


    public String createRow(Object[] row){
        String rowString = "";
        for (int i = 0; i < row.length; i++) {
            String csvSymbol = i != row.length - 1 ? "," : "\n";
            rowString += row[i].toString() + csvSymbol;
        }
        return rowString;
    }

}
