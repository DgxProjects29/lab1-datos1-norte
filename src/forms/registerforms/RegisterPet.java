package forms.registerforms;

import forms.Form;
import forms.ValidationError;
import java.util.Random;
import models.Pet;

public class RegisterPet implements Form {

    private String petId;
    private String nombre;
    private String raza;
    private String color;
    private String birthday;

    private Pet pet;
    private boolean isDataValid;
    private String errorMessage;
    private Validation validation = new Validation();

    
    public RegisterPet(String nombre, String raza,
            String color, String birthday) {
        
        this.petId = createId();
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.birthday = birthday;

        isDataValid = true;
        errorMessage = "";
    }

    public RegisterPet(String petId, String nombre, String raza,
            String color, String birthday) {
        
        this.petId = petId;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.birthday = birthday;

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
        
        String id = "";
        
        for (int i = 0; i < 5; i++) {
            int randomnumber = random.nextInt(93) + 33;
            if (randomnumber == 44){
                randomnumber++;
            }
            char sigla;
            sigla = (char)randomnumber;
            
            id = id + sigla;
            
        }
       
        return id;
    
    
    
    }
    
     private void checkRaza() throws ValidationError {

        if (validation.validateCharField(raza, 1, 50)) {

        } else {
            throw new ValidationError("Raza Invalida. Por favor, asegurese de "
                    + "que la raza suministrada se encuentre entre 3 y 20"
                    + "caracteres");

        }

    }

    private void checkColor() throws ValidationError {

        if (validation.validateCharField(color, 1, 25)) {

        } else {
            throw new ValidationError("Color Invalido. El color suministrado "
                    + "debe estar entre 4 y 12 caracteres");

        }

    }
      private void checkSizeName() throws ValidationError {
       
        if (validation.validateCharField(nombre, 3, 50)) {
            
        } else {

            throw new ValidationError("Nombre invalido. El nombre sumministrado "
                    + "debe estar entre 3 y 14 caracteres. Recuerda, solo es un nombre como: coco o panelita ");

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
        return new String[]{petId, nombre, raza, 
            color, birthday};
    }

}
