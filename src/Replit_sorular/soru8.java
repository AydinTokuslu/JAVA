package Replit_sorular;

import java.util.Scanner;

public class soru8 {

	public static void main(String[] args) {
		/* Ask user to enter a name and a character, 
		 * then check how many times the character is repeated 
		 * in the name using loops in the name
		 			e.g:

					char ch1= 'a' ;

					String name =“John came late"

					Expected Output: Number of a = 2   */

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a string");
		String isim = scan.nextLine();
		
		System.out.println("please enter a character");
		char ch1 = scan.next().charAt(0);
		
				
		int atama=0;
		
		if(isim.contains(ch1)) {
			atama+=1;
			System.out.println("Number of " + ch1 + "=" + atama);
		}
		
		
	}

}
