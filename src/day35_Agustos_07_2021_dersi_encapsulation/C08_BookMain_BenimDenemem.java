package day35_Agustos_07_2021_dersi_encapsulation;

import java.util.Scanner;

public class C08_BookMain_BenimDenemem {

	public static void main(String[] args) {
		/*
		Book class'ı verilmiştir.
	    İki tane attributes oluşturunuz.
	    bookName ve authorName (String ile)
	    Book class'ını kapsülleyin. (Encapsulate)
	    Main class'ın içine object  oluşturun ve sonucu yazdırınız.

	todo  "Book name is BOOKNAME and Author is AUTHORNAME"
	*/
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("okudugunuz kitabin ismini giriniz");
		String kitap=scan.nextLine();
		
		System.out.println("okudugunuz kitabin yazarinin ismini giriniz");
		String yazar=scan.nextLine();
		
		C07_Book_BenimDenemem kitapOkuma=new C07_Book_BenimDenemem();
		kitapOkuma.setAuthorName(yazar);
		kitapOkuma.setBookName(kitap);
		
		System.out.println("Book name is : "+ kitapOkuma.getBookName()+" and Author is "+kitapOkuma.getAuthorName());
		
		
		

	}

}
