package Replit_sorular;

import java.util.Scanner;

public class soru3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter command starting with letter of a or b or c ");
		String command=scan.next();
		
		char a=command.charAt(0);
		char b=command.charAt(0);
		char c=command.charAt(0);
		
		switch(command) {
		case a:{
			System.out.println("Your request is being processed");
			break;
		}
		case b:{
			System.out.println("Thank you anyway for your consideration");
			break;
		}
		case c:{
			System.out.println("Sorry, no help is currently available");
			break;
		}default:
			System.out.println("Invalid entry, please try again!");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
