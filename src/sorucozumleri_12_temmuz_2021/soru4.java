package sorucozumleri_12_temmuz_2021;

import java.util.Scanner;

public class soru4 {

	public static void main(String[] args) {
		/*
	     * Bakıye öğrenme para çekme yatırma ve 
	     * çıkış işlemlerinin olduğu bir bankamatik pr kodlayınız
	     */
		
		System.out.println("************************************ ");
		System.out.println("JAVA BANK ATM‘ye Hosgeldiniz ");
		
		System.out.println("lutfen seciminizi seciniz : \n1. islem bakiye sorgulama \n2. islem Para Cekme \n3. islem Para Yatirma \n4. islem Cikis ");
		
		int bakiye=5000;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("lutfen yapacaginiz islemi seciniz: ");
		int secim=scan.nextInt();
		
		switch (secim) {
		case 1:{
			System.out.print("bakiyeniz : " + bakiye);
			break;
		}
		case 2:{
			System.out.print("cekeceginiz miktari giriniz : ");
			int cekilenMiktar=scan.nextInt();
			if(cekilenMiktar>bakiye) {
				System.out.print("bakiyeniz yeterli degil ");
			}else {
				bakiye-=cekilenMiktar;
				System.out.print("yeni bakiyeniz : " + bakiye);
			}
			break;
		}
		case 3:{
			System.out.print("yatiracaginiz miktari giriniz : ");
			int yatirilanMiktar=scan.nextInt();
			bakiye+=yatirilanMiktar;
			System.out.print("yeni bakiyeniz : " + bakiye);
			
			break;
		}
		case 4:{
			System.out.print("islemden cikisiniz yapiliyor");
			break;
		}

		default:
			break;
		}
		

	}

}
