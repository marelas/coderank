package stringbuffer;

import java.util.ArrayList;
import java.util.List;

public class practice {
/**
 * A una lista de nombres modificar y sumarle espacios
 * hasta que su logitud sea igual a 10
 * */
	public static void main(String[] args) {
		List nombres = new ArrayList<String>();
		nombres.add("Chandler");
		nombres.add("Ross");
		nombres.add("Phoebe");
		nombres.add("Rachel");
		nombres.add("Monica");
		int totalLength = 50;
		String caracter = "+";
		String caracterRepetido="";
		
		for (int i = 0; i < nombres.size(); i++) {
			
			int stringLength = nombres.get(i).toString().length() ;
			int stringSpacesToComplete = totalLength - stringLength;
			caracterRepetido = new String(new char[stringSpacesToComplete]).replace("\0", caracter);
					
			System.out.println(nombres.get(i).toString().concat(caracterRepetido));
			System.out.println(nombres.get(i).toString().concat(caracterRepetido).length());
		}
		
		
	}
}
