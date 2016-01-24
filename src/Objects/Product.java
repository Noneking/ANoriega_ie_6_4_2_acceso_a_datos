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
public class Product {
    
    private int id;
    private String description;
    private String pvp;
    private int stock;
    
    public Product(int id, String descripcion, String pvp, int stock){
        this.id=id;
        this.description=descripcion;
        this.pvp=pvp;
        this.stock=stock;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getPvp() {
        return pvp;
    }

    public int getStock() {
        return stock;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPvp(String pvp) {
        this.pvp = pvp;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
