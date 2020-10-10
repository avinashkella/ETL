/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etl1.pkg0;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ZulfiqarJunejo
 */
public class DBConnection {
    
    private String host;
    private String port;
    private String username;
    private String password;
    
    private String url;
    
    Connection conn;
    
    
    
    public DBConnection(){
        host = "localhost";
        port = "3306";
        username = "root";
        password = "";
        url = "jdbc:mysql://" + host +":" + port + "/";
        connect();
    }
    
    public DBConnection(String host, String port, String username, String password){
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
        url = "jdbc:mysql://" + host +":" + port + "/";
        connect();
    }
    
    public void connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public ResultSet query(String query){
        ResultSet result = null;
        try {
            Statement stt = conn.createStatement();
            result = stt.executeQuery(query);
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    public boolean queryE(String query){
        ResultSet result = null;
        try {
            Statement stt = conn.createStatement();
            boolean b= stt.execute(query);
            return b;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}
