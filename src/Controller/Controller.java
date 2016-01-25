/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model;
import Objects.Address;
import Objects.Client;
import View.Main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author nonek
 */
public class Controller implements ActionListener{
    
    Main v;
    Model model;
    
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
        
        //CHECK CONNECTION
        this.v.jButtonCheckConnection.addActionListener(this);
        this.v.jButtonCheckConnection.setActionCommand("CHECK_CONNECTION");
        
    }
    
    public void initOperations(){
        model=new Model();
    }
    
    public enum POS{
        CLIENTE,
        PRODUCTO,
        LINEA_VENTA
    }
    
    public enum ACTIONS{
        INSERT,
        MODIFY,
        DELETE,
        CHECK_CONNECTION
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(Controller.ACTIONS.valueOf(e.getActionCommand())){
            case INSERT:
                ArrayList<String> telefonos=new ArrayList<>();
                telefonos.add(this.v.jTextFieldClientPhone1.getText());
                telefonos.add(this.v.jTextFieldClientPhone2.getText());
                telefonos.add(this.v.jTextFieldClientPhone3.getText());
                model.insertClient(new Client(0, this.v.jTextFieldClientName.getText(), new Address(0, this.v.jTextFieldAddressStreet.getText(), this.v.jTextFieldAddressCity.getText(), Integer.parseInt(this.v.jTextFieldAddressPostalCode.getText()), this.v.jTextFieldAddressProvince.getText()), this.v.jTextFieldClientNif.getText(), telefonos));
                break;
            case MODIFY:
                
                break;
            case DELETE:
                
                break;
            case CHECK_CONNECTION:
                model.getConnection();
                break;
        }
    }
    
}
