package day18_Temmuz_16_2021_dersi_do_while;

import java.util.Scanner;

public class do_while_soru4 {

	public static void main(String[] args) {
		// 9 den 190 e kadar 7 nin kati olan tum tamsayilari ekrana yazdiriniz.

		Scanner scan=new Scanner(System.in);
		
		//int sayi=0;
		//int rakam=0;
		
		/*for(int i= 9; i<190; i++) {
			if(i%7==0) {
				System.out.print(i +" ");
			}
			
			
		}*/
		
		int i=9;
		do {
            if(i%7==0) {
                System.out.print(i+" ");      
        } 
		i++;
		}
         while (i<=190);

		
		System.out.println("9 den 190 e kadar 7 nin kati olan tum tamsayilar " + i);
		
		
		
	}

}
