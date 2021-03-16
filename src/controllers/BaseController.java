package controllers;

import java.io.IOException;
import java.util.HashMap;

import javax.swing.table.DefaultTableModel;
import pseudofiles.PseudoFile;

public abstract class BaseController {

    protected DefaultTableModel tableModel;
    protected PseudoFile pseudoFile;

    public BaseController(DefaultTableModel tableModel, PseudoFile pseudoFile) {
        this.pseudoFile = pseudoFile;
        this.tableModel = tableModel;
    }

    public abstract void updateTable() throws IOException;

    public abstract void reWriteFile() throws IOException;

    protected String[] getColumnsFromTableModel() {
        int columnLenght = this.tableModel.getColumnCount();
        String[] columns = new String[columnLenght];
        for (int i = 0; i < columnLenght; i++) {
            columns[i] = this.tableModel.getColumnName(i);
        }
        return columns;
    }

    protected void clearTable() {

        int rows = tableModel.getRowCount();
        for (int i = 0; i < rows; i++) {
            tableModel.removeRow(0);
        }
    }

    public HashMap<String, String> getDataFromRow(int row){
        int columnLenght = this.tableModel.getColumnCount();
        HashMap<String, String> data = new HashMap<>();
        for (int i = 0; i < columnLenght; i++) {
            data.put(
                this.tableModel.getColumnName(i), 
                (String)this.tableModel.getValueAt(row, i)
            );
        }
        return data;
    }

    public DefaultTableModel getTableModel(){
        return tableModel;
    }
    
    public PseudoFile getPseudoFile(){
        return pseudoFile;
    }
}
