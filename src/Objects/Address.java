/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author nonek
 */
public class Address {
    
    private int id;
    private String calle;
    private String poblacion;
    private int codPostal;
    private String provincia;
    
    public Address(int id, String calle, String poblacion, int codPostal, String provincia){
        this.id=id;
        this.calle=calle;
        this.poblacion=poblacion;
        this.codPostal=codPostal;
        this.provincia=provincia;
    }

    public int getId() {
        return id;
    }

    public String getCalle() {
        return calle;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
}
