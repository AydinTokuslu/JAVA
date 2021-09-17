package sorucozumleri_19_temmuz_2021;

public class ODEV_soru19 {

	public static void main(String[] args) {
		/*
	     Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
	            Sonuç böyle olmalıdır;
	                   *
	                  * *
	                 * * *
	                * * * *
	               * * * * *
	     */

	   


	        for ( int satir = 1; satir < 6; satir++) {//satır kontrolu

	            for (int bosluk = 7- satir; bosluk > 1; bosluk--) {//bosluklari 4,3,2,1 tane yazdırmalıyım
	                System.out.print(" ");
	            }

	            for (int yildiz =  satir ; yildiz >=1; yildiz--) {//yıldız kontrolu
	                System.out.print("* ");//"*" yapılırsa sağa dayalı üçgen olur
	            }

	            System.out.println();
	        }

	}

}
