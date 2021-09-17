package Replit_sorular;

import java.util.Scanner;

public class soru7 {

	public static void main(String[] args) {
		/* Ask user for a string and print a new string made of 3 copies of the last 2 letters

			The strings length will be at least 2.

				Sample:

					INPUT : Mustafa OUTPUT : fafafa */

		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a String");
		String str=scan.next();
		
		if(str.length()<2) {
			System.out.println("enter a string with minimum 2 digit");
		}else {
			System.out.print(str.substring(str.length()-2));
			System.out.print(str.substring(str.length()-2));
			System.out.print(str.substring(str.length()-2));
			
		}
		
		
		scan.close();
		
		
	}

}
