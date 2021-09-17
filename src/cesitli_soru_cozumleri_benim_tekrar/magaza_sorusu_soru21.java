package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class magaza_sorusu_soru21 {

	public static void main(String[] args) {
		/* Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
		 * musteri karti olup olmadigini sorun
		 * 
		 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
		 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10 indirim yapin
		 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen aldiginiz urunun adedini ve fiyatini aralarinda ENTER‘a basarak giriniz");
		int urun=scan.nextInt();
		int fiyat=scan.nextInt();
		
		System.out.println("lutfen musteri kartinizin olup olmadigini TRUE/FALSE olark giriniz");
		boolean kart=scan.nextBoolean();
		
		int odeme=urun*fiyat;
		
		if(kart==true) {
			if(urun>10) {
				System.out.println("aldiginiz urunlerin ucreti icin odeyeceginiz para : "+ (odeme*0.80)+" tldir.");
			}else {
				System.out.println("aldiginiz urunlerin ucreti icin odeyeceginiz para : "+ (odeme*0.85)+" tldir.");
			}
		}else if(kart==false){
			if(urun>10) {
				System.out.println("aldiginiz urunlerin ucreti icin odeyeceginiz para : "+ (odeme*0.85)+" tldir.");
			}else {
				System.out.println("aldiginiz urunlerin ucreti icin odeyeceginiz para : "+ (odeme*0.90)+" tldir.");
			}
		}else {
			System.out.println("yanlis deger girdiniz");
		}
		
		

	}

}
