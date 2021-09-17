package Replit_sorular;

import java.util.Scanner;

public class soru2 {

	public static void main(String[] args) {
		/* Ask user Name, Surname and credit card numbers than convert it to special form. (Initials for name and surname should be uppercase)
		(Check credit card number, if there aren’t 16 digit print “Invalid credit card number”

				Input :

				John White 1234234534561478

				Output :

				Name : J* W**

				CCN : ** ** **** 1478     */

		
		Scanner scan=new Scanner(System.in);
		System.out.print("please enter your name : ");
		String name=scan.next();

		System.out.print("please enter your surname : ");
		String surname=scan.next();

		System.out.print("please enter your credit card numbers without space : ");
		String card_number=scan.next();

		String name2=name.substring(0,1).toUpperCase() + name.substring(1);
		String surname2=surname.substring(0,1).toUpperCase()+surname.substring(1);
		String card_number2="**** **** **** " + card_number.substring(12);
		
		System.out.println("Name : " + name2 + "\nSurname : " + surname2 + "\nCCN : " + card_number2);
	}

}
