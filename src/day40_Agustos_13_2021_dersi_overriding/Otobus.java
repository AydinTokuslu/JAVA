package day40_Agustos_13_2021_dersi_overriding;

public class Otobus extends Arac{

	int yolcuSayisi;

	public Otobus(String renk, int motor, String model, int yolcuSayisi) {
		super(renk, motor, model);//bu ozellikler parentten gelen fields‘lar
		this.yolcuSayisi = yolcuSayisi;
	}

	@Override
	public String toString() {
		return "Otobus [yolcuSayisi=" + yolcuSayisi + ", model=" + model+" " + getRenk()
				+" "+ getMotor()+" " + getModel() +
				 ", toString()=" + super.toString() + "]";
	}

	

}
