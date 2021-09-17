package sorucozumleri_13_temmuz_2021;

import java.util.Scanner;

public class ODEV_soru9_string_manipulation {

	public static void main(String[] args) {
		/* Problem Tanımı :
        Basit 4 işlem yapan bir hesap makinesi methodu kodlayınız....
        Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
        Kullanicidan iki sayi girmesini isteyiniz.
        Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
      */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("yapmak istediginiz 4 islemi seciniz, toplama icin +, cikarma icin -, carpma icin * ve bolme icin / giriniz");
		char islem=scan.next().charAt(0);
		
		System.out.println("lutfen enter‘a basarak 2 sayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		
		switch(islem) {
		case '+' :
			System.out.println("istediginiz toplama islemi icin sonuc : " + (sayi1+sayi2));
			break;
		case '-' : 
			if(sayi1>sayi2) {
				System.out.println("istediginiz cikarma islemi icin sonuc : " + (sayi1-sayi2));
			}else {
				System.out.println("istediginiz cikarma islemi icin sonuc : " + (sayi2-sayi1));
			}
			break;
		case '*' : 
			System.out.println("istediginiz carpma islemi icin sonuc : " + (sayi1*sayi2));
			break;
		case '/' : 
			if(sayi1>sayi2) {
				System.out.println("istediginiz bolme islemi icin sonuc : " + (sayi1/sayi2));
			}else {
				System.out.println("istediginiz bolme islemi icin sonuc : " + (sayi2/sayi1));
			}
			break;
			
		default :
			System.out.println("hatali islem girdiniz");
			
		}
		
	scan.close();
	
		

	}

}
