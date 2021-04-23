import java.io.*;
import java.util.*;



public class Task01{
  public static void main(String[]args){
   Stack<Integer> st = new Stack<Integer>(); 
  
        push(st,10); 
         push(st,5);
          push(st,6);
           pop(st);
           peek(st);
           push(st,9);
            push(st,3);
            push(st,2);
             pop(st);   
             pop(st);  
         peek(st);
  }


public static void push(Stack<Integer>st,int i) 
    { 
      
            st.push(i); 
        System.out.println("pushing"+ " "+i);
    } 
      
    // Popping element from the top of the stack 
 public  static void pop(Stack<Integer> st)
      
    { 
      int a= st.pop();
        System.out.println("Pop  "); 
  
       
//            Integer y = (Integer) stack.pop(); 
//            System.out.println(y); 
        } 
   
  

public static void peek(Stack<Integer>st) 
    { 
        int a =  st.peek(); 
        System.out.println("Element on stack top : " + a); 
    } 
}
      
//    // Searching element in the stack 
//    static void stack_search(Stack<Integer> stack, int element) 
//    { 
//        Integer pos = (Integer) stack.search(element); 
//  
//        if(pos == -1) 
//            System.out.println("Element not found"); 
//        else
//            System.out.println("Element is found at position " + pos); 
//    } 
//    

         
       
        
       
    
    