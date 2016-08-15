package stringss;

import java.util.Arrays;
import java.util.Scanner;

public class OddEvens {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] array = new String[n];
        for(int i=0; i < n; i++){
            array[i] = in.next();
        }              
        in.close();
        String[] result = new String[n];
        for(int i=0; i < n; i++){
            //odds and evens characters
        	result[i] = breakupoddeven(array[i]);
        	System.out.println(result[i]);
        }              
        
        
        System.out.println(arrayToString(result));
                      
   
      
        
    }
    
    public static String  breakupoddeven(String arr){
    	String [] word = arr.split("");
    	StringBuffer result = new StringBuffer();
    	StringBuffer odds = new StringBuffer();
    	StringBuffer evens = new StringBuffer();
    	
    	for (int i = 0; i < word.length; i++) {
			if ((i%2) ==1){
				odds.append(word[i]);
			}else{
				evens.append(word[i]);
			}
		}
    	result.append(odds);
    	result.append(" ");
    	result.append(evens);
    	
    	return result.toString();
    }	
    
    public static String arrayToString(String[]array){
    	StringBuilder sb = new StringBuilder();
    	boolean first = true;
    	for(String value : array){
    		if(!first)
    				sb.append(' ');
    		sb.append(value);
    		first = false;
    	}
    	return sb.toString();
    }
}
