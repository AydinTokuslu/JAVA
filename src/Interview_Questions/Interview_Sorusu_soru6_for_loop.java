package Interview_Questions;

import java.util.Scanner;

public class Interview_Sorusu_soru6_for_loop {

	public static void main(String[] args) {
		/* Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin. 
		 * 1’den baslayarak girilen sayiya kadar tum sayilari yazdirin. 
		 * Ancak;
		 - Sayi 3’un kati ise sayi yerine “Java” yazdirin.
		 - Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
		 - Sayi hem 3’un hem 5’in kati ise sayi yerine 
		 “Java Guzeldir” yazdirin.*/

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 100‘den kucuk pozitif bir sayi giriniz");
		int sayi=scan.nextInt();
		
		for(int i=1 ; i<=sayi ; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.print("Java Guzeldir, ");
			}else if(i % 3 == 0) {
				System.out.print("Java, ");
			}else if(i % 5== 0) {
				System.out.print("Guzeldir, ");
			}else {
				System.out.print(i + ",");
			}
		}
		System.out.println("");
		
		for(int i=1; i<=sayi ; i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(" Java Guzeldir, ");
			}else if(i%3==0) {
				System.out.print(" Java, ");
			}else if(i%5==0) {
				System.out.print(" Guzeldir, ");
			}else {
				System.out.print(i+" , ");
			}
		}
		
		scan.close();
		
		
	}

}
