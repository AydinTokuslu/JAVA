package day12_Temmuz_09_2021_dersi_String_Manipulation;

public class örnek5_deneme {

	public static void main(String[] args) {
		/* String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
		 String str1 = “$13.99”
		String str2 = “$10.55”
		ipucu : Double.parseDouble() methodunu kullanabilirsiniz.*/

		String str1 = "$13.99";
		String str2 = "$10.55";
		
		str1=str1.replace("$", "");
		str2=str2.replace("$", "");
		
		Double sayi1 = Double.parseDouble(str1);
		Double sayi2 = Double.parseDouble(str2);
		
		System.out.println("iki string ifadenin toplamı : " + (sayi1+sayi2));
		
		
	}

}
