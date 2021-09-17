package sorucozumleri_16_agustos_2021_inheritance3;

public class Runner {

	
		/*
		-Hayvanların beslenme,barınma, boyut ve solunum özellikleri  ile ilgili methodlar barınıran Hayvan isminde bir class oluşturalım

		-Hayvan sınıfının SubClassı bir Kuş Classı oluşturalım ve bu class ucma ve barınma methodlarını içersin

		-Hayvan sınıfının SubClassı bir Balık Classı oluşturalım ve bu class yuzme ve Solunum methodlarını içersin

		-kuş sınıfının SubClassı bir Güversin Classı oluşturalım ve bu class beslenme ve boyut methodlarını içersin

		-Balık sınıfının SubCLassı bir JaponBaligi classı oluşturalım ve bu class solunum methodu içersin ve bu methodu Superclasstan alsın

		--Runner class oluşturalım ve oluşturduğumuz methoları çağıralım.
		*/
		
	public static void main(String[] args) {
		
		JaponBaligi jb=new JaponBaligi();
		
		jb.solunum();
		
		Guvercin guvercin=new Guvercin();
		guvercin.beslenme();
		guvercin.boyut();
		
		Kus kus=new Kus();
		kus.barinma();
		kus.ucma();
		
		Balik balik=new Balik();
		balik.solunum();
		balik.yuzme();
		
		Hayvan hayvan=new Hayvan();
		hayvan.barinma();
		hayvan.beslenme();
		hayvan.boyut();
		hayvan.solunum();
		

	}

}
