
package models;

public class Provider {

    private String codigo;
    private String name;
    private String email;
    private String telefono;

    public Provider(String codigo, String name, String email, 
        String telefono) {

        this.codigo = codigo;
        this.name = name;
        this.email = email;
        this.telefono = telefono;
    }

    public Provider() {

    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;

    }

    public String getCodigo() {
        return codigo;

    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;

    }

    public void setEmail(String email) {
        this.email = email;

    }

    public String getEmail() {
        return email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }
    
    public static String[] getColumns(){
        return new String[]{
            "codigo",
            "nombre",
            "email",
            "telefono"
        };
    }

}