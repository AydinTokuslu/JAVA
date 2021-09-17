package sorucozumleri_12_temmuz_2021;

import java.util.Scanner;

public class soru2 {

	public static void main(String[] args) {
		// 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

		Scanner scan=new Scanner(System.in);
		System.out.print("lutfen 3 basamakli bir sayi giriniz : ");
		int sayi=scan.nextInt();
		
		int yuzler=sayi/100;
		int onlar=(sayi/10)%10;
		int birler=sayi%10;
		
		switch(yuzler) {
		case 1:{
			System.out.println("bir");
			break;
		}
		case 2:{
			System.out.println("iki");
			break;
		}
		case 3:{
			System.out.println("uc");
			break;
		}
		case 4:{
			System.out.println("dort");
			break;
		}
		case 5:{
			System.out.println("bes");
			break;
		}
		case 6:{
			System.out.println("alti");
			break;
		}
		case 7:{
			System.out.println("yedi");
			break;
		}
		case 8:{
			System.out.println("sekiz");
			break;
		}
		case 9:{
			System.out.println("dokuz");
			break;
		}
		}System.out.println("yuz");
		
		switch(onlar) {
		case 1:{
			System.out.println("on");
			break;
		}
		case 2:{
			System.out.println("yirmi");
			break;
		}
		case 3:{
			System.out.println("otuz");
			break;
		}
		case 4:{
			System.out.println("kirk");
			break;
		}
		case 5:{
			System.out.println("elli");
			break;
		}
		case 6:{
			System.out.println("altmis");
			break;
		}
		case 7:{
			System.out.println("yetmis");
			break;
		}
		case 8:{
			System.out.println("seksen");
			break;
		}
		case 9:{
			System.out.println("doksan");
			break;
		}
		}
		
		switch(birler) {
		case 1:{
			System.out.println("bir");
			break;
		}
		case 2:{
			System.out.println("iki");
			break;
		}
		case 3:{
			System.out.println("uc");
			break;
		}
		case 4:{
			System.out.println("dort");
			break;
		}
		case 5:{
			System.out.println("bes");
			break;
		}
		case 6:{
			System.out.println("alti");
			break;
		}
		case 7:{
			System.out.println("yedi");
			break;
		}
		case 8:{
			System.out.println("sekiz");
			break;
		}
		case 9:{
			System.out.println("dokuz");
			break;
		}
		}
		
		
	}

}
