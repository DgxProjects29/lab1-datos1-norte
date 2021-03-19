package forms.registerforms;

import forms.Form;
import forms.ValidationError;
import java.util.Random;
import models.Appointment;

public class RegisterAppointment implements Form {
    // atributos

    private String id;  // generado por el sistema; no se valida
    private String citainicio;  // no validar
    private String tipo;  // no validar
    private String petId; // no validar
    private String vetcedula; // no validar 

    private Appointment appointment;
    private boolean isDataValid;
    private String errorMessage;
    private Validation validation = new Validation();

    //metodos
    public RegisterAppointment( String citainicio, String tipo,
            String petId, String vetcedula) {

        this.id = createId();
        this.citainicio = citainicio;
        this.tipo = tipo;
        this.petId = petId;
        this.vetcedula = vetcedula;
        isDataValid = true;
        errorMessage = "";
    }
    
    public RegisterAppointment(String id, String citainicio, String tipo,
            String petId, String vetcedula) {

        this.id = id;
        this.citainicio = citainicio;
        this.tipo = tipo;
        this.petId = petId;
        this.vetcedula = vetcedula;
        isDataValid = true;
        errorMessage = "";
    }

    @Override
    public void validate() {
        try {

            validateDataTypes();

        } catch (ValidationError e) {
            isDataValid = false;
            errorMessage = e.toString();
        }
    }

    private void validateDataTypes() throws ValidationError {

        try {
            appointment = new Appointment();
            appointment.setId(id); 
            appointment.setCitainicio(citainicio);
            appointment.setPetId(petId);
            appointment.setVetcedula(vetcedula);

        } catch (Exception e) {
            throw new ValidationError("Tipos invalidos");
        }

    }
    
    //metodos adicionales 
     private String createId(){
       Random random = new Random(); 
        
        String id = "";
        
        for (int i = 0; i < 5; i++) {
            int randomnumber = random.nextInt(93) + 33;
            char sigla;
            sigla = (char)randomnumber;
            
            id = id + sigla;
            
        }
       
        return id;
    
    
    
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
        return new String[]{id, citainicio, tipo, petId, vetcedula};
    }

}
