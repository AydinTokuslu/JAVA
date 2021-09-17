package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru17 {

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
		System.out.println("lutfen cm olarak boyunuzu giriniz");
		double boy=scan.nextDouble()/100;
		
		System.out.println("lutfen kg olarak kilonuzu giriniz");
		double kilo=scan.nextDouble();
		
		double bmi=kilo/(boy*boy);
		
		if(bmi<=20) {
			System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Oldukca Zayifsiniz");
		}else if(20<bmi && bmi<=25) {
			System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Normal sinirlardasiniz");
		}else if(25<bmi && bmi<=30) {
			System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Sisman kategorisindesiniz");
		}else {
			System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Obez grubundasiniz.");
		}
		
		scan.close();
		

	}

}
