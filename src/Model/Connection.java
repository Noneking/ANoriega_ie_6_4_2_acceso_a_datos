/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nonek
 */
public class Connection {
    
    java.sql.Connection c;
    
    private String url="jdbc:oracle:thin@localhost:1521:ORCL";
    private String user="SYSTEM";
    private String password="root";
    
    public java.sql.Connection getConnection(){
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            c=DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.c;
    }
    
    public void closeConnection(){
        try {
            this.c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
