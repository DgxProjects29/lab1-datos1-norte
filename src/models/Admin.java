package models;

public class Admin {

    private String nombre;
    private String contrasena;
    private String correo;
    private String telefono;
    private int id;

    public Admin(int id, String nombre, String correo, 
        String telefono, String contrasena) {

        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.contrasena = contrasena;

    }

    public Admin() {

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

}
