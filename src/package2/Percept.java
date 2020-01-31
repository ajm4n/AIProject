/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package2;

/**
 *
 * @author ryanharris
 */
public class Percept {
    private String percept;
    
    public Percept(String percept){
        this.percept = percept;
    }
    
    @Override
    public String toString(){
        return percept;
    }
            
}