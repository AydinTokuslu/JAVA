package day01_Haziran_26_2021_dersi_Variables_Scanner;

public class C01_variables {

	public static void main(String[] args) {
		
		// farklı 3 data türünde variable oluşturun ve bunları yazdırın
		
		String str = "Merhaba";  //satır sonu mutlaka ; ile bıtecek
		
		System.out.println(str);
		
		System.out.println("kelime");
		
		int sayi = 20;
		
		System.out.println(sayi);
		
		System.out.println("girilen sayı : " + sayi);
		
		boolean tatildeMi = true;
		
		System.out.println(tatildeMi);
		
		// konsolda bu sene tatile gittin mi ? = true
		// çıktı böyle olacak : bu sene tatile gittin mi ? = true
		
		System.out.println("bu sene tatile gittin mi ? = " + tatildeMi);
		
		/*
		 isim ve soyisim için iki variable oluşturun 
		 isminiz : Aydın
		 soyisminiz : Tokuşlu
		 bu şekilde yazdırıcaz 
		 	*/
		
		String name = "Aydın";
		String surname = "Tokuşlu";
		
		System.out.println("isminiz : " + name);
		System.out.println("soyisminiz : " + surname);
		System.out.println("isminiz : " + name + "soyisminiz : " + surname);
		
		// 2 farklı tamsayı data türünde 2 variable oluşturun ve bunların toplamını yazdırın.
		
		int sayi1 = 10;
		byte sayi2 = 5;
		
		System.out.println(sayi1 + sayi2);
		
		System.out.println("iki sayının toplamı =" + sayi1 + sayi2);
		
		// string ve sayılsal işlemleri birlikte yaptığımızda matemetiksel işlemleri parantez içine alın. 
		
		System.out.println("iki sayının toplamı =" + (sayi1 + sayi2));
		
		// bir tamsayı ve bir ondalıklı variable oluşturun ve bunların toplamını yazdırın.
		
		int sayi3 =15;
		double sayi4 = 3.0;
		
		System.out.println(sayi3 + sayi4);
		
		int sayi5 =15;
		double sayi6 = 3.14;
		
		System.out.println(sayi5 + sayi6);
		
		System.out.println("toplam = " + (sayi5 + sayi6));
		
		// char data türünde bir variable oluşturun ve yazdırın.
		// har ile tek harf karakter yazdırabiliriz ve tek tırnak içinde gösteririz.
		
		char karakter = '?';
		
		System.out.println(karakter);
		System.out.println("girilen karakter : " + karakter);
		
		// bir tamsayı, bir de char değişken oluşturun ve bunların toplamını yazdırın
		
		int sayi7=20;
		char harf='M';
		
		System.out.println(sayi7 + harf); 
		// char data türündeki değişkenler matematiksel işlemlerde kullanılırsa ASCII tablosu devreye girer.
		// java o karakter yerine ASCII tablosundaki değeri kullanır.
		
		
		
		
		
		
		
		
		
	}

}
