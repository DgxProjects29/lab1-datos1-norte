package controllers;

import java.io.IOException;

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
    
}
