package forms;

import java.io.IOException;

import controllers.BaseController;
import inevaup.dialogs.InfoDialog;
import inevaup.dialogs.InfoDialog.TypeInfoDialog;

public class FormViewHandler {
    
    private final Form form;
    private final BaseController baseController;

    public FormViewHandler(Form form, BaseController baseController) {
        this.form = form;
        this.baseController = baseController;
    }

    public void writeRegister(){
        form.validate();
        if (form.isDataValid()){
            baseController.getTableModel().addRow(form.getValidRegister());
            reWriteFile();
        }else{
            invalidFormDialog();
        }
    }

    public void updateRegister(int row){
        form.validate();
        if (form.isDataValid()){
            int columnLenght = baseController.getTableModel().getColumnCount();
            String[] register = form.getValidRegister();
            for (int i = 0; i < columnLenght; i++) {
                baseController.getTableModel()
                    .setValueAt(register[i], row, i);
            }
            reWriteFile();
        }else{
            invalidFormDialog();
        }
    }
    
    private void reWriteFile(){
        try {
            baseController.reWriteFile();
            validFormDialog();
        } catch (IOException e) {
            fileExceptionDialog();
        }
    }
    
    private void fileExceptionDialog(){
        InfoDialog dialog = new InfoDialog(null, "Error", 
            "Lo sentimos un error inesperado acaba de ocurrir", TypeInfoDialog.ERROR_DIALOG
        );
        dialog.setVisible(true);
    }

    private void invalidFormDialog(){
        InfoDialog dialog = new InfoDialog(null, "Error en el formulario", 
            form.getErrorMessage(), TypeInfoDialog.ERROR_DIALOG
        );
        dialog.setVisible(true);
    }
    
    private void validFormDialog(){
        InfoDialog dialog = new InfoDialog(null, "Éxito", 
            "El registro fue creado/actualizado exitosamente", TypeInfoDialog.SUCCESS_DIALOG
        );
        dialog.setVisible(true);
    }
}
