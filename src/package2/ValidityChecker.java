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
 * @author Ryan
 */
public class ValidityChecker {
    
    
    /**
     * This method checks the 8puzzle that the user has inputted after it has been processed 
     * I chose strings instead of ints because I found strings to be much easier to work with and there is no need to convert strings to ints in this program
     * @param puzzle array of two strings that the user inputted (processed in MainFrame.java)
     * @return String to user whether or not input was valid
     */
    public String check8puzzle(String input){
        
        //current state is first nine digits desired state is next 9 digits
        //Ex. 8puzzle#currentState#desiredState
        
        String[] hash = parseInput(input);
        String currentState = hash[0];
        String desiredState = hash[1];
        String[] range = {"0","1","2","3","4","5","6","7","8"}; //range of numbers that can be used in 8puzzle
        boolean contains = true; //default value
        
        //loops through each number in the range and makes sure the states both contain them
        for(String kw: range){
            if(!currentState.contains(kw) || !desiredState.contains(kw)){
                contains = false;
            }
        }
        
        // if contains = false send hint to user
        if(contains == false){
           return "Inputted puzzle is not valid, \n \"Ex: 8puzzle#XXXXXXXXX#XXXXXXXXX. Please make sure the range of numbers is between 0 and 8 with no repeats,";
        }
        //Since boolean only has two outcomes else if is not needed
        //Return a message to the user telling them the puzzle is valid       
        else{
           return "Inputted puzzle is valid";
        }
   
        
       
        
    }
    
    
    
    public String checkMC(String input){
        String[] hash = parseInput(input);
        String currentState = hash[0];
        String desiredState = hash[1]; 
        
        if(currentState.equals(new StringBuilder(desiredState).reverse().toString())){
            return "Puzzle is valid";
        }
        else{
            return "Puzzle is not valid";
        }
 
    }
    
    
    
    public String[] parseInput(String puzzle) {
        TextField outputArea;
        String input;
        String[] inputArr;

        
        if(puzzle.startsWith("8puzzle#")){
            //parse input here
            input = puzzle.replace("8puzzle#", "").replace("#", " ");
            inputArr = input.split(" ");
            
        
            if(inputArr.length == 2){
                return inputArr;
            }
      
            else{
                System.out.println("Make sure puzzle is in form 8puzzle#XXXXXXXXX#XXXXXXXXX");
            }
        }
        
  
        else if(puzzle.startsWith("M&C#")){
            input = puzzle.replace("M&C#", "").replace("#", " ");
            inputArr = input.split(" ");
            
        

            if(inputArr.length == 2){
                return inputArr;
         
            }
            else{
                System.out.println("Make sure puzzle is in form M&C#000000#000000");
            }
        }
        
        return null;
        
    }
}
