package br.com.anagrama;
import java.util.*;
public class Anagrama {
	
	public static void main(String[] args) {
			try (Scanner inpScanner = new Scanner(System.in)) {
				String input = "";
				System.out.println("Informa a palavra desejada: \n");
				input = inpScanner.next();
				System.out.println(returnNumber(input));
			}
	    } 
	  
    public static int returnNumber(String str) {
        int counter = 0;

        ArrayList<String> subStrings = new ArrayList<String>();

        for (int i = 1; i <= str.length(); i++) {
            for (int j = 0; j <= str.length() - i; j++) {
                subStrings.add(str.substring(j, j + i));
            }
        }

        for (int i = 0; i < subStrings.size(); i++) {
            for (int j = i + 1; j < subStrings.size(); j++) {
                if (strCounter(subStrings.get(i), subStrings.get(j))) counter++;
            }            
        }
        System.out.print(" O total de anagrama pares são: ");
        return  counter;
    }

    public static boolean strCounter(String str1, String str2) {
        char str1Chars[] = str1.toCharArray();
        char str2Chars[] = str2.toCharArray();

        Arrays.sort(str1Chars);
        Arrays.sort(str2Chars);

        String aResult = new String(str1Chars);
        String bResult = new String(str2Chars);

        return aResult.equals(bResult);
    }
}