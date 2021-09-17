package day35_Agustos_07_2021_dersi_encapsulation;

import java.util.Scanner;

public class C08_BookMain {

	public static void main(String[] args) {
		
		C07_Book kitap=new C07_Book();
		
		Scanner scan=new Scanner(System.in);
		System.out.print("son okudugunuz kitabi giriniz : ");
		String kitap2=scan.nextLine();
		
		kitap.setBookName("calikusu");
		kitap.setAuthorName(kitap2);
		System.out.println("1.nci kitabim : "+ kitap.getBookName()+" 2nci kitabim : "+kitap.getAuthorName());

	}

}
