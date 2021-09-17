package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru6 {

	public static void main(String[] args) {
		// 0 ile 3 arasinda girilen sayiyı bulma
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 0 ile 3 arasinda bir sayi giriniz");
		int sayi=scan.nextInt();
		
		switch(sayi) {
		
		case 0:
			System.out.println("girdiğiniz sayı 0'dir");
			break;
		case 1:
			System.out.println("girdiğiniz sayı 1'dir");
			break;
		case 2:
			System.out.println("girdiğiniz sayı 2'dir");
			break;
		case 3:
			System.out.println("girdiğiniz sayı 3'dür");
			break;
		default:
			System.out.println("yanlış sayı girdiniz");
		
		}
		
		scan.close();
		

	}

}
