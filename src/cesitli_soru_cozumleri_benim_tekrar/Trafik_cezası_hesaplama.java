package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class Trafik_cezası_hesaplama {

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
		System.out.println("lutfen hizinizi giriniz");	
		int hiz=scan.nextInt();
		
		System.out.println("lutfen ehliyetiniz varsa true, yoksa false giriniz");
		boolean ehliyet=scan.nextBoolean();
		
		if(ehliyet==true) {
			if(hiz>=55 && hiz <=74) {
				System.out.println("odeyeceginiz trafik cezasi 100$‘dir");
			}else if(hiz>=75 && hiz <=84) {
				System.out.println("odeyeceginiz trafik cezasi 150$‘dir");
			}else if(hiz>=85 && hiz <=94) {
				System.out.println("odeyeceginiz trafik cezasi 320$‘dir");
			}else if(hiz>94) {
				System.out.println("odeyeceginiz trafik cezasi 500$‘dir");
			}
			
		}else if(ehliyet==false) {
			if(hiz>=55 && hiz <=74) {
				System.out.println("odeyeceginiz trafik cezasi 300$‘dir");
			}else if(hiz>=75 && hiz <=84) {
				System.out.println("odeyeceginiz trafik cezasi 350$‘dir");
			}else if(hiz>=85 && hiz <=94) {
				System.out.println("odeyeceginiz trafik cezasi 520$‘dir");
			}else if(hiz>94) {
				System.out.println("odeyeceginiz trafik cezasi 700$‘dir");
		}else {
			System.out.println("yanlis deger girdiniz");
		}
		
		
		
		
		}
		
		

	}

}
