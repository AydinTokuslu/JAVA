package day35_Agustos_07_2021_dersi_encapsulation;

import java.util.Scanner;

public class C10_EmployeesMain {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("adinizi giriniz : ");
		String name=scan.nextLine();
				
		System.out.print("dogum tarihinizi MM/dd/yyyy giriniz : ");
		String dod=scan.nextLine();
				
		System.out.print("talep ettiginiz maasinizi giriniz : ");
		int salary=scan.nextInt();
		
		C09_Employees calisan=new C09_Employees();
		calisan.setDob(dod);
		calisan.setName(name);
		calisan.setSalary(salary);
		int calisanYas=calisan.yasHesapla(dod);
		
		if(calisanYas>18) {
			System.out.println("Welcome to our company"+ name+"your salary is :"+ salary);
			
		}else if(calisanYas<18) {
			System.out.println("come back when you are 18 years old.");
		}else if(calisanYas==18) {
			System.out.println("we can have inter with you after that you can have a "+ salary+ "salary");
		}
		
	}

}
