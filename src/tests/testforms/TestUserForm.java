package tests.testforms;

import forms.Form;
import forms.ValidationError;
import tests.tesmodels.MyUser;

public class TestUserForm implements Form {

    private String cedula;
    private String name;
    private String edad;

    private MyUser myUser;
    private boolean isDataValid;
    private String errorMessage;

    public TestUserForm(String cedula, String name, String edad) {
        this.cedula = cedula;
        this.name = name;
        this.edad = edad;

        isDataValid = true;
        errorMessage = "";
    }

    @Override
    public void validate() {
        try {
            validateDataTypes();
            checkAgeRange();
        } catch (ValidationError e) {
            isDataValid = false;
            errorMessage = e.toString();
        }
    }

    private void validateDataTypes() throws ValidationError{

        try {
            myUser = new MyUser();
            myUser.setId(cedula);
            myUser.setNombre(name);
            myUser.setEdad(edad);
        } catch (Exception e) {
            throw new ValidationError("Tipos invalidos");
        }
    }

    private void checkAgeRange() throws ValidationError{
     
        
        
        
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
        return null;
        //return new String[]{cedula, name}
    }
    

}
