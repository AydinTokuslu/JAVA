package day43_Agustos_17_2021_dersi_Exceptions;

public class Exceptions15 {

	public static void main(String[] args) {
		
		String s="";
        try {
            s+="t";
        }catch (Exception e) {
            s+="c";
        }   finally {
            s+="f";
        }
        s+="a";
        System.out.println(s); //tfa

	}

}
