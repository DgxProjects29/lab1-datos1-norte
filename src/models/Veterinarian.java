
package models;

public class Veterinarian {

    private String id;
    private String nombre;
    private int edad;
    private String correo;
    private String telefono;
    private String contrasena;
    private String direccion;

    public Veterinarian(String id, String nombre, int edad, String correo,
        String telefono, String contrasena, String direccion) {
        
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.contrasena = contrasena;
        this.direccion = direccion;

    }

    public Veterinarian() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getCorreo() {
        return correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public static String[] getColumns(){
        return new String[]{
            "cedula",
            "nombre",
            "telefono",
            "direccion",
            "contraseña",
            "correo",
            "edad"
        };
    }

}
