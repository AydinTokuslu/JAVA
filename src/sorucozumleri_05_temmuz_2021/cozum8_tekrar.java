package sorucozumleri_05_temmuz_2021;

import java.util.Scanner;

public class cozum8_tekrar {

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
		System.out.println("lütfen aracınınız hızını giriniz");
		int hiz=scan.nextInt();
		
		System.out.println("lütfen ehliyetiniz varsa 1 yoksa 0 yazınız");
		int ehliyet=scan.nextInt();
		
		if(ehliyet==1) {
			if (54<hiz && hiz<75) {
				System.out.println("cezanız 100$'dır.");
			}
			else if(76<hiz && hiz<85) {
				System.out.println("cezanız 150$'dır.");
			}else if(86<hiz && hiz<94) {
				System.out.println("cezanız 320$'dır.");
			} else if (hiz>94){
				System.out.println("cezanız 500$'dır.");
			}
			
		} else {
			if (54<hiz && hiz<75) {
				System.out.println("cezanız 300$'dır.");
			}
			else if(76<hiz && hiz<85) {
				System.out.println("cezanız 350$'dır.");
			}else if(86<hiz && hiz<94) {
				System.out.println("cezanız 520$'dır.");
			} else if (hiz>94){
				System.out.println("cezanız 700$'dır.");
			}else {
				System.out.println("ezanız 350$'dır.");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
