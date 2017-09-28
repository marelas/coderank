package datastructures;

//Complete this code or write your own from scratch
	import java.util.*;
	import java.io.*;

	public class PhoneBookMap {
		
	    public static void main(String []argh){
	        Map<String, Integer> phonebook = new HashMap<String, Integer>();
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        for(int i = 0; i < n; i++){
	            String name = in.next();
	            int phone = in.nextInt();
	            phonebook.put(name, phone);
	        }
	      
	        List<String> wanted  = new ArrayList<String>();
	       
//	        while(in.hasNext()){
//	        	 String s = in.next();
//	        	//  wanted.add(s);	        	 
//	        }
	        for(int j = 0; j < n; j++){
	        //while (!( in.next()).equals("")) {
	        	 String s = in.next();
	        	 if (in.hasNextLine()){
	        		 wanted.add(s);
	        	 }else{
	        		 break;
	        	 }
	           	           
	        }
	        in.close();
	        
	       for (int j = 0; j < wanted.size(); j++) {			
	            if(phonebook.containsKey(wanted.get(j))){
	                System.out.println(wanted.get(j) +"="+phonebook.get(j));
	            }else{
	                System.out.println("Not Found");
	            }
			}
	    }
	}