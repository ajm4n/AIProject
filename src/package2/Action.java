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
public class Action {
    
    private String action;
    public Action(String action){
        this.action = action;
        
    }
    
    @Override
    public String toString(){
        return action;
    }
    
}