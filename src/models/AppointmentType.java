
package models;


public class AppointmentType {
   //atributos
    private int tipo;
    private String name;
    private int tiempo;
    private Double preciohora;
    private Double price; 
    
    
    
    //metodos
    
    public AppointmentType(int tipo, String name, int tiempo, 
            Double preciohora, Double price){
    this.tipo = tipo;
    this.name = name;
    this.tiempo = tiempo; 
    this.preciohora = preciohora; 
    this.price = price;
    
    
    }
    
     public AppointmentType(){
    
    
    
    }
    

    public int getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = Integer.parseInt(tipo);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = Integer.parseInt(tiempo);
    }

    public Double getPreciohora() {
        return preciohora;
    }

    public void setPreciohora(String preciohora) {
        this.preciohora = Double.parseDouble(preciohora);
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = Double.parseDouble(price);
    }
    
    public static String[] getColumns(){
        return new String[]{
           "tipo", "nombre", "precioHora", "precio"
           
        };
    }
    
    
}
