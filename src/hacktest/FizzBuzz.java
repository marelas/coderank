package hacktest;

import java.util.Scanner;

public class FizzBuzz {

	
	 public static void main(String []argh){
	     
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        in.close();

	    
	        fizzbuzz(n);
	      
	        //System.out.println(result);	
	    }
	 
	    
			    public static void fizzbuzz(int n){
			        for (int i = 1; i <= n; i++) {
					
							 if(((i%3)==0) && ((i%5)==0)){
								System.out.println("FizzBuzz");
							}else if((i%5)==0){
								System.out.println("Buzz");
							}else if ((i%3)==0){
								System.out.println("Fizz");
							}
							else{
							System.out.println(i);
						}
					}
			        
			    }
}
