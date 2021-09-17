package day17_Temmuz_15_2021_dersi_nested_for_loop_while_loop;

import java.util.Scanner;

public class ODEV_nested_for_loops_soru_2 {

	public static void main(String[] args) {
		// yildizlardan eskenar ucgen yapalim, 9 girildiginde

		Scanner scan=new Scanner(System.in);
		System.out.print("lutfen bir rakam giriniz: ");
		int rakam=scan.nextInt();
		   
        for (int satirNo = 0; satirNo <=rakam-1; satirNo++) {
            
            for (int i = 0; i <=rakam-satirNo ; i++) {
                System.out.print(" ");
                
            }
            for (int j = 1; j <=(2*satirNo+1) ; j++) {
                System.out.print("*");
                
            } 
            System.out.println(" ");
        }
		
		
                
            scan.close();
		
		
		
		
		
	}

}
