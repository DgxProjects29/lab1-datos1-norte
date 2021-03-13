package tests.tesmodels;

public class MyUser {

    private int id;
    private String nombre;
    private int edad;
    private String correo; 
    private String telefono;
    private String contrasena;
    private String direccion; 
    
    public MyUser(int id, String nombre, int edad, String correo, String telefono, 
            String contrasena, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public MyUser() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(String id) {
        this.id = Integer.parseInt(id);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = Integer.parseInt(edad);
    }
    
    

    public void setCorreo(String correo) {
      this.correo = correo;  
    }
    
    public String getCorreo (){
    
    return correo;
   }

    public void setTelefono(String telefono) {
       this.telefono = telefono;
    }
    
    public String getTelefono(){
    
    return telefono;
    }

    public void setContrasena(String contrasena) {
      this.contrasena = contrasena;
    }
    
    public String getContrasena(){
    
    return contrasena;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion; 
    }
    
    public String getDireccion(){
    return direccion;
    }
    
}
