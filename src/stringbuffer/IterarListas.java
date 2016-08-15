package stringbuffer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterarListas {

	
	public static void main(String[] args) {
		//
		List<String> crunchlist = new ArrayList<String>();
			crunchlist.add("google");
			crunchlist.add("facebook");
			crunchlist.add("whatsapp");
			crunchlist.add("snapchat");
			crunchlist.add("pinterest");
			
			//first wa to iterate
			for(int i= 0; i <crunchlist.size(); i++){
				System.out.println(crunchlist.get(i));
			}
			
			//second way
			System.out.println("\n==> advanced loop example..");
			for (String string : crunchlist) {
				System.out.println(string);
			}
			
			//third way
			System.out.println("\n==> iterator example..");
			Iterator<String> crunchiterator = crunchlist.iterator();
			while (crunchiterator.hasNext()) {
				String string = (String) crunchiterator.next();
				System.out.println(string);
				
			}
			
			//fourth way
			System.out.println("\n==> while loop example");
			int i=0;
			while (i < crunchlist.size()) {
				System.out.println(crunchlist.get(i));
				i++;
			}
			
			//fiveth way
			System.out.println("\n ==> collection stream");
			//crunchlist.forEach((temp) ->{
			//	System.out.println(crunchlist.get(temp));
			//}); 
		}
	
	
	
	
	
	
}
