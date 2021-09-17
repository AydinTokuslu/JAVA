package day11_Temmuz_08_2021_dersi_String_Manipulation;

public class String_Manipulation_replaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String kkNo="1234 5412 3652 4785"; //1nci örnek
		
		System.out.println(kkNo.replace(" ", "")); //aradaki boşlukları yok etti
		
		System.out.println(kkNo); // atama yapılmadığı için ilk değer döner gene
		
		//replaceAll()
		
		System.out.println(kkNo.replaceAll("\\s", "")); // \\s aradaki boşlukları siler
		System.out.println(kkNo.replaceAll("\\s", "*")); // \\s aradaki boşlukları siler
		System.out.println(kkNo.replaceAll("\\S", "*")); // \\S boşluk dışındaki tüm karakterleri başka bir karaktere dönüştürür.
		System.out.println(kkNo.replaceAll("\\w", "-")); // \\w harf ve rakamların hepsi.
		System.out.println(kkNo.replaceAll("\\W", "#")); // \\W harf ve rakamların dışında herşey.
		System.out.println(kkNo.replaceAll("\\d", "0")); // \d digit(rakamların) hepsi.
		System.out.println(kkNo.replaceAll("\\D", "a")); // \\D digit(rakamların) dışında herşey.
		System.out.println(kkNo); // atama yapılmadığı için ilk değer döner gene
		
		//replaceAll()
		
		String kkNo2="Java 123 @#"; //2nci örnek
		
				
		System.out.println(kkNo2.replaceAll("\\s", "")); // \\s aradaki boşlukları siler
		System.out.println(kkNo2.replaceAll("\\s", "*")); // \\s aradaki boşlukları siler
		System.out.println(kkNo2.replaceAll("\\S", "*")); // \\S boşluk dışındaki tüm karakterleri başka bir karaktere dönüştürür.
		System.out.println(kkNo2.replaceAll("\\w", "-")); // \\w harf ve rakamların hepsi.
		System.out.println(kkNo2.replaceAll("\\W", "#")); // \\W harf ve rakamların dışında herşey.
		System.out.println(kkNo2.replaceAll("\\d", "0")); // \d digit(rakamların) hepsi.
		System.out.println(kkNo2.replaceAll("\\D", "a")); // \\D digit(rakamların) dışında herşey.
		System.out.println(kkNo2); // atama yapılmadığı için ilk değer döner gene
		
		
		
	}

}
