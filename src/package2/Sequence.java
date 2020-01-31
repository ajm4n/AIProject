package package2;

import java.util.ArrayList;


/**
 *
 * @author ryanharris
 */
public class Sequence {
    private ArrayList<Action> actions;

    public Sequence(){
        actions = new ArrayList<>();
    }
    
    public void add(Action action)
    {
        actions.add(action);
    }
    
}