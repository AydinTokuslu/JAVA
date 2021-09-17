package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru15 {

	public static void main(String[] args) {
		/*
		 * Kuulanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen iki adet sayi giriniz ve 1nci sayi girisinden sonra ENTER‘a basiniz");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println("lutfen yapmak istediginiz dort islemi giriniz :\ntoplama icin 1\ncikarma icin 2\ncarpma icin 3\nbolme icin 4\n");
		int dortislem=scan.nextInt();
		
		if(dortislem==1) {
			System.out.println("toplama isleminin sonucu : " + sayi1 + "+" + sayi2 + "=" + (sayi1+sayi2));
		}else if(dortislem==2) {
			System.out.println("cikarma isleminin sonucu : " + sayi1 + "-" + sayi2 + "=" + (sayi1-sayi2));
		}else if (dortislem==3) {
			System.out.println("carpma isleminin sonucu : " + sayi1 + "*" + sayi2 + "=" + (sayi1*sayi2));
		}else if (dortislem==4) {
			System.out.println("bolme isleminin sonucu : " + sayi1 + "/" + sayi2 + "=" + (sayi1/sayi2));
		}else {
			System.out.println("hatali giris yaptiniz.");
		}
		
		scan.close();

	}

}
