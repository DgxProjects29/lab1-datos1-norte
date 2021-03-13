package controllers;

import java.io.IOException;

import javax.swing.table.DefaultTableModel;

import pseudofiles.PseudoFile;
import pseudofiles.PseudoFileReader;
import pseudofiles.PseudoFileWriter;

public class SimpleController extends BaseController {

    public SimpleController(DefaultTableModel tableModel, 
        PseudoFile pseudoFile) {
        super(tableModel, pseudoFile);
    }

    @Override
    public void updateTable() throws IOException {

        clearTable();
        
        String[] tableColumns = getColumnsFromTableModel();
        PseudoFileReader pseudoReader = new PseudoFileReader(pseudoFile);

        pseudoReader.readRegister();
        while (!pseudoReader.EFO()){
            
            String[] tableRow = new String[tableColumns.length];
            for (int i = 0; i < tableColumns.length; i++) {
                tableRow[i] = pseudoReader.getField(tableColumns[i]);
            }
            tableModel.addRow(tableRow);

            pseudoReader.readRegister();
        }
        pseudoReader.close();
               
    }

    @Override
    public void reWriteFile() throws IOException{
        
        PseudoFileWriter pseudoFileWriter 
            = new PseudoFileWriter(pseudoFile, false);
        
        int rowCount = tableModel.getRowCount();
        int columnCount = tableModel.getColumnCount();
        for (int i = 0; i < rowCount; i++) {
            String[] csvRow = new String[columnCount];
            for (int j = 0; j < csvRow.length; j++) {
                csvRow[j] = (String)tableModel.getValueAt(i, j);
            }
            pseudoFileWriter.addRegister(csvRow);
        }
        pseudoFileWriter.write();
        pseudoFileWriter.close();
    }
}
