package sorucozumleri_09_agustos_2021;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		/* TODO
	    Burada iki adet class vardır. Biri Main, diğeri ise student ,
	    student classı içinde;
	    String name(isim) ve int age(yaş) isminde variables(değişkenler) oluşturunuz.
	    getter ve setter ( alıcı ve ayarlayıcı ) oluşturunuz.
	todo  Main classın içinde;
	    Örnek:
	    age 12'dir.
	    name Steven'dır.
	todo  name(isim) olarak;
	    "Student name is Steven"
	    ve
	    age(yaş) olarak da;
	    "He is 12 years old"
	 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen isminizi giriniz");
		String name=scan.nextLine();
		
		System.out.println("lutfen yasinizi giriniz");
		int age=scan.nextInt();
		
		Student student1=new Student();
		student1.setName(name);
		student1.setAge(age);
		
		System.out.println("ogrencinin adi : " + student1.getName()+" ve yasi : "+student1.getAge());
		

	}

}
