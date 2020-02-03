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
 * @author AJ, help from Ryan
 * @param <T>
 */
public class QueueFIFO<T>{

    private ArrayList<T> arrayList;
    
    public QueueFIFO(){arrayList = new ArrayList<>();}
     
    public void insert(T node){
        arrayList.add(node);
    }
    
    public void pop() throws NoSuchElementException {
        if(arrayList.isEmpty())
            throw new NoSuchElementException("Can't delete an empty queue!");
        
        arrayList.remove(0);
   
    }
   
    public boolean isEmpty(){
        return arrayList.isEmpty();
    }
    
    @Override
    public String toString(){
        return Arrays.toString(arrayList.toArray());
    }


    
    public static void main(String[] args){
        QueueFIFO queue = new QueueFIFO();
        Action string = new Action("Hi!");
        queue.insert(string);
        System.out.println(queue.toString());
        queue.pop();
        System.out.println(queue.toString());
   
        

        
        
        
        
   
    }
            
  
    
}


