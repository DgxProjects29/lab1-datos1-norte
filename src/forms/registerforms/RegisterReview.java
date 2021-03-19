package forms.registerforms;

import forms.Form;
import forms.ValidationError;

import models.Review;

public class RegisterReview implements Form {
    // atributos

    private String estrellas; // no validar
    private String detalles; // validar size
    private String clientId; // no validar 
    private String vetcedula; //no validar

    private Review review;
    private boolean isDataValid;
    private String errorMessage;
    private Validation validation = new Validation();

    //metodos
    public RegisterReview(String estrellas, String detalles, String clientId,
            String vetcedula) {

        this.estrellas = estrellas;
        this.detalles = detalles;
        this.clientId = clientId;
        this.vetcedula = vetcedula;
        isDataValid = true;
        errorMessage = "";
    }

    @Override
    public void validate() {
        try {

            validateDataTypes();
            checkSizeDetails();

        } catch (ValidationError e) {
            isDataValid = false;
            errorMessage = e.toString();
        }
    }

    private void validateDataTypes() throws ValidationError {

        try {
            review = new Review();
            review.setEstrellas(estrellas); // creo que no hay que validarlo
            review.setDetalles(detalles);
            review.setClientId(clientId);
            review.setVetcedula(vetcedula);

        } catch (Exception e) {
            throw new ValidationError("Tipos invalidos");
        }

    }

    //metodos adicionales 
    
    private void checkSizeDetails()throws ValidationError{
    if(validation.validateCharField(detalles, 10, 200)){
    
    }else{
    
    throw new ValidationError("Detalles invalidos. Recuerda que la cantidad de caracteres debe estar entre 10 y 200");
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
        return new String[]{estrellas, detalles, clientId, vetcedula};
    }

}
