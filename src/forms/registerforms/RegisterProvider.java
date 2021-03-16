package forms.registerforms;

import forms.Form;
import forms.ValidationError;
import models.Provider;

public class RegisterProvider implements Form {

    private String codigo;
    private String name;
    private String correo;
    private String telefono;

    private Provider proveedor;
    private boolean isDataValid;
    private String errorMessage;

    private Validation validation = new Validation();

    public RegisterProvider(String codigo, String name, String correo,
            String telefono) {
        this.codigo = codigo;
        this.name = name;
        this.correo = correo;
        this.telefono = telefono;

        isDataValid = true;
        errorMessage = "";
    }

    @Override
    public void validate() {
        try {
            validateDataTypes();
            checkSizeCode();
            checkSizeName();
            checkEmail();
            checkSizePhone();

        } catch (ValidationError e) {
            isDataValid = false;
            errorMessage = e.toString();
        }

    }

    private void validateDataTypes() throws ValidationError {

        try {
            proveedor = new Provider();
            proveedor.setCodigo(codigo);
            proveedor.setName(name);
            proveedor.setEmail(correo);
            proveedor.setTelefono(telefono);
        } catch (Exception e) {
            throw new ValidationError("Tipos invalidos");
        }

    }

    private void checkSizeName() throws ValidationError {

        if (validation.validateCharField(name, 1, 30)) {

        } else {

             throw new ValidationError("Nombre invalido. Por favor, asegurese de "
                    + "que el nombre suministrado se encuentre entre 15 y 30 "
                    + "caracteres. Recuerda que debes ingresar tu nombre completo (nombre y apellidos)");

        }

    }

    //validar telefono
    private void checkSizePhone() throws ValidationError {
        
        if (validation.validateCharField(telefono, 4, 20)) {

        } else {

           throw new ValidationError("Telefono invalido. Por favor, asegurese"
                    + "que el telefono suministrado se encuentre entre 7 y 13"
                    + "caracteres ");

        }

    }

    //validar correo

    private void checkEmail() throws ValidationError {
          if(validation.validateCharField(correo, 4, 40) &&  
                validation.isEmail(correo)){
        
        } else {
        
        throw new ValidationError("El correo ingresado no es valido. "
                + "Por favor, asegurese de escribir un correo"
                + " entre 17 y 40 caracteres, y que contenga solo un arroba y "
                + "la terminación '.co' o .'com' ");
        }

    }
    
    //validar el tamaño del codigo 
    
    private void checkSizeCode() throws ValidationError {
      
        if (validation.validateCharField(codigo, 1, 50)) {
           
        } else {

            throw new ValidationError("Codigo invalido. Por favor, asegurese de "
                    + "que el codigo suministrado se encuentre entre 1 y 50 caracteres. ");

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
        return new String[]{codigo, name, correo, telefono};
    }

}
