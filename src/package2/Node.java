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
    private Node parent =null;
    private Action action;
    private int pathCost;
    private ArrayList<Node> cNodes = new ArrayList<>();
    

    public Node(State state){
        this.state=state;
    }//nd Node
    public Node(State state, Action action, int pathCost){
        this.action = action;
        this.state = state;
        this.pathCost = pathCost;
    }//end Node
    public void addChild(Node child){
        child.setParent(this);
        this.cNodes.add(child);
    }//end addChild
    public void addChild(State state, Action action, int pathCost){
        Node child = new Node(state,action,pathCost);
        this.addChild(child);
    }//end addChild
    public ArrayList<Node> getChildren(){
        return cNodes;
    }//end getChildren
    public void setParent(Node parent){
        this.parent = parent;
    }//end setParent
    public Node getParent(){
        return parent;
    }//end get Parent
    public Action getAction(){
        return action;
    }//end get Action
    public State getState(){
        return state;
    } //end getState
    
    public int getPathCost(){
        return pathCost;
    } //end getPathCost

    public void setAction(Action action){
        this.action = action;  
    } //end setAction
    
    
    public static void main(String[] args){
        
        Node root = new Node(new State("331000"));//Initial State
        Node child1 = new Node(new State("310102"), new Action("row#02"),1);
        child1.addChild(new State("321001"), new Action("row#01"),1);
        child1.addChild(new State("300102"), new Action("row#02"),1);  
        Node child2 = new Node(new State("220111"), new Action("row#11"), 1);
        child2.addChild(new State("321001"), new Action("row#10"),1 );
        root.addChild(child1);
        root.addChild(child2);
        for(Node node: root.getChildren()){
            System.out.println(node.getState());
        }
 
    } //end main
}