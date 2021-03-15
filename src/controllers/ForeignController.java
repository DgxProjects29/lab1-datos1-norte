package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import pseudofiles.PseudoFile;
import pseudofiles.PseudoFileReader;
import pseudofiles.PseudoFileWriter;

public class ForeignController extends BaseController {

    private String foreignKey;
    private String foreignColumn;

    //dont show the key in tablemodel
    public ForeignController(DefaultTableModel tableModel, 
        PseudoFile pseudoFile,
        String foreignColumn,
        String foreignKey) {

        super(tableModel, pseudoFile);
        this.foreignColumn = foreignColumn;
        this.foreignKey = foreignKey;
    }

    @Override
    public void updateTable() throws IOException {
        
        clearTable();
        
        String[] tableColumns = getColumnsFromTableModel();
        PseudoFileReader pseudoReader = new PseudoFileReader(pseudoFile);

        pseudoReader.readRegister();
        while (!pseudoReader.EFO()){

            if (pseudoReader.getField(foreignColumn).equals(foreignKey)){

                String[] tableRow = new String[tableColumns.length];
                for (int i = 0; i < tableColumns.length; i++) {
                    tableRow[i] = pseudoReader.getField(tableColumns[i]);
                }
                tableModel.addRow(tableRow);

            }

            pseudoReader.readRegister();
        }
        pseudoReader.close();
    }

    @Override
    public void reWriteFile() throws IOException {
        ArrayList<String[]> tempRegisters = new ArrayList<>();
        
        PseudoFileReader pseudoReader = new PseudoFileReader(pseudoFile);

        pseudoReader.readRegister();
        while (!pseudoReader.EFO()){
            if (!pseudoReader.getField(foreignColumn).equals(foreignKey)){
                tempRegisters.add(pseudoReader.getCurrRow());
            }

            pseudoReader.readRegister();
        }
        pseudoReader.close();

        PseudoFileWriter pseudoFileWriter 
            = new PseudoFileWriter(pseudoFile, false);

        for (String[] register : tempRegisters) {
            pseudoFileWriter.addRegister(register);
        }
        
        int rowCount = tableModel.getRowCount();
        int columnCount = tableModel.getColumnCount();
        for (int i = 0; i < rowCount; i++) {
            String[] csvRow = new String[columnCount + 1];
            for (int j = 0; j < columnCount; j++) {
                csvRow[j] = (String)tableModel.getValueAt(i, j);
            }
            csvRow[csvRow.length - 1] = foreignKey;
            pseudoFileWriter.addRegister(csvRow);
        }
        pseudoFileWriter.write();
        pseudoFileWriter.close();
    }

    
    
}
