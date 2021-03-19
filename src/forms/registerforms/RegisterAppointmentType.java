package forms.registerforms;

import forms.Form;
import forms.ValidationError;
import models.AppointmentType;

public class RegisterAppointmentType implements Form {
    
     //lo maneja el admin para crear tipos de citas
    
    //atributos
    private String tipo;    // validar
    private String name;    // validar
    private String tiempo;   // validar
    private String preciohora; // validar
    private String price; //validar

    private AppointmentType appointmentType;
    private boolean isDataValid;
    private String errorMessage;
    private Validation validation = new Validation();

    public RegisterAppointmentType(String tipo, String name, String tiempo,
            String preciohora, String price) {
        this.tipo = tipo;
        this.name = name;
        this.tiempo = tiempo;
        this.preciohora = preciohora;
        this.price = price;
        isDataValid = true;
        errorMessage = "";
    }

    @Override
    public void validate() {
        try {

            validateDataTypes();
           
            checkSizeName();
            checkDuration(); 
            checkPricePerExecution(); 
            checkPrice();
           

        } catch (ValidationError e) {
            isDataValid = false;
            errorMessage = e.toString();
        } 
    }

    private void validateDataTypes() throws ValidationError {

        try {
            appointmentType = new AppointmentType();
            appointmentType.setTipo(tipo); // creo que no hay que validarlo
            appointmentType.setName(name);
            appointmentType.setTiempo(tiempo);
            appointmentType.setPreciohora(preciohora);
            appointmentType.setPrice(price);

        } catch (Exception e) {
            throw new ValidationError("Tipos invalidos");
        }

    }

    /*
     private String tipo;
     private String name;
     private String tiempo;
     private String preciohora;
     private String price;
     */
    // en espera
    
    
//     private void checkType() throws ValidationError, FileNotFoundException, 
//             IOException {
//         
////          boolean tipovalido = false;
////          int mayor = 1;
////          
////         PseudoFile pseudoFile = new PseudoFile(
////            new File("data/servicios.csv"), 
////            new String[]{"tipo", "nombre", "tiempo", "preciohora", "precio"}
////        );
////        try {
////            //Abrir archivo en modo lectura
////            PseudoFileReader pseudoReader = new PseudoFileReader(pseudoFile);
////            
////            pseudoReader.readRegister();
////            while (!pseudoReader.EFO()){
////                
////                if(Integer.parseInt(pseudoReader.getField("tipo")) > mayor){
////                mayor = Integer.parseInt(pseudoReader.getField("tipo"));
////                
////                }
////                 
////               
////                pseudoReader.readRegister();
////            }
////            pseudoReader.close();
////            
////            tipovalido = mayor < Integer.parseInt(tipo); 
////        } catch (IOException e) {
////            System.out.println(e);
////        }
//      
//        if(tipovalido){
//        
//        
//        } else {
//            
//            throw new ValidationError("No pueden haber dos tipos de servicio con"
//                    + " el mismo numero");
//        
//        
//        }
//       
//   
//    }
    
    
    private void checkSizeName() throws ValidationError {

        if (validation.validateCharField(name, 4, 40)) {

        } else {

            throw new ValidationError("Nombre invalido. Por favor, asegurese de "
                    + "que el nombre suministrado se encuentre entre 4 y 40 "
                    + "caracteres." );

        }

    }
     
    private void checkDuration() throws ValidationError {

        //1440 minutos es el equivalente a un día 
        
        if (validation.validateNumber(Integer.parseInt(tiempo), 30, 1440)) {

        } else {

            throw new ValidationError("Duracíon invalida. Recuerda que una cita "
                    + "tiene que estar entre 30 y 1440 minutos (osea un dia)" );

        }

    }
    
    private void checkPricePerExecution() throws ValidationError {

        //1440 minutos es el equivalente a un día 
        
        if (validation.validateDoubleField(Double.parseDouble(preciohora), 10000.0, 200000.0 )) {

        } else {

            throw new ValidationError("Precio invalido. Recuerda que una cita "
                    + "tiene que costar entre 10k y 200k pesos" );

        }

    }
    
    
    private void checkPrice() throws ValidationError {

        //1440 minutos es el equivalente a un día 
        
        if (validation.validateDoubleField(Double.parseDouble(price), 10000.0, 200000.0 )) {

        } else {

          throw new ValidationError("Precio invalido. Recuerda que una cita "
                    + "tiene que costar entre 10k y 200k pesos" );

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
        return new String[]{tipo, name, tiempo, preciohora, price};
    }

}
