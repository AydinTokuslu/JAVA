package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru21 {

	public static void main(String[] args) {
		/* Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
		 * musteri karti olup olmadigini sorun
		 * 
		 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
		 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10 indirim yapin
		 */

		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen kas adet urun satin aldiginizi sayi giriniz");
		int urun=scan.nextInt();
		
		System.out.println("lutfen satin aldiginiz urunun liste fiyatini yaziniz");
		int liste_fiyat=scan.nextInt();
		
		System.out.println("lutfen musteri kartinizin olup olmadigini giriniz, varsa 1 yoksa 0 yaziniz.");
		int musteri_kart=scan.nextInt();
		
		int toplam_odeme=urun*liste_fiyat;
		
		if(musteri_kart==1) {
			if(urun>10) {
				System.out.println("kazandiginiz indirim orani %20‘dir ve yapacaginiz toplam odeme :" + (toplam_odeme*0.8));
			}else {
				System.out.println("kazandiginiz indirim orani %15‘dir ve yapacaginiz toplam odeme :" + (toplam_odeme*0.85));
			}
						
		}else if (musteri_kart==0){
			if(urun>10) {
				System.out.println("kazandiginiz indirim orani %15‘dir ve yapacaginiz toplam odeme :" + (toplam_odeme*0.85));
			}else {
				System.out.println("kazandiginiz indirim orani %10‘dur ve yapacaginiz toplam odeme :" + (toplam_odeme*0.9));
			}
		}else {
			System.out.println("hatali giris yaptiniz");
		}
		
		scan.close();
		
		
	}

}
