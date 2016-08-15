package hacktest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class lengths {

	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer arr[] = new Integer[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
       in.close();
       
     List <Integer> arraylist = new ArrayList<Integer>();
     List <Integer> cuts = new ArrayList<Integer>();
     	 
     Arrays.sort(arr);
     arraylist = Arrays.asList(arr);
     int shortest = 0, biggest = 0;
 	     shortest = arraylist.get(0);
 	     biggest = arraylist.get(arraylist.size()-1);
 	
 	      int again =0;
 	while(biggest > again ){
 	      int cont = 0;
 	      for (int i = 0; i < arraylist.size(); i++) {
			if (arraylist.get(i) >= 1){
				int minus = arraylist.get(i) -shortest; 
				arraylist.set(i, minus);
				cont = cont +1;
				}
			  
			}
 	     cuts.add(cont);
 	     if (!cuts.get(again).equals(0)){
 	    	System.out.println(cuts.get(again));
 	     	} 	 	
 	     	again = again +1; 	     	
		}
 	     
    }
     
}