package stringbuffer;
import java.io.*;
import java.util.*;

public class anagrams {

  
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        a= a.toLowerCase();
        b= b.toLowerCase();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    
   static boolean isAnagram(String a,String b){
        char[] stringA = a.replaceAll("[\\s]", "").toCharArray();
        char[] stringB = b.replaceAll("[\\s]", "").toCharArray();
        
        Arrays.sort(stringA);
        Arrays.sort(stringB);
        
        return Arrays.equals(stringA, stringB);
    }
    
}