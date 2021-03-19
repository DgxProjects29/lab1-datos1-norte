
package models;


public class PetHistory {

   //atributos
    private String diagnostico;
    private String prescripcion;
    private String appointmentId;

    
    //metodos
    
    //constructores
    public PetHistory(String diagnostico, String prescripcion, String appointmentId){
    
    this.diagnostico = diagnostico; 
    this.prescripcion = prescripcion;
    this.appointmentId = appointmentId;
    
    
    }
     public PetHistory() {
         
    }
     
     //getters and setters
    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getPrescripcion() {
        return prescripcion;
    }

    public void setPrescripcion(String prescripcion) {
        this.prescripcion = prescripcion;
    }

    public String getAppoinmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appoinmentId) {
        this.appointmentId = appoinmentId;
    }
    
    
      public static String[] getColumns(){
        return new String[]{
            "idCita", "prescripcion", "diagnostico"
            
           
        };
    }
     
}
