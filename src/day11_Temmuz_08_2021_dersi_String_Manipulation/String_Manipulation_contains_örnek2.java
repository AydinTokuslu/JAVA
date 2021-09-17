package day11_Temmuz_08_2021_dersi_String_Manipulation;

import java.util.Scanner;

public class String_Manipulation_contains_örnek2 {

	public static void main(String[] args) {
		// Kullanicidan email adresini girmesini isteyin, 
		// mail @gmail.com iceriyorsa   “Email adresiniz kaydedildi”, 
		// icermiyorsa “Lutfen gmail mail adresinizi giriniz.. “ yazdirin

		/*Scanner scan=new Scanner(System.in);
		System.out.println("lütfen email adresinizi giriniz");
		String mail=scan.next();
		
		if(mail.contains("@gmail.com")) {
			System.out.println("email adresiniz kaydedildi");
		} else {
			System.out.println("lütfen gmail mail adresinizi giriniz");
		} */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen email adresinizi giriniz");
		String mail=scan.next();
		
		if(mail.contains("@gmail.com")) {
			System.out.println("Email adresiniz kaydedildi");
		}else {
			System.out.println("Lutfen gmail mail adresinizi giriniz..");
		}
		
		scan.close();
	}

}
