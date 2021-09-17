package day10_Temmuz_07_2021_dersi_String_Manipulation;

public class String_Manipulation_Length {

	public static void main(String[] args) {
		

		String str = "java güzeldir";
		System.out.println(str.length()); //13
		
		System.out.println(" " + 10); //
		System.out.println(' ' + 10); // 42 (space=32 + 10)
		
		String isim = "";
		System.out.println(isim.length()); //0
		
		//String isim = null; //null keyword ve özel bir kelimedir, rezerve kelimedir.
		//System.out.println(isim.length()); // hata verir.
		
		System.out.println(str.length()-1);//son harfinin indexi
	}

}
