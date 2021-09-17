package day34_Agustos_06_2021_dersi_encapsulation_getter_setter;

public class C03_ArabaMain {//4.ncu step

	public static void main(String[] args) {
		//5.nci step
		C04_Araba volvo=new C04_Araba("xc90", "beyaz", -2400, -2020);             //5.nci step
		C04_Araba audi=new C04_Araba("Q7", "bej", -3000, -2021);                  //5.nci step
		C04_Araba honda=new C04_Araba();//default parametresiz cons var iken      //5.nci step
		
		honda.model="civic";
		honda.renk="gri";
		honda.setYil(1999);
		honda.setMotor(1400);
		
		System.out.println("honda yil : "+honda.getYil());//1999
		System.out.println("honda motor : "+honda.getMotor());//1400
		
		System.out.println("volvo motor : "+volvo.getMotor());//2400
		System.out.println("audi yil : "+audi.getYil());//2021
		
		
		
		

	}

}
