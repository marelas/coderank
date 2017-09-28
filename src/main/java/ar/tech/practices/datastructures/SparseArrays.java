package ar.tech.practices.datastructures;

import java.util.Scanner;

public class SparseArrays {

	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			String[] strings = new String[n];
			for (int i = 0; i < strings.length; i++) {
				strings[i] = sc.next();
			}
			
			int q = sc.nextInt();
			String[] requests = new String[q];
			for (int i = 0; i < requests.length; i++) {
				requests[i] = sc.next();
			}
			int[] result = new int[requests.length];
			for (int i = 0; i < requests.length; i++) {
				String wanted = requests[i];
				int numberOcurrences = 0;
				for (int j = 0; j < strings.length; j++) {
					if(wanted.equals(strings[j])){
						numberOcurrences++;
					}
					result[i] = numberOcurrences;
				}
			}
			
			for (int i = 0; i < result.length; i++) {
				System.out.println(result[i]);
			}
		}
}
