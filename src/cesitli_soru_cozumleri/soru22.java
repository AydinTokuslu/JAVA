package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru22 {

	public static void main(String[] args) {
		 /*
        Kulanıcıdan aracının hızını alınız
        Trafik cezasının değerini hesaplayın.
            45 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.
            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.
            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.
            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.
            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.
            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.
-----------------------------------------
            Örn;
            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;
            sonuç 320 olmalıdır.
            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;
            sonuç 300 olmalıdır.
     */

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen ehliyetiniz olup olmadigini giriniz, ehliyet varsa 1 yoksa 0 yaziniz.");
		int ehliyet=scan.nextInt();
		
		System.out.println("lutfen mevcut hizinizi giriniz");
		int hiz=scan.nextInt();
				
		if(ehliyet==1) {
			if(hiz>54 && hiz<=74) {
				System.out.println("hiz sinirini asdiginiz icin cezaniz 100$‘dir.");
			}else if(hiz>=75 && hiz<=84) {
				System.out.println("hiz sinirini asdiginiz icin cezaniz 150$‘dir.");
			}else if(hiz>=85 && hiz<=94) {
				System.out.println("hiz sinirini asdiginiz icin cezaniz 320$‘dir.");
			}else if(hiz>=95){
				System.out.println("hiz sinirini asdiginiz icin cezaniz 500$‘dir.");
			}else {
				System.out.println("hiz sinirinda seyehat ediyorsunuz, iyi yolculuklar.");
			}
			
		}else if(ehliyet==0) {
			if(hiz>54 && hiz<=74) {
				System.out.println("hiz sinirini asdiginiz icin cezaniz 300$‘dir.");
			}else if(hiz>=75 && hiz<=84) {
				System.out.println("hiz sinirini asdiginiz icin cezaniz 350$‘dir.");
			}else if(hiz>=85 && hiz<=94) {
				System.out.println("hiz sinirini asdiginiz icin cezaniz 520$‘dir.");
			}else if(hiz>=95){
				System.out.println("hiz sinirini asdiginiz icin cezaniz 700$‘dir.");
			}else {
				System.out.println("ehliyetsiz arac kullandiginiz icin cezaniz 200$‘dir.");
			}
		}else {
			System.out.println("lutfen gecerli bir deger giriniz.");
		}
		scan.close();

	}

}
