package classinstance;

import java.io.*;
import java.util.*;


public class arrayReverse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }              
        in.close();
        
        int [] result = reversing(arr);

        System.out.println(Arrays.toString(result));
        
        int[] reverse = new int [n+1];
        for(int i=1; i <= n; i++){
        	int dec= n-i;
            reverse[i] = arr[dec];
            System.out.println(reverse[i]);
        }                 
   
      System.out.println(array2String(reverse));
        
    }
    
    /* reversing array */
    public static int []reversing(int[] array){
    	int arraysize = array.length;
        int[] reverse = new int [arraysize+1];
        for(int i=1; i <= arraysize ; i++){
        	int dec= arraysize -i;
            reverse[i] = array[dec];
        }
        return reverse;
    }

    
    /* print values in string line */
    public static String array2String(int[]array){
    	StringBuilder sb = new StringBuilder();
    	boolean first = true;
    	for (int i = 1; i < array.length; i++) {
    		if(!first)
    				sb.append(' ');
    		sb.append(array[i]);
    		first = false;
    	}
    	return sb.toString();
    }
    
    public static String arrayToString(int[]array){
    	StringBuilder sb = new StringBuilder();
    	boolean first = true;
    	for(int value : array){
    		if(!first)
    				sb.append(' ');
    		sb.append(value);
    		first = false;
    	}
    	return sb.toString();
    }
}
