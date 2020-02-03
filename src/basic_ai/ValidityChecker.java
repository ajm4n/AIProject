package basic_ai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AJ, lots of help from Ryan
 */
public class ValidityChecker {
    
    /**
     * Ryan really came through with help on this project. I was extremely lost and he really helped out with the code and processing and everything. 
     *@param hash
     */
    public String check8puzzle(String[] hash){
        String currentState = hash[0];
        String desiredState = hash[1];
        String[] range = {"0","1","2","3","4","5","6","7","8"};
        boolean contains = true; 
        for(String kw: range){
            if(!currentState.contains(kw) || !desiredState.contains(kw)){
                contains = false;
            }
        } //end check8puzzle
        

        if(contains == false){
            return "Input not valid! \n \"Ex: 8puzzle#XXXXXXXXX#XXXXXXXXX. Please make sure the range of numbers is between 0 and 8 with no repeats,";
        }
        else{
           return "Input valid";
        }
   
        
       
        
    }
    public String checkMandC(String[] hash){
        String[] currentState = hash[0].trim().split("");
        String[] desiredState = hash[1].trim().split("");
        Integer[] currentStateInt = new Integer[currentState.length];
        Integer[] desiredStateInt = new Integer[desiredState.length];
        String[] allowedStrings = {"0", "1", "2", "3"};
        System.out.println(Arrays.toString(currentState));
        System.out.println(Arrays.toString(desiredState));
        
        
        if(currentState.length == 6 && desiredState.length == 6){
            for(int i =0; i < currentState.length; i++){
                try{
                    currentStateInt[i] = Integer.parseInt(currentState[i].trim());
                    desiredStateInt[i] = Integer.parseInt(desiredState[i].trim());

                } //end try
                catch(NumberFormatException nfe){
                    return "Integers only.";
                } //end catch
            } //end for
        } //end if
        
        else{
            return "Current state and desired state must be the same length.";
        }
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(currentStateInt));
        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(desiredStateInt));
        int boatLeft = arrayList1.get(2);
        int boatRight = arrayList1.get(3);
        boolean good = true;
        boolean first = true;
        boolean second = false;
        Integer[] ints = new Integer[2];
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer[]> combos = new ArrayList<Integer[]>();
        int timesLooped = 0;
        row.add(0);
        row.add(0);
        
        if(boatLeft >= 1 && boatRight >= 1){
            return "Only 1 boat allowed.";
        }
        else if((boatLeft == 1 && boatRight ==0) || (boatLeft ==0 && boatRight ==1)){
            while(good){
                if(boatLeft == 1){
                    if((row.get(0) >=0 &&row.get(0) <= 2) && (row.get(1) >=0 &&row.get(1) <= 2)){
                        if(row.get(0) + row.get(1) >= 2){
                            if(row.get(1) >= 2){
                            row.set(1, row.get(1)- 1);}
                            if(row.get(0) >= 2){
                                row.set(0,row.get(0)- 1);
                            }
                    }
                        if(timesLooped == 2 &&row.get(1) == 1){
                            first = false;
                            second = true;
                        }
                        if(first){
                            if(arrayList1.get(0) > 0 && row.get(0) <= 2){
                            if(row.get(1) == 2){
                                    row.set(0,0);
                                }
                                row.set(0, row.get(0) + 1);
                                arrayList1.set(1, arrayList1.get(1) -1);
                                if(row.get(0) + row.get(1) >= 2){
                                    row.set(1, row.get(1)- 1);
                                }
                                return(Arrays.toString(row.toArray()));
                                
                                }
                                first = false;
                                second = true;
                            }
                        }
                        if(timesLooped == 10){
                            break;
                        }
                        if(second){
                         
                                if(arrayList1.get(1) >= 0){
                                    
                                    
                                    row.set(1, row.get(1) + 1);
                             
                                    if(row.get(0) == 2){
                                        row.set(0,0);
                                    }
                                    System.out.println(Arrays.toString(row.toArray()));
                                    first = true;
                                    second = false;
                                    if(row.get(1) == 2){
                                        break;
                                    }


                                }
                            
                        }  
                        timesLooped++;
                    }
                else if(boatRight == 1){
                    if((row.get(0) >=0 && row.get(0) <= 2) && (row.get(1) >=0 &&row.get(1) <= 2)){
                        if(row.get(0) + row.get(1) >= 2){
                            if(row.get(1) >= 2){
                            row.set(1, row.get(1)- 1);}
                            if(row.get(0) >= 2){
                                row.set(0,row.get(0)- 1);
                            }
                    }
                        if(timesLooped == 2 &&row.get(1) == 1){
                            first = false;
                            second = true;
                        }
                        if(first){
                            if(arrayList1.get(0) > 0 && row.get(0) <= 2){
                            if(row.get(1) == 2){
                                    row.set(0,0);
                                }
                                row.set(0, row.get(0) + 1);
                                arrayList1.set(1, arrayList1.get(1) -1);
                                if(row.get(0) + row.get(1) >= 2){
                                    row.set(1, row.get(1)- 1);
                                }
                                System.out.println(Arrays.toString(row.toArray()));
                                
                                }
                                first = false;
                                second = true;
                            }
                        }
                        if(timesLooped == 10){
                            break;
                        }
                        if(second){
                                if(arrayList1.get(4) >= 0){
                                    row.set(1, row.get(1) + 1);
                                    if(row.get(0) == 2){
                                        row.set(0,0);
                                    }
                                    System.out.println(Arrays.toString(row.toArray()));
                                    first = true;
                                    second = false;
                                    if(row.get(1) == 2){
                                        break;
                                    }
                                }                           
                        }                    
                        timesLooped += 1;
                }
            }
            }//end checkMandC
        return "Look at console output.";

        }
    }
    
   
    
    

