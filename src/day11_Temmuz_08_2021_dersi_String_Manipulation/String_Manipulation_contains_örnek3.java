package day11_Temmuz_08_2021_dersi_String_Manipulation;

import java.util.Scanner;

public class String_Manipulation_contains_örnek3 {

	public static void main(String[] args) {
		// Kullanicidan email adresini girmesini isteyin, 
		// mail @gmail.com iceriyorsa   “Email adresiniz kaydedildi”, 
		// icermiyorsa “Lutfen gmail mail adresinizi giriniz.. “ yazdirin
		// indexof ile yapılacak 
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen email adresinizi giriniz");
		String mail=scan.next();
		
		if(mail.indexOf("@gmail.com")!=-1) {
			System.out.println("Email adresiniz kaydedildi");
			
		} else {
			System.out.println("Lutfen gmail mail adresinizi giriniz..");
		}
		scan.close();
		
		
	}

}
