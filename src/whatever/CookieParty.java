package whatever;

import java.util.Scanner;

public class CookieParty {

	

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int cookies = 0, re=0;
        if (n > m ){
            cookies = n-m;
        }else if (m%n != 0){
        	    		re = m%n;
        		cookies = n-re;
        	}
           
         System.out.println(cookies);
    }
}
