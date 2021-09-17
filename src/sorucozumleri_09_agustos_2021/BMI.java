package sorucozumleri_09_agustos_2021;

public class BMI {

	private String name;
	private int age;
	private double weight;
	private double height;
	
	
	
	public BMI(String name, int age, double weight, double height) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	public double bmiHesapla() {
		double bmi=weight/(height*height);
		return bmi;
	}
	
	public String bmiDurumu() {
		double bmi=bmiHesapla();
		
		if(bmi<18.5) {
			return ("zayifsiniz");		
		}else if(bmi<25) {
			return ("normalsiniz");
		}else if(bmi<30) {
			return ("kilolusunuz");
		}else 
			return ("obezsiniz");
	}
	
	
}
