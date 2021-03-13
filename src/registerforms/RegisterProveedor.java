package registerforms;

import forms.Form;
import forms.ValidationError;
import models.Proveedor;

public class RegisterProveedor implements Form {

    private String codigo;
    private String name;
    private String correo;
    private String telefono;

    private Proveedor proveedor;
    private boolean isDataValid;
    private String errorMessage;

    public RegisterProveedor(String codigo, String name, String correo,
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
            proveedor = new Proveedor();
            proveedor.setCodigo(codigo);
            proveedor.setName(name);
            proveedor.setEmail(correo);
            proveedor.setTelefono(telefono);
        } catch (Exception e) {
            throw new ValidationError("Tipos invalidos");
        }

    }
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
            //si sw < 2 eso quiere decir que hay menos de dos especios entre 
            //tres caracteres consecutivos 
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
