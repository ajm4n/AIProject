/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 *
 * @author ryanharris
 * @param <T>
 */
public class QueueFIFO<T>{

    private ArrayList<T> list;
    
    public QueueFIFO(){list = new ArrayList<>();}

          
    public void insert(T node){
        list.add(node);
    }
    
    public void pop() throws NoSuchElementException {
        if(list.isEmpty())
            throw new NoSuchElementException("Trying to delete from an empty queue");
        
        list.remove(0);
   
    }
   
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    @Override
    public String toString(){
        return Arrays.toString(list.toArray());
    }


    
    public static void main(String[] args){
        QueueFIFO queue = new QueueFIFO();
        Action string = new Action("Hello");
        queue.insert(string);
        System.out.println(queue.toString());
        queue.pop();
        System.out.println(queue.toString());
   
        

        
        
        
        
   
    }
            
  
    
}


