
package models;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pet {

    private String nombre;
    private String raza;
    private String color;
    private Date birthday;
    private String id;
    private String clientid;

    public Pet(String nombre, String raza, String id, String color, 
        Date birthday, String clientid, int edad) {

        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.birthday = birthday;
        this.clientid = clientid;

    }

    public Pet() {

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

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setBirthday(String birthday) throws ParseException {
        DateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");
        Date birth = fecha.parse(birthday);
        this.birthday = birth;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid;
    }

    public String getClientid() {
        return clientid;
    }

    public static String[] getColumns(){
        return new String[]{
            "petId",
            "nombre",
            "raza",
            "color",
            "nacimiento",
            "clientCed"
        };
    }

}
