package ar.tech.practices.algorithms;

import java.util.Scanner;

public class GradingStudents {

    static int[] solve(int[] grades){
    		int[] result = new int[grades.length];
        	for (int i = 0; i < grades.length; i++) {
	        		int multiploCercano = 0, temp =0;
	        		if  (grades[i] >= 38){
	        			multiploCercano = (grades[i] - (grades[i] % 5)) +5;
	        			temp = multiploCercano - grades[i];
	            		if (temp < 3) {
	            			result[i] = multiploCercano;	
	            		}else{
	            			result[i] = grades[i];
	            		}
	        		}else{
	        			result[i] = grades[i];
	        		}       			      			
			}
        	return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}