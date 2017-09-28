package ar.tech.practices.datastructures;

import java.util.Scanner;
import java.util.Stack;

public class QueueTwoStacks {

		public static void main(String[] args) {
			Stack<Integer> stf = new Stack<Integer>();
			Stack<Integer> str = new Stack<Integer>();
			
			Scanner sc = new Scanner(System.in);
		
			int n = sc.nextInt();
		
			   for (int i = 0; i < n; i++) {
				int ins = sc.nextInt();
				if (ins == 1){
					str.push(sc.nextInt());
				} else{
					if(stf.isEmpty()){
						while(!str.isEmpty()){
							stf.push(str.pop());
							
						}
					}
					if(!stf.empty()){
						if(ins == 2) {
							stf.pop();
						}
						if(ins == 3)  {
							System.out.println(stf.peek());
						}
					}

				}
				
			}
			   
	
		}
}
