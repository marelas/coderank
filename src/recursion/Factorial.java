package recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Factorial {

	 public static void main(String []argh){
	     
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        in.close();
//	        int fact = 1;
//	        for(int i = 1; i <= n; i++){
//	            fact = fact * i;
//	          
//	        }
	        int result = factor(n);
	      
	        System.out.println(result);	
	    }
	 
	    
			    public static int factor(int n){
			      if (n == 1){
			    	       return  n ;          	    	           	         
			       }else{
			    	   return n* factor(n-1);
			       }
			    }
}
