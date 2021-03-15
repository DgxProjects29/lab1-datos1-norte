package forms;

import java.io.IOException;

import inevaup.dialogs.InfoDialog;
import inevaup.dialogs.InfoDialog.TypeInfoDialog;
import pseudofiles.PseudoFile;
import pseudofiles.PseudoFileWriter;

public class PseudoWriterForm{

    private final Form form;
    private final PseudoFile pseudoFile;

    public PseudoWriterForm(Form form, PseudoFile pseudoFile) {
        this.form = form;
        this.pseudoFile = pseudoFile;
    }

    public void writeRegister(){
        form.validate();
        if (form.isDataValid()){
            try {
                PseudoFileWriter pseudoFileWriter 
                    = new PseudoFileWriter(pseudoFile, true);
                pseudoFileWriter.addRegister(form.getValidRegister());
                pseudoFileWriter.write();
                pseudoFileWriter.close();
                validFormDialog();
            } catch (IOException e) {
                fileExceptionDialog();
            }
        }else{
            invalidFormDialog();
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
            "El registro fue creado exitosamente", TypeInfoDialog.ERROR_DIALOG
        );
        dialog.setVisible(true);
    }
    
}