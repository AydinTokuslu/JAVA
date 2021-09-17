package sorucozumleri_09_agustos_2021;

import java.util.Scanner;

public class BMIMain {

	public static void main(String[] args) {
		/*
	      1 ) BMI ve MainBMI class'ları creat ediniz
	      2 ) BMI class'ı için field'ları name(String), age(int), weight(double) ve height(double) olan veriable'lar oluşturup tüm veriableleri encapsule ediniz.
	      3 ) tüm  field'ları setter getter ve  constructor creat ediniz.
	      4 ) bmi=weight/(height*height) formulüne göre bmi hesaplayan bir method creat ediniz.
	      5 ) bmi 18.5 ten kucukse zayif, 25 ten kucukse normal, 30 dan kucukse kilolu, 30 ustu obez durumunu veren method creat ediniz.
	      6 ) MainBMI de  bu değereli yazdırınız.
	        */
		
		
		BMI kisi = new BMI("Aydin", 43, 102, 1.83);
		
		System.out.println(kisi.getName()+" bey "+ kisi.bmiHesapla()+" "+kisi.bmiDurumu());
		
		
		
		
		
		
		

	}

}
