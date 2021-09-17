package sorucozumleri_12_temmuz_2021;

import java.util.Scanner;

public class cevap4_deneme {

	public static void main(String[] args) {
		/*
	     * Bakıye öğrenme para çekme yatırma ve 
	     * çıkış işlemlerinin olduğu bir bankamatik pr kodlayınız
	     */
		
		System.out.println("***********************************");
		System.out.println("     java banka hosgeldiniz      ");
		System.out.println("***********************************");
		System.out.println("yapabileceginiz islemler : \n1. Bakiye ogrenme \n2. Para cekme \n3. Para yatirma \n4. Cikis");
		
		int bakiye=5000;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("yapacaginiz islemi seciniz");
		int secim=scan.nextInt();
		
		switch (secim) {
		case 1:{
			System.out.println("mevcut bakiyeniz : " + bakiye);
			break;
		}
		case 2:{
			
			System.out.println("lutfen cekmek istediginiz para miktarini giriniz.");
			int cekilenPara=scan.nextInt();
			if(cekilenPara>bakiye) {
				System.out.println("bu islem icin bakiyeniz yeterli degildir. ");
			}else {
				bakiye-=cekilenPara;
				System.out.println("yeni bakiyeniz : " + bakiye);
			}
			break;
		}
		case 3:{
			System.out.println("lutfen yatirmak istediginiz para miktarini giriniz.");
			int yatirilanPara=scan.nextInt();
			bakiye+=yatirilanPara;
				System.out.println("yeni bakiyeniz : " + bakiye);
			
			break;
		}
		case 4:{
			System.out.println("islemden cikis yapiliyor...");
			break;
		}
		default:
			System.out.println("hatali islem sirasi girdiniz");
			break;
		}
		
		scan.close();
		
		

	}

}
