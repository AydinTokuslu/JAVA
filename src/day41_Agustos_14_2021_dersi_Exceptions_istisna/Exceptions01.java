package day41_Agustos_14_2021_dersi_Exceptions_istisna;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		
		//kullanicidan alacagimiz iki tam sayinin bolumunu yazdiriniz. 
		
		Scanner scan=new Scanner(System.in);
		System.out.print("bolunen sayiyi giriniz");
		int sayi1=scan.nextInt();
		
		System.out.print("bolen sayiyi giriniz");
		int sayi2=scan.nextInt();
		
		try {
			System.out.print("bolum : " + sayi1/sayi2);
		} catch (ArithmeticException e) {
			System.out.println("bolme isleminde bolen 0 olamazzzzzz!!!!!! ");
		}//e : ArithmeticException class‘indan data type 
		//ArithmeticException lan bir exception obj
		// manuel handle yaptik
		

	}

}
