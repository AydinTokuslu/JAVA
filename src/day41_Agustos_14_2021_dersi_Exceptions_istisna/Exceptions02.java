package day41_Agustos_14_2021_dersi_Exceptions_istisna;

import java.util.Scanner;

public class Exceptions02 {

	public static void main(String[] args) {
		//kullanicidan alacagimiz iki tam sayinin bolumunu yazdiriniz. 
		
				Scanner scan=new Scanner(System.in);
				int count= 1;
				while(count<=3) {
					System.out.print("bolunen sayiyi giriniz");
					int sayi1=scan.nextInt();
					
					System.out.print("bolen sayiyi giriniz");
					int sayi2=scan.nextInt();
					
					try {
						System.out.print("bolum : " + sayi1/sayi2);
					} catch (ArithmeticException e) {
						System.out.println("bolme isleminde bolen 0 olamazzzzzz!!!!!! ");
						System.out.println(e.getMessage());//by zero ---> handle edilecek veridir.
						e.printStackTrace();//java.lang.ArithmeticException: / by zero
				}       // bolunen sayiyi girinizjava.lang.ArithmeticException: / by zero
					//at day41_Agustos_14_2021_dersi_Exceptions_istisna.Exceptions02.main(Exceptions02.java:20)
					// hatanin handle edilmesi icin tum verileri yazdirildi.
				
				count++;
				
				

	}

}
}
