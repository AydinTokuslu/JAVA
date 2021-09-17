package day39_Agustos_12_2021_dersi_overriding_uzerineYazma_yokSayma_altiniEzme;

public class Dog extends Animal{

	@Override //Annotation (eklenti, aciklama)----> mutlaka child‘a yazilir. Parent ve child methodlarinda override iliskisi kurar.
	public void beslenme (){
		System.out.println("kemik ile beslenir");

	}

	@Override
	public void tatli() {
		System.out.println("fistik sarma");
	}

	@Override
	protected String icecek() {
		System.out.println("tursu suyu");
		return "yarasin";
	}

	@Override
	public Integer topla() {
		return 41+54;
	}

	
	
	
	
}
