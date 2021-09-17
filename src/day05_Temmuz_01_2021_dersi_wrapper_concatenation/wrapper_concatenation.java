package day05_Temmuz_01_2021_dersi_wrapper_concatenation;

public class wrapper_concatenation {

	public static void main(String[] args) {

		String isim = "mehmet";
		int sayi2 = 10;
		System.out.println(sayi2);

		String okulno = "858";
		int okulnosayiolarak = Integer.parseInt(okulno); // okul no'yu int ayıya çevirmek ve sayıyı 1 artırmak
		System.out.println(okulnosayiolarak);
		System.out.println(++okulnosayiolarak);

		Character basharf = 'a';
		System.out.println(basharf.charValue());
		
		
		String a = "Hello";
		int b = 2;
		int c = 3;
		System.out.println(a+b+c); //Hello23
		System.out.println(c+b+a); //5Hello
		System.out.println(a+(b+c)); //Hello5
		System.out.println(a+b*c); // önce çarpma geldiği için önce çarpmayı sonra concatenation gelir, Hello6
		
		
		
		

	}

}
