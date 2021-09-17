package day08_Temmuz_05_2021_dersi_ternary_operator;

public class Ternary_Operator_01 {  //if else gibidir

	public static void main(String[] args) {
		
	/*	int y = 112;
		
		System.out.println((y>5) ? ("inek"):("koyun"));
		
		*/
		
	/*	int sayi = 75;
		String sonuc = sayi%2 == 0 ? "sayı çift": "sayı tek";
		
		System.out.println(sonuc);
		
	*/
		
		int y = 1; 
		int z = 1;
		
		int a = y<10 ? y++ : z++ ; // y++ post increment
									// ++y pre increment
		
		System.out.println(y + "," + z + "," +a );
		
		// sonuc 2,1,1
		
		
	}

}
