package sorucozumleri_13_temmuz_2021;

import java.util.Scanner;

public class ODEV_soru12 {

	public static void main(String[] args) {
		/*
	     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	     * musteri karti olup olmadigini sorun
	     *
	     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
	     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	     * alirsa %10 indirim yapin
	     */

		Scanner scan=new Scanner(System.in);
		System.out.println("aldiginiz urun sayisini giriniz");
		int urun=scan.nextInt();
		
		System.out.println("aldiginiz urunun liste fiyatini yaziniz");
		int fiyat=scan.nextInt();
		
		System.out.println("musteri kartiniz varsa 1, yoksa 2‘yi giriniz");
		int kart=scan.nextInt();
		
		int odeme=urun*fiyat;
		
		if(kart==1) {
			if(urun>10) {
				System.out.println("%20 indirim hakkiniz var, yapacaginiz odeme : " + (odeme*0.80));
			}else {
				System.out.println("%15 indirim hakkiniz var, yapacaginiz odeme : " + (odeme*0.85));
			}
			
		}else if(kart==2) {
			if(urun>10) {
				System.out.println("%15 indirim hakkiniz var, yapacaginiz odeme : " + (odeme*0.85));
			}else {
				System.out.println("%10 indirim hakkiniz var, yapacaginiz odeme : " + (odeme*0.9));
			}
			
		
		}else {
			System.out.println("hatali giris yaptiniz");
		}
		scan.close();
		
		
	}

}
