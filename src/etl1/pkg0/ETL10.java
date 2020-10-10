/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etl1.pkg0;

/**
 *
 * @author ZulfiqarJunejo
 */
public class ETL10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Validator v = new Validator();
        //v.validate("pma_bookmark", "hello", "phpmyadmin", "");
        
        WindowConnection mf = new WindowConnection();
        mf.setVisible(true);
    }
    
}
