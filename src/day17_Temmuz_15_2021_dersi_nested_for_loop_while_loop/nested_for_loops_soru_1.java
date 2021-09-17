package day17_Temmuz_15_2021_dersi_nested_for_loop_while_loop;

import java.util.Scanner;

public class nested_for_loops_soru_1 {

	public static void main(String[] args) {
		/*  Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
		 *
		 * *
		 * * *
		 * * * *             */

		
		Scanner scan=new Scanner(System.in);
		System.out.print("lutfen bir rakam giriniz: ");
		int rakam=scan.nextInt();
		   
        // mesela kullanici 5 girmis olsun
        
        for (int satirNo = 1; satirNo <=rakam; satirNo++) {
            
            for (int i = 1; i <=satirNo ; i++) {
                System.out.print("* ");
                
            }
            
            System.out.println("");
        }
		
		
                
            scan.close();
		
		
	}

}
