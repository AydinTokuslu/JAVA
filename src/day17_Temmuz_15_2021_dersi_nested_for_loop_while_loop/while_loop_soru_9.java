package day17_Temmuz_15_2021_dersi_nested_for_loop_while_loop;

import java.util.Scanner;

public class while_loop_soru_9 {

	public static void main(String[] args) {
		// Kullanicidan baslangic ve bitis degerlerini alin. 
		//Baslangic degeri ve bitis degeri
		//dahil aradalarindaki tum cift tamsayilari 
		//while loop kullanarak ekrana yazdiriniz.

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir baslangic degeri sayi giriniz");
		int sayi1=scan.nextInt();
		
		System.out.println("lutfen bir bitis degeri sayi giriniz");
		int sayi2=scan.nextInt();
		
		int i=sayi1;
		while(i<=sayi2) {
			if(i%2==0) {
				System.out.print(i+" , ");
			}
			i++;
		}
		
		scan.close();
		
		
	}

}
