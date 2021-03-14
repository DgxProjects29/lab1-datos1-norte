package forms;

import java.io.IOException;

import inevaup.dialogs.InfoDialog;
import inevaup.dialogs.InfoDialog.TypeInfoDialog;
import pseudofiles.PseudoFile;
import pseudofiles.PseudoFileWriter;

public class PseudoWriterForm{

    private Form form;
    private PseudoFile pseudoFile;

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
            } catch (IOException e) {
                fileExceptionDialog();
            }
        }else{
            invalidFormDialog();
        }
    }

    private void fileExceptionDialog(){
        InfoDialog dialog = new InfoDialog(null, "Error", 
            "Un error inesperado acaba de ocurrir", TypeInfoDialog.ERROR_DIALOG
        );
        dialog.setVisible(true);
    }

    private void invalidFormDialog(){
        InfoDialog dialog = new InfoDialog(null, "Error", 
            form.getErrorMessage(), TypeInfoDialog.ERROR_DIALOG
        );
        dialog.setVisible(true);
    }
    
}