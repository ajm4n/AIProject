/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author AJ, help from Ryan Harris
 */
public class Node {
    private State state;
    private int pathCost;
    private Node parent =null;
    private Action a;
    private ArrayList<Node> cNodes;
    
    
    public Node(Action action, int pathCost){
        this.a=action;
        this.pathCost = pathCost;
    }
    
    
    public Node(Action action, Node parent, int pathCost){
        this.a = action;
        this.setParent(parent);
        this.pathCost = pathCost;
        cNodes = new ArrayList<Node>();
    }
    
    public void addChild(Action action, int pathCost){
        Node child = new Node(action, this, pathCost);
        child.setParent(this);
    }
    
    public String getChildren(){
        return Arrays.toString(this.cNodes.toArray());
    }
    
    public void setParent(Node parent){
        this.parent = parent;
    
    }
    
    public Action getAction(Action action){
        return action;
    }

    public void setAction(Action action){
        this.a = action;  
    }
    
    
    public static void main(String[] args){
        Node parentNode1 = new Node(new Action("Parent"),1 );
        parentNode1.addChild(new Action("cNode"),1);
        parentNode1.addChild(new Action("cNode"),1);


    }
}