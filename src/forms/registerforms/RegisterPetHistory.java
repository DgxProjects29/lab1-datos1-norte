package forms.registerforms;

import forms.Form;
import forms.ValidationError;
import models.PetHistory;

public class RegisterPetHistory implements Form {

   // atributos
    private String diagnostico;  // validar size
    private String prescripcion; // validar size
    private String appointmentId; // no validar

    private PetHistory petHistory;
    private boolean isDataValid;
    private String errorMessage;
    private Validation validation = new Validation();

    //metodos
    public RegisterPetHistory(String diagnostico, String prescripcion, String appointmentId) {

        this.diagnostico = diagnostico;
        this.prescripcion = prescripcion;
        this.appointmentId = appointmentId;
        isDataValid = true;
        errorMessage = "";
    }

    @Override
    public void validate() {
        try {

            validateDataTypes();
            checkSizeDiagnosis();
            checkSizePrescripcion(); 
            
            

        } catch (ValidationError e) {
            isDataValid = false;
            errorMessage = e.toString();
        }
    }

    private void validateDataTypes() throws ValidationError {

        try {
            petHistory = new PetHistory();
            petHistory.setDiagnostico(diagnostico); // creo que no hay que validarlo
            petHistory.setPrescripcion(prescripcion);
            petHistory.setAppointmentId(appointmentId);
            

        } catch (Exception e) {
            throw new ValidationError("Tipos invalidos");
        }

    }

    //metodos adicionales 
    
     private void checkSizeDiagnosis()throws ValidationError{
    if(validation.validateCharField(diagnostico, 10, 300)){
    
    }else{
    
    throw new ValidationError("Diagnostico invalidos. Recuerda que la cantidad de caracteres debe estar entre 10 y 300");
    }
    
     }
    
     private void checkSizePrescripcion() throws ValidationError {
      if(validation.validateCharField(prescripcion, 10, 300)){
    
    }else{
    
    throw new ValidationError("Prescripción invalida. Recuerda que la cantidad de caracteres debe estar entre 10 y 300");
    }   
    
    
     }
    
    
    @Override
    public boolean isDataValid() {
        return isDataValid;
    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public String[] getValidRegister() {
        return new String[]{diagnostico, prescripcion, appointmentId};
    }

}
