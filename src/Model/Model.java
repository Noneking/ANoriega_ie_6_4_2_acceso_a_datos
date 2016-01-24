/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Objects.Client;
import java.awt.Cursor;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nonek
 */
public class Model extends Connection{
    
    private CallableStatement cs;
    
    public Model(){
        
    }
    
    public void insertClient(Client c){
        
    }
    
    public void modifyClient(){
        
    }
    
    public void deleteClient(){
        
    }
    
    public void insertProduct(){
        
    }
    
    public void modifyProduct(){
        
    }
    
    public void deleteProduct(){
        
    }
    
    public void insertLinea_Venta(){
        
    }
    
    public void modifyLinea_Venta(){
        
    }
    
    public void deleteLinea_Venta(){
        
    }
    
    public DefaultTableModel getTableModel(String table){
        DefaultTableModel dtm=new DefaultTableModel();
        try {
            cs=getConnection().prepareCall("{call ?:=TIP_DIRECCION_P_GET_DIRECCIONS()}");
            cs.registerOutParameter(1, Types.REF_CURSOR);
            cs.execute();
            Cursor c=(Cursor) cs.getObject("");
        } catch (SQLException ex) {
            Logger.getLogger(Model.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            closeConnection();
        }
        return dtm;
    }
    
}
