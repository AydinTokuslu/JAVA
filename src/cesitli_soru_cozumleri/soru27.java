package cesitli_soru_cozumleri;

import java.util.Scanner;

public class soru27 {

	public static void main(String[] args) {
		 /* Günün sorusu: if statement
	      katsayıları verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.
	        ax^2 + bx + c;
	        Çözüm adımları
	        kullanıcıdan a,b,c yi okutun.
	        Delta = bb - 4ac
	        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
	        Delta = 0 => 1 tane kök vardır x = -b/2a
	        Delta < 0 ise kök yoktur.
	   */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen uc adet pozitif sayi giriniz ve her sayi girisinden sonra ENTER‘a basiniz");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		double delta=b*b-4*a*c;
		
		if(delta>0) {
			double x1=(-b + Math.sqrt(delta)) / (2*a);
			double x2=(-b - Math.sqrt(delta)) / (2*a);
			System.out.println("girdiginiz denklemin iki tane koku vardir\nX1=" +x1 + "X2=" +x2);
		}else if(delta==0) {
			double x=-b/2*a;
			System.out.println("girdiginiz denklemin bir tane koku vardir\nX=" +x);
		}else {
			System.out.println("girdiginiz denklemin koku yoktur");
		}
		
		

	}

}
