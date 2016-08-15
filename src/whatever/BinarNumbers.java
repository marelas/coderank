package whatever;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BinarNumbers {
	
	// given n and m find and print the minimum number of additiional cookies you must 
	// make so  that everybody receives the same number of cookies
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int number = in.nextInt();
	in.close();
	List <Integer> result = new ArrayList<Integer>();
	
	String  binary = Integer.toBinaryString(number);
	System.out.println("b" + binary);
	String [] array = binary.split("");
	int [] ress = new int[array.length];
	int res=0, temp=0;
	for (int i = 1; i < array.length; i++) {
			if(array[i].equals("1")){
				temp++;
			}else{		
				temp=0;
			}
			ress[i]=temp;
				
	}
	Arrays.sort(ress);
  	  
	System.out.println(ress[ress.length-1]);
				
	
	
}

}
