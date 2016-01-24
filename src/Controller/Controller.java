/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author nonek
 */
public class Controller implements ActionListener{
    
    Main v;
    
    public Controller(Main v){
        initViews(v);
        initListeners();
        initOperations();
    }
    
    public void initViews(Main v){
        this.v=v;
        this.v.setVisible(true);
    }
    
    public void initListeners(){
        //INSERT
        this.v.jButtonInsert.addActionListener(this);
        this.v.jButtonInsert.setActionCommand("INSERT");
        
        //UPDATE
        this.v.jButtonModify.addActionListener(this);
        this.v.jButtonModify.setActionCommand("MODIFY");
        
        //DELETE
//        this.v.jToggleButtonDelete.addActionListener(this);
//        this.v.jToggleButtonDelete.setActionCommand("DELETE");
        
    }
    
    public void initOperations(){
        
    }
    
    public enum POS{
        CLIENTE,
        PRODUCTO,
        LINEA_VENTA
    }
    
    public enum ACTIONS{
        INSERT,
        MODIFY,
        DELETE
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
