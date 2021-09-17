package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru3 {

	public static void main(String[] args) {
		// girilen sayinin Pozitif, Negatif, ya da 0 Olduğunu bulma
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir sayı giriniz");
		int sayi=scan.nextInt();
		
		if(sayi<0) {
			System.out.println("girdiğiniz sayı negatiftir");
		}else if (0<sayi){
			System.out.println("girdiğiniz sayı pozitiftir");
		}else {
			System.out.println("girdiğiniz sayı 0'dır.");
		}
		scan.close();
	}

}
