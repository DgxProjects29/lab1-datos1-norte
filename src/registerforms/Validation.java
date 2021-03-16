package registerforms;

public class Validation {

  // atributos
    // metodos 
    public boolean validateCharField(String value, int min, int max) {

      
            return value.length() >= min && value.length() <= max;
       

    }

    public boolean validateIntegerField(int value, int min, int max) {

       
            return value >= min && value <= max;
        

    }

    public boolean validateIntegerField(Double value, Double min, Double max) {

      
            return value >= min && value <= max;
        
        
    }
        
        

    public boolean isaEmail(String email) {
        int i = 0, sw = 0;
       

      
            return email.contains("@") && ( email.contains(".co") || email.contains(".com"));
            
        
    }

}


