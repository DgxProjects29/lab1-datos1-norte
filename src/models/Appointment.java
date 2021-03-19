
package models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Appointment {
    //atributos
    private String id; 
    private LocalDateTime citainicio;
    private int tipo;
    private String petId;
    private String vetcedula; 
    
    //metodos 
    public Appointment(String id, LocalDateTime citainicio, int tipo, 
            String petId, String vetcedula ){
    this.id = id; 
    this.citainicio = citainicio;
    this.tipo = tipo; 
    this.petId = petId;
    this.vetcedula = vetcedula; 
    
    }
    public Appointment(){
    
    
    }
    
    public String getId(){
    
    return id;
    }
    
    public void setId(String id){
    
        this.id = id;
    }

    public LocalDateTime getCitainicio() {
        return citainicio;
    }

    public void setCitainicio(String citainicio) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd : "
                + "HH:mm:ss"); 
        
        this.citainicio = LocalDateTime.parse(citainicio, formatter);
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = Integer.parseInt(tipo);
    }

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public String getVetcedula() {
        return vetcedula;
    }

    public void setVetcedula(String vetcedula) {
        this.vetcedula = vetcedula;
    }
    
     public static String[] getColumns(){
        return new String[]{
           "idCita", "tipoCita", "empieza","idMascota", "cedVet"
           
        };
    }
    
    
}
