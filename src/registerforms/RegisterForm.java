package registerforms;

import forms.Form;
import forms.ValidationError;
import java.util.Calendar;
import models.Client;
import models.Veterinarian;

public class RegisterForm implements Form {

    private String cedula;
    private String name;
    private String edad;
    private String correo;
    private String telefono;
    private String contrasena;
    private String contrasenaconfirmada;
    private String direccion;
    private int tipo;

    private Client client;
    private Veterinarian veterinarian;
    private boolean isDataValid;
    private String errorMessage;

    //1    constructor para el usuario
    public RegisterForm(String cedula, String name, String edad, String correo,
            String telefono, String contrasena,
            String contrasenaconfirmada, String direccion, int tipo) {
        this.cedula = cedula;
        this.name = name;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.contrasena = contrasena;
        this.contrasenaconfirmada = "";
        this.direccion = direccion;
        this.tipo = tipo;
        isDataValid = true;
        errorMessage = "";
    }
    
    @Override
    public void validate() {
        try {

            validateDataTypes();
            //checkAgeRange();
            //checkEmail();
            //checkPassword();
            //checkSizeAdress();
            //checkSizePhone();
            //checkSizeName();
            //checkSizeId();

        } catch (ValidationError e) {
            isDataValid = false;
            errorMessage = e.toString();
        }
    }

    private void validateDataTypes() throws ValidationError {

        switch (tipo) {

            case 1:
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
                break;

            case 2:
                try {
                    veterinarian = new Veterinarian();
                    veterinarian.setId(cedula);
                    veterinarian.setNombre(name);
                    veterinarian.setEdad(edad);
                    veterinarian.setCorreo(correo);
                    veterinarian.setTelefono(telefono);
                    veterinarian.setContrasena(contrasena);
                    veterinarian.setDireccion(direccion);

                } catch (Exception e) {
                    throw new ValidationError("Tipos invalidos");
                }

                break;

        }

    }

    //validar edad
    private void checkAgeRange() throws ValidationError {

        int edadaux = Integer.parseInt(edad);

        if (edadaux >= 18 && edadaux <= 110) {

        } else {
            throw new ValidationError("Edad Invalida");

        }

    }

    //validar correo
    private void checkEmail() throws ValidationError {
        String email = correo;
        if (email.length() >= 15 && email.length() <= 30) {
            int i = 1, sw = 0;
            do {

                if (email.substring(i, i + 1).equals("@")) {

                    sw++;

                }

                if (email.substring(i, i + 4).equals(".com") || (email.
                        substring(i, i + 3)).equals(".co")) {

                    sw++;

                }

                i++;
            } while (sw < 2 && i < email.length());

            if (sw < 2) {
                throw new ValidationError("Correo invalido");
            }

        } else {
            throw new ValidationError("Correo invalido");
        }

    }

    //validar contraseña
    private void checkPassword() throws ValidationError {
        String password = contrasena;
        String vPassword = contrasenaconfirmada;

        if (password.length() >= 8 && password.length() <= 20) {
          
            if(tipo == 1){
            
            if (!(password.equals(vPassword))) {
                throw new ValidationError("Las contraseñas no coinciden");
            }
            
            }
            

        } else {

            throw new ValidationError("contraseña debil");

        }

    }

    //validar Direccion
    private void checkSizeAdress() throws ValidationError {
        String adress = direccion;
        if (adress.length() >= 15 && adress.length() <= 30) {

        } else {

            throw new ValidationError("Direccion invalida");

        }

    }

    //validar nombre 
    private void checkSizeName() throws ValidationError {
        String namer = name;
        if (namer.length() >= 14 && namer.length() <= 30) {
            int i = 1, sw = 0, seg = 0;
            while (i < namer.length()) {

                if (namer.substring(i, i + 1).equals(" ") && seg >= 3) {
                    sw += 1;

                }

                if (!(namer.substring(i, i + 1).equals(" "))) {
                    seg += 1;

                } else {

                    seg = 0;

                }

            }
            //si sw < 2 eso quiere decir que hay menos de dos especios entre tres caracteres consecutivos 
            if (sw < 2) {
                throw new ValidationError("Nombre invalido");
            }
        } else {

            throw new ValidationError("Nombre invalido");

        }

    }

    //validar telefono
    private void checkSizePhone() throws ValidationError {
        String phone = telefono;
        if (phone.length() >= 7 && phone.length() <= 12) {

        } else {

            throw new ValidationError("Telefono invalido");

        }

    }

    //validar cedula
    private void checkSizeId() throws ValidationError {
        String id = cedula;
        if (id.length() >= 7 && id.length() <= 12) {

        } else {

            throw new ValidationError("Cedula invalida");

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
        return new String[]{
            cedula, 
            name, 
            telefono, 
            direccion, 
            contrasena, 
            correo, 
            edad 
        }; 
       
    }

}
