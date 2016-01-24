/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.util.ArrayList;

/**
 *
 * @author nonek
 */
public class Client {
    
    private int id;
    private String nombre;
    private Address direccion;
    private String nif;
    private ArrayList<String> telefonos;
    
    public Client(int id, String nombre, Address direccion, String nif, ArrayList<String> telefonos){
        this.id=id;
        this.nombre=nombre;
        this.direccion=direccion;
        this.nif=nif;
        this.telefonos=telefonos;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Address getDireccion() {
        return direccion;
    }

    public String getNif() {
        return nif;
    }

    public ArrayList<String> getTelefonos() {
        return telefonos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(Address direccion) {
        this.direccion = direccion;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setTelefonos(ArrayList<String> telefonos) {
        this.telefonos = telefonos;
    }
    
}
