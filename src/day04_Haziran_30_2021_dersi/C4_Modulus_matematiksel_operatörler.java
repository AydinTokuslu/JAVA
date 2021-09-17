package day04_Haziran_30_2021_dersi;

public class C4_Modulus_matematiksel_operatörler {

	public static void main(String[] args) {
		
		//5496 sayısının rakamlarının toplamını bulan program
		
		int sayi=5496;
		int rakamlarToplami=0;
		
		int rakam = sayi%10;
		
		rakamlarToplami += rakam; //rakamlar toplamı 6 burda
		
		sayi /= 10; // sayı burda 549 olur
		
		rakam = sayi%10;  //rakam burda 9 oldu
		
		rakamlarToplami += rakam; //rakamlar toplamı 15 burda
		
		sayi /= 10; // sayı burda 54 olur
		
		rakam = sayi%10;  //rakam burda 4 oldu
		
		rakamlarToplami += rakam; //rakamlar toplamı 19 burda
		
		sayi /= 10; // sayı burda 5 olur
		
		rakam = sayi%10;  //rakam burda 5 oldu
		
		rakamlarToplami += rakam; //rakamlar toplamı 24 burda
		
		System.out.println("girilen 5496 sayısının rakamlarının toplamı : " + rakamlarToplami );
	}

}
