package Replit_sorular;

import java.util.Scanner;

public class soru5 {

	public static void main(String[] args) {
		/* Ask user to type a name, the length of name should be 3.

		Then check if the name has same characters.

		If the String has same characters, Print “String has duplicate characters” Else

		Print “String has unique characters”

		Please use ternary.

			Input :

					ala

			OutPut:

					String has duplicate characters */

		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a word with 3 letter : ");
		String word=scan.next();
		
		if(word.substring(0,1).equals(word.substring(1,2)))  {
			System.out.println("String has duplicate characters");
		}else if(word.substring(0,1).equals(word.substring(2,3))) {
			System.out.println("String has duplicate characters");
		}else if(word.substring(1,2).equals(word.substring(2,3))) {
			System.out.println("String has duplicate characters");
		}else {
			System.out.println("String has unique characters");
		}
		
		/*
            char c1=name.charAt(0);
    		char c2=name.charAt(1);
    		char c3=name.charAt(2);
    		
    		String result=name.length()== 3 ? ((c1!=c2 && c1!=c3 && c2!=c3) ? "girdiginiz kelime unique karakterlerden olusuyor" : "girdiginiz karakterler unique karakterler degil") : "3 karakterden farkli kelime girdiniz";
    		
    		System.out.println(result);*/
		
		
	}

}
