
package models;


public class Review {
   
    //atributos 
   private int estrellas; 
   private String detalles; 
   private String clientId;
   private String vetcedula;
   
   //metodos
   
   public Review(int estrellas, String detalles, String clientId, String vetcedula){
   this.estrellas = estrellas;
   this.detalles = detalles; 
   this.clientId = clientId;
   this.vetcedula = vetcedula; 
   
   }

  
   public Review(){
   
   
   }
   
   public int getEstrellas(){
   return estrellas;
   
   }
   
   public void setEstrellas(String estrellas){
   this.estrellas = Integer.parseInt(estrellas); 
   }
   
   public String getDetalles(){
   return detalles;
   
   }
   
   public void setDetalles(String detalles){
   this.detalles = detalles; 
   }
     public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getVetcedula() {
        return vetcedula;
    }

    public void setVetcedula(String vetcedula) {
        this.vetcedula = vetcedula;
    }
    
    
      public static String[] getColumns(){
        return new String[]{
            "estrellas",
            "detalles",
            "clientCed",
            "cedVet"
           
        };
    }
}
