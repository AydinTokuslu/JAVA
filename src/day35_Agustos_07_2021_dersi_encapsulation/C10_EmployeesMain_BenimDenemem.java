package day35_Agustos_07_2021_dersi_encapsulation;

import java.util.Scanner;

public class C10_EmployeesMain_BenimDenemem {

	public static void main(String[] args) {
		/* TODO
	    Burada iki adet class vardır. Biri Main diğeri ise Employees,
	    Employees(Çalışanlar) class'ında;
	    Bu variable'ları oluşturunuz;
	    private String name,
	    private int salary,
	    private String dob (date of birth) (Doğum tarihi)
	    getter ve setter oluşturunuz.
	 Main class'ın içinde; kullanicidan name dob ve salary bilgilerini alip
	    Eğer employee 18 yaşında büyükse, Welcome to our company Fernando your salary is 80000. yazdırınız.
	    Eğer Fernando 18 yaşından küçükse, come back when you are 18 years old. yazdırınız.
	    Eğer Fernando 18 yaşındaysa,  we can have inter with you after that you can have a 80000 salary yazdırınız.
	  Örnek:
	    Name is Fernando
	    dob is 11/23/2000
	    Salary is 80000
	todo  ageCalculator isminde bir method oluşturunuz. Şuanki tarih - doğum yılı = employee age
	*/
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen adinizi giriniz");
		String name=scan.nextLine();
		
		System.out.println("lutfen dogum tarihinizi MM/dd/yyyy olarak giriniz");
		String dod=scan.nextLine();
		
		System.out.println("lutfen istediginiz maas miktarini giriniz");
		int salary=scan.nextInt();
		
		C09_Employees_BenimDenemem calisan=new C09_Employees_BenimDenemem();
		calisan.setName(name);
		calisan.setDob(dod);
		calisan.setSalary(salary);
		int calisanYas=calisan.yasHesapla(dod);
		
		if(calisanYas>18) {
			System.out.println("Welcome to our company "+ calisan.getName()+" your salary is "+ calisan.getSalary());		
		}else if(calisanYas<18) {
			System.out.println("come back when you are 18 years old.");
		}else if(calisanYas==18) {
			System.out.println("we can have inter with you after that you can have a " + calisan.getSalary()+" salary");
		}
		
		
		
		
		
		
		

	}

}
