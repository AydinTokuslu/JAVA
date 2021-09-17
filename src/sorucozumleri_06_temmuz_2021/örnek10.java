package sorucozumleri_06_temmuz_2021;

import java.util.Scanner;

public class örnek10 {

	public static void main(String[] args) {
		
		/* TERNARY VE İF İLE YAPILACAK
	    /*
	    A şehrinden uçmak isteyen bir kişi 
	    B şehrine 500km / C şehrine  700km /  D şehrine  900 km mesafededir.
	    km birim fiyati : 0.10$ 
	    12 yasindan kucukse toplam fiyat %50 indirim 
	    12 ve 24 yas arasindaysa 10% indirim
	    65 yasindan buyukse 30% indirim
	    gidis donus bilet alirsa yaş indirimlerinden hariç 20% indirim
	    bu kosullara gore yolcudan gideceği mesafeyi isteyip ucak bilet 
	    ucretini hesaplayan program yazınız
	    */

		Scanner scan=new Scanner(System.in);
		
		System.out.print("BILETINIZ \nTek Yon ise==>0 \nGidis-Donus ise==>1 \ngirip ENTER'a basiniz : ");	
		byte ticket=scan.nextByte();
		
		System.out.print("Gitmek istediginiz sehrin mesafesini giriniz : " );
		double distance=scan.nextInt();
		
		System.out.print("Yasinizi giriniz : ");
		int age=scan.nextInt();
		
		double br=0.1;
		
		if (ticket==0) {
			if (age<0) {
				System.out.print("Lutfen dogru yas araligi giriniz : ");
			}else if (age<12) {
				System.out.print("Ucak bileti ücretiniz : "+(distance*br/2)+" $");//%50
			}else if (age<24) {
				System.out.print("Ucak bileti ücretiniz : "+(distance*br/10*9)+" $");//%10
			}else if (age>65) {
				System.out.print("Ucak bileti ücretiniz : "+(distance*br/10*7)+" $");//%30
			}else {
				System.out.print("Ucak bileti ücretiniz : "+(distance*br)+" $");
			}
				
		}else if (ticket==1) { 
			if (age<0) {
				System.out.print("Lutfen dogru yas araligi giriniz : ");
			}else if (age<12) {
				System.out.print("Ucak bileti ücretiniz : "+(2*distance*br*8/10/2)+" $");//%20-%50
			}else if (age<24) {
				System.out.print("Ucak bileti ücretiniz : "+(2*distance*br*8/10/10*9)+" $");//%20-%10
			}else if (age>65) {
				System.out.print("Ucak bileti ücretiniz : "+(2*distance*br*8/10/10*7)+" $");//%20-%30
			}else {
				System.out.print("Ucak bileti ücretiniz : "+(2*distance*br*8/10)+" $");	//%20																	
			}
		}else {
			System.out.println("Lutfen gecerli bilet tipini giriniz");
		}
			scan.close();		
	






		
		
		
		

	}

}
