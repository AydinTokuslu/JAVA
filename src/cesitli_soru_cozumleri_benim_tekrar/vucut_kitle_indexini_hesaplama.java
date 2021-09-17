package cesitli_soru_cozumleri_benim_tekrar;

import java.util.Scanner;

public class vucut_kitle_indexini_hesaplama {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen boy uzunlugunuzu (1.77 gibi) giriniz");
		double boy=scan.nextDouble();
		
		System.out.println("lutfen kilonuzu giriniz");
		double kilo=scan.nextDouble();
		
		double bmi=kilo/(boy*boy);
		
		if(bmi<=20) {
			System.out.println("vucut kitle indexiniz : "+ bmi +" oldukca zayifsiniz");
		}else if(bmi>20 && bmi<=25) {
			System.out.println("vucut kitle indexiniz : "+ bmi +" Normal sinirlardasiniz ");
		}else if(bmi>25 && bmi<=30) {
			System.out.println("vucut kitle indexiniz : "+ bmi +" Sisman kategorisindesiniz ");
		}else if(bmi>30) {
			System.out.println("vucut kitle indexiniz : "+ bmi +" Obez grubundasiniz. ");
		}else {
			System.out.println("yanlis deger girdiniz");
		}
		
		
		
		
		
		

	}

}
