/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2part2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author work
 */
public class Lab2Part2 {
    
    //Inserts a new node into an already sorted Array
    public static <T extends Comparable> void sortedInsert(MyLinkedList<T> li, T data)
    {
      int i = 0;//A counter to use in the while loop
        
      if(li.size() == 0)//If there is nothing in the list, adds the node to the beginning
        {
         li.add(data);
        }
      
      if(li.get(0).compareTo(data) < 0)//If the node's data is less then then data in the first index
        {
         li.add(0, data);//Adds the node to the beginning of the list
        }
      
      else if(li.get(li.size() - 1).compareTo(data) > 0)//If the node data is greater then the data in the last index
        {
         li.add(li.size(), data);//Adds the node to the end of the list   
        } 
      
      else    
       {   
        while(li.get(i).compareTo(data) > 0)//Scans through the nodes in the list and compares
           {                               //The data to that of the node you want to add 
             i++;//Increases the count variable   
           }  
         li.add(i, data);//Adds the new node in the point where it belongs
        }
    }
    
    
    public static void main(String[] args) {
        
        MyLinkedList nn = new MyLinkedList();
        
        nn.add(1);
        nn.add(2);
        nn.add(3);
        nn.add(4);
        nn.add(5);
        
        System.out.println(nn.toString());
        
        sortedInsert(nn, 6);
        
        System.out.println(nn.toString());
        

    }
    
}
