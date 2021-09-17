package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru2 {

	public static void main(String[] args) {
		// girilen sayinin tek mi cift mi oldugunu bulma

		Scanner scan=new Scanner(System.in);
		System.out.println("lütfen bir sayı giriniz");
		int sayi=scan.nextInt();
		
		if(sayi%2==0){
			System.out.println("girdiğiniz sayı çifttir.");
		}else {
			System.out.println("girdiğiniz sayı tektir");
		}
		
		
	}

}
