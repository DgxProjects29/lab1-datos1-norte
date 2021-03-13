package registerforms;

import forms.Form;
import forms.ValidationError;
import java.util.Random;
import models.Pet;

public class RegisterPet implements Form {

    private String nombre;
    private String raza;
    private String color;
    private String birthday;
    private String clientid;

    private Pet pet;
    private boolean isDataValid;
    private String errorMessage;

    
    public RegisterPet(String nombre, String raza,
            String color, String birthday,
            String clientid) {
        
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.birthday = birthday;
        this.clientid = clientid;

        isDataValid = true;
        errorMessage = "";
    }

    private void validateDataTypes() throws ValidationError {

        try {
            pet = new Pet();

            pet.setNombre(nombre);
            pet.setRaza(raza);
            pet.setColor(color);
            pet.setBirthday(birthday);
            pet.setClientid(clientid);

        } catch (Exception e) {
            throw new ValidationError("Tipos invalidos");
        }

    }

    @Override
    public void validate() {

        try {

            validateDataTypes();
            checkSizeName();
            checkRaza();
            checkColor();

        } catch (ValidationError e) {
            isDataValid = false;
            errorMessage = e.toString();
        }
    }
    
 
    private String createId(){
       Random random = new Random(); 
        
        int randomnumber = random.nextInt(256);
        char sigla;
        String id = "";
        
        for (int i = 0; i < 5; i++) {
            sigla = (char)randomnumber;
            
            id = id + sigla;
            
        }
       
        return id;
    
    
    
    }
    
     private void checkRaza() throws ValidationError {

        if (raza.length() >= 8 && raza.length() <= 30) {

        } else {
            throw new ValidationError("Raza Invalida");

        }

    }

    private void checkColor() throws ValidationError {

        if (color.length() >= 4 && color.length() <= 15) {

        } else {
            throw new ValidationError("Raza Invalida");

        }

    }
      private void checkSizeName() throws ValidationError {
        String namer = nombre;
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
        return new String[]{createId(), nombre, raza, 
            color, birthday, clientid};
    }

}
