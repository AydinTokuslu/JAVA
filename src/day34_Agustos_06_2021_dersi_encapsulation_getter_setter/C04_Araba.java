package day34_Agustos_06_2021_dersi_encapsulation_getter_setter;

/*
1- filedları model(String), renk(String), motor(int), yil (int)
olan Araba  isimli bir class tanımlayınız.
2- bütün fieldları parametre alan bir constructor tanımlayınız.
3- bütün fieldları için getter ve setter metodları oluşturunuz.
4- ArabaMain isminde main method için bir class oluşturunuz.
5- İki adet parametreli const, 1 adet parametresiz cons, ile 3 adet araba creat ediniz
6- aracların motor ve yılını hatalı veri girisine karsi kapsulleyiniz.
*/

public class C04_Araba {

	String model;//1.nci step
	String renk;//1.nci step
	private int motor;//1.nci step     //6.nci step
	private int yil;//1.nci step       //6.nci step
	
	public C04_Araba(String model, String renk, int motor, int yil) {//volvo ve audi uretildi
		super();
		setModel(model);
		setRenk(renk);
		setMotor(motor);
		setYil(yil);
	}//parametreli cons, //2nci step

	public C04_Araba() {//parametresiz cons creat ettik.//5.nci step//honda uretildi
	}

	public String getModel() {//3.ncu step
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {//6.nci step
		if(motor>0) {
			this.motor = motor;
		}else this.motor = -motor;
	}

	public int getYil() {
		return yil;
	}

	public void setYil(int yil) {//6.nci step
		if(yil>0) {
			this.yil = yil;
		}else this.yil = -yil;
	}
	
	
	
	
	
	
}
