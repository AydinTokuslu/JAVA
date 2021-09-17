package day35_Agustos_07_2021_dersi_encapsulation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C09_Employees_BenimDenemem {

	 	private String name;
	    private int salary;
	    private String dob;
		
	    
	    
	    
	    public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
	    
	    public int yasHesapla (String dob) {
	    	String strDate=dob;
	    	LocalDate bugun=LocalDate.now();
	    	DateTimeFormatter format=DateTimeFormatter.ofPattern("MM/dd/yyyy");
	    	LocalDate dtarih=LocalDate.parse(strDate, format);//kullanicinin girdigi MM/dd/yyyy
	    	
	    	int age=bugun.getYear()-dtarih.getYear();//yas=bugunn tarihi -kullanici dogum tarihi
	    	return age;
	    }
	    
	    
	    
	    
	    
	    
	    
	
	
}
