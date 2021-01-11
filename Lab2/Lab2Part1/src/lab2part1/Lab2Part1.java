/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2part1;

/**
 *
 * @author work
 */
public class Lab2Part1 {

    public static <T> boolean duplicate(T a[])//Complexity of O(n^2)
    { 
      for(int i = 0; i < a.length; i++)//Scans through the array
         {
          int inc = i + 1;//Increases the value of j
          T temp = a[i];//Stores the current data to be compared
          
          for(int j = inc; j < a.length; j++)//Scans through the array a second time
             {
              if(a[j].equals(temp))//Compares the data stored in temp with the array 
                {
                 return true;//returns true if there's a duplicate of temp   
                }
             }
         }
     return false; //returns false if there is no duplicates
    }
    
    public static boolean duplicateInt(int a[])//Complexity of O(n)
    {   
      for(int i = 0; i < a.length; i++)//Scans through the array
         {   
             int j = i + 1;//Sets up the next index
             if(j < a.length)
               {
                 if(a[i] == a[j])//Compares the current index with the one ahead of it
                   {
                    return true;//Returns true if there are any duplicates   
                   }   
               }
         }  
     return false;//Returns false if there's no duplicates 
    }
    
    public static int wins(int a[])//Complexity of O(n)
         {
           //Setting up counter variables for each candidate  
           int can1 = 0;
           int can2 = 0;
           int can3 = 0;
           int tie = 0;
           
           //Scans through array, increases counter variable based on data
           //stored in the array.
           for(int i = 0; i < a.length; i++)
              {
               if(a[i] == 0)
                 {
                  can1++;   
                 }
               
               else if(a[i] == 1)
                 {
                  can2++;   
                 }
               
               else if(a[i] == 2)
                 {
                  can3++;   
                 }
              }
          
          //Compares counter variables and prints the one with the biggest number 
          if(can1 > can2 && can1 > can3)
            {
             System.out.println("Candidate 1 wins with: ");
             return can1;
            } 
          else if(can2 > can1 && can2 > can3)
            {
             System.out.println("Candidate 2 wins with: ");
             return can2;
            }
          else if(can3 > can1 && can3 > can2)
            {
             System.out.println("Candidate 3 wins with: ");
             return can3;
            }
          
          //Returns a 0(tie) if no numbers are greater then the other
          return tie;
         }
    
    
    public static void main(String[] args) {
        String[] test = {"and", "if", "or", "is", "and"};
        System.out.println(duplicate(test));
        
        int[] test1 = {0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(duplicateInt(test1));
        
        int[] test2 = {0, 1, 2};
        System.out.println(wins(test2));
    }
    
    
}
