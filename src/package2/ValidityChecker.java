/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package2;

import java.awt.TextField;
import java.util.Arrays;

/**
 *
 * @author Ryan Harris, AJ Hammond
 */
public class ValidityChecker {
    
    
    /**
     * I was legitimately super lost, so Ryan really helped me out with this program, understanding it, and writing it. 
     * @param puzzle 
     *
     */
    public String check8puzzle(String input){
       
        String[] eightPuzzle = parseInput(input);
        String currentState = eightPuzzle[0];
        String desiredState = eightPuzzle[1];
        String[] range = {"0","1","2","3","4","5","6","7","8"}; 
        boolean contains = true; 
        
        for(String kw: range){
            if(!currentState.contains(kw) || !desiredState.contains(kw)){
                contains = false;
            }
        }
     
        if(contains == false){
           return "Input is not valid. \n \"Ex: 8puzzle#XXXXXXXXX#XXXXXXXXX. Range of numbers needs to be between 0 and 8 with no repeat digits";
        }      
        else{
           return "This is a valid input.";
        }
       
    }
   
    public String checkMC(String input){
        String[] hash = parseInput(input);
        String currentState = hash[0];
        String desiredState = hash[1]; 
       
        if(currentState.equals(new StringBuilder(desiredState).reverse().toString())){
            return "Puzzle valid";
        }
        else{
            return "Puzzle not valid.";
        }
 
    }
    
    
    
    public String[] parseInput(String puzzle) {
        TextField outputArea;
        String input;
        String[] inputArr;
       
        if(puzzle.startsWith("8puzzle#")){
            input = puzzle.replace("8puzzle#", "").replace("#", " ");
            inputArr = input.split(" ");
            
            if(inputArr.length == 2){
                return inputArr;
            }
      
            else{
                return("Make sure puzzle is in the example form");
            }
        }
        
        else if(puzzle.startsWith("M&C#")){
            input = puzzle.replace("M&C#", "").replace("#", " ");
            inputArr = input.split(" ");
                 
           if(inputArr.length == 2){
                return inputArr;       
            }
            else
           {
                return("Make sure input is in form M&C#000000#000000");
            }
        }
        
        return null;
        
    }
}
