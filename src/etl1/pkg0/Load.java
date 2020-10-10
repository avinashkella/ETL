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
public class Load {
    String sd;
    String dd;
    String src;
    String dest;
    
    String host = "localhost";
    String port = "3306";
    String username = "root";
    String password = "";
    
    DBConnection conn;
    
    public Load(String sd, String dd, String src, String dest){
        this.sd = sd;
        this.dd = dd;
        this.src = src;
        this.dest = dest;
        conn = new DBConnection(host, port, username, password);
    }
    
    public void start(){
        String sql = "INSERT INTO " + dd + "." + dest +  " SELECT * FROM " + sd + "." + src;
        System.out.println(sql);
        boolean b = conn.queryE(sql);
        if(b)
            System.out.println("Done");
        else
            System.out.println("Not done");
    }
}
