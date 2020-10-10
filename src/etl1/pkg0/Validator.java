/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etl1.pkg0;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ZulfiqarJunejo
 */
public class Validator {
    String host = "localhost";
    String port = "3306";
    String username = "root";
    String password = "";
    
    DBConnection conn;
    
    public Validator(){
        conn = new DBConnection();
    }
    
    public boolean validate(String src, String dest, String sd, String dd){
        try {
            ResultSet res1 = conn.query("DESCRIBE " + sd + "." + src);
            res1.toString();
            while(res1.next()){
                System.out.println(res1.getString(0));
            }
            //ResultSet res2 = conn.query("");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Validator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
}
