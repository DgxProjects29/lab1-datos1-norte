package forms.registerforms;

import forms.Form;
import forms.ValidationError;
import models.Client;

public class RegisterForm implements Form {

    private String cedula;
    private String name;
    private String edad;
    private String correo;
    private String telefono;
    private String contrasena;
    private String contrasenaconfirmada;
    private String direccion;

    private Client client;
    private boolean isDataValid;
    private String errorMessage;
    private Validation validation = new Validation();

    // 1 constructor para el usuario
    public RegisterForm(String cedula, String name, String edad, 
            String correo, String telefono, String contrasena,
            String contrasenaconfirmada, String direccion) {

        this.cedula = cedula;
        this.name = name;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.contrasena = contrasena;
        this.contrasenaconfirmada = contrasenaconfirmada;
        this.direccion = direccion;
        isDataValid = true;
        errorMessage = "";
    }

    @Override
    public void validate() {
        try {

            validateDataTypes();
            checkAgeRange();
            checkEmail();
            checkPassword();
            checkSizeAdress();
            checkSizePhone();
            checkSizeName();
            checkSizeId();

        } catch (ValidationError e) {
            isDataValid = false;
            errorMessage = e.toString();
        }
    }

    private void validateDataTypes() throws ValidationError {

        try {
            client = new Client();
            client.setId(cedula);
            client.setNombre(name);
            client.setEdad(edad);
            client.setCorreo(correo);
            client.setTelefono(telefono);
            client.setContrasena(contrasena);
            client.setDireccion(direccion);
        } catch (Exception e) {
            throw new ValidationError("Tipos invalidos");
        }

    }

    // validar edad
    private void checkAgeRange() throws ValidationError {

        int edadaux = Integer.parseInt(edad);

        if (validation.validateNumber(edadaux, 12, 118)) {

        } else {
            throw new ValidationError("Edad Invalida. Para crear una cuenta debes ser mayor de 12 años");

        }

    }

    // validar correo
    private void checkEmail() throws ValidationError {
        if (validation.validateCharField(correo, 4, 40) && validation.isEmail(correo)) {

        } else {

            throw new ValidationError("El correo ingresado no es valido. "
                    + "Por favor, asegurese de escribir un correo"
                    + " entre 17 y 40 caracteres, y que contenga solo un arroba y " + "la terminación '.co' o .'com' ");
        }

    }

    // validar contraseña
    private void checkPassword() throws ValidationError {

        if (validation.validateCharField(contrasena, 8, 17)) {

            if (!(contrasena.equals(contrasenaconfirmada))) {
                throw new ValidationError(
                        "Las contraseñas suministradas no " + "coinciden. Por favor, vuelva a digitarlas");
            }

        } else {

            throw new ValidationError("Contraseña debil. Por favor, revise "
                    + "que las contraseñas tengan más de 7 y menos de 18 " + "caracteres");

        }

    }

    // validar Direccion
    private void checkSizeAdress() throws ValidationError {

        if (validation.validateCharField(direccion, 16, 30)) {

        } else {

            throw new ValidationError(
                    "Direccion invalida. Por favor, percatese de que la dirección suministrada esté entre los 16 y 30 caracteres");

        }

    }

    // validar nombre
    private void checkSizeName() throws ValidationError {

        if (validation.validateCharField(name, 1, 30)) {

        } else {

            throw new ValidationError("Nombre invalido. Por favor, asegurese de "
                    + "que el nombre suministrado se encuentre entre 15 y 30 "
                    + "caracteres. Recuerda que debes ingresar tu nombre completo (nombre y apellidos)");

        }

    }

    // validar telefono
    private void checkSizePhone() throws ValidationError {

        if (validation.validateCharField(telefono, 4, 20)) {

        } else {

            throw new ValidationError("Telefono invalido. Por favor, asegurese"
                    + "que el telefono suministrado se encuentre entre 7 y 13" + "caracteres ");

        }

    }

    // validar cedula
    private void checkSizeId() throws ValidationError {

        if (validation.validateCharField(cedula, 7, 12)) {

        } else {

            throw new ValidationError(" Cedula invalida. Por favor, asegurese "
                    + "que el telefono suministrado se encuentre entre 7 y 12" + "caracteres ");

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
        return new String[] { cedula, name, telefono, direccion, contrasena, correo, edad };

    }

}
