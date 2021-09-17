package day04_Haziran_30_2021_dersi;

public class C2_Preincrement_Postincrement {

	public static void main(String[] args) {
		
		int sayi1= 20;
		
		int sayi2=++sayi1;
		
		System.out.println("pre-increment sayi1 : " + sayi1);
		
		System.out.println("pre-increment sayi2 : " + sayi2);
		
		sayi2=sayi1++;
		
		System.out.println("pre-increment sayi1 : " + sayi1);
		
		System.out.println("pre-increment sayi2 : " + sayi2);
		
		int sayi3=10;
		
		System.out.println("pre-increment : " + ++sayi3); // önce artırır (11), sonra yazdırır
		
		System.out.println("post-increment : " + sayi3++); // önce yazdırır (11), sonra artırır (12)

		System.out.println("post-increment'tan sonra sayi3 : " + sayi3); //son değer 12 olduğu için bunu gösterir.
		
		
	}

}
