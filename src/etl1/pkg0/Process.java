/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etl1.pkg0;

import java.util.List;

/**
 *
 * @author ZulfiqarJunejo
 */
public class Process {

    public String getSourceDB() {
        return sourceDB;
    }

    public void setSourceDB(String sourceDB) {
        this.sourceDB = sourceDB;
    }

    public List<String> getSourceTables() {
        return sourceTables;
    }

    public void setSourceTables(List<String> sourceTables) {
        this.sourceTables = sourceTables;
    }

    public String getDestDB() {
        return destDB;
    }

    public void setDestDB(String destDB) {
        this.destDB = destDB;
    }

    public List<String> getDestTables() {
        return destTables;
    }

    public void setDestTables(List<String> destTables) {
        this.destTables = destTables;
    }
    
    private String sourceDB;
    private List<String> sourceTables;
    private String destDB;
    private List<String> destTables;
    
    public void print(){
        for(int i=0;i<sourceTables.size();i++){
            System.out.print(sourceTables.get(i) + "    ");
        }
        System.out.println();
        for(int i=0;i<destTables.size();i++){
            System.out.print(destTables.get(i) + "    ");
        }
    }
}
