package package2;

import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 * @author AJ, help from Ryan
 */
public class Sequence {
    private ArrayList<Action> countActionsTaken;

    public Sequence(){
        countActionsTaken = new ArrayList<>();
    }
    
    public void add(Action action)
    {
        countActionsTaken.add(action);
    }  
    
    public ArrayList<Action> getSequence(ArrayList<Action> sequence){
        return sequence;
    }
    
    @Override
    public String toString(){
        return Arrays.toString(countActionsTaken.toArray());
    }
    
    
    public static void main(String[] args){
        Sequence actions = new Sequence();
        for(int i = 0; i <= 10; i++){
            if(i % 2 == 0){
                actions.add(new Action("Left"));
            }
            else{
                actions.add(new Action("Right"));
            }
        }
        return(actions.toString());
    }
    
}