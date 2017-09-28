package ar.tech.practices.datastructures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer arr[] = new Integer[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        
        for(int i = n - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        
    /* List <Integer> arraylist = new ArrayList<Integer>();
     
     arraylist = Arrays.asList(arr);
     Collections.reverse(arraylist);
     
     Iterator<Integer> iter = arraylist.iterator();
     
    	 System.out.println(arraylist.toString());
   
    	 StringBuilder builder = new StringBuilder();
    	 for (Integer value : arraylist) {
    	     builder.append(value+" ");
    	 }
    	 String text = builder.toString();
    	 System.out.println(text);
     }*/
     
    
        
    }
    
}
