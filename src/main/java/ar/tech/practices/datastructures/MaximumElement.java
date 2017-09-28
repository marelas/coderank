package ar.tech.practices.datastructures;

import java.util.Scanner;
import java.util.Stack;


public class MaximumElement {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		int maxi=0;
		
		for (int i = 0; i < n; i++) {
			int ins = sc.nextInt();
			if (ins == 1){
				 int nw = sc.nextInt();
				stack.push(nw);
				if(maxi <  nw ){
					maxi =nw;
				}
			} else{
				
				if(!stack.empty()){
					if(ins == 2) {
						int sale =stack.pop();
						if(maxi == sale){
						maxi = (stack.isEmpty()) ? 0:maximum(stack);
								
						} 
					}
					if(ins == 3)  {
						System.out.println(maxi);
					}
				}

			}
			
		}
		   sc.close();

	}
	
	static int maximum(Stack<Integer> st){
		int max =st.get(0), i=0;
		while(i+1 < st.size()){			
			 max =Math.max(max , st.get(i+1));
			 i++;
		}		
		return max;
		
	}
}
