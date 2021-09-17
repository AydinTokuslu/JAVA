package Replit_sorular;

import java.util.Scanner;

public class soru1 {

	public static void main(String[] args) {
		

		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter your weight");
		int weight=scan.nextInt();

		System.out.println("please enter your height");
		int height= scan.nextInt()/100;

		double bmi=weight/(height*height);

		if (bmi<18.5){
		  System.out.println("you are weak");
		}else if(bmi>=18.5 && bmi<25){
		    System.out.println("your weight is ideal");
		}else if(bmi >= 25 && bmi<30){
		  System.out.println("you are fat");
		}else{
		  System.out.println("you are obese");
		}

		
		
		
		
		
	}

}
