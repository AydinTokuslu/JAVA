package day31_Agustos_03_2021_dersi_VarietyArguments_Varargs_StringBuilder;

public class C02_Varargs02 {

	public static void main(String[] args) {
		// Varargs kullanarak verilen Stringleri birlestiren concat isimli bir method
        // olusturunuz
        concat("m", "e", "r", "v", "e");
    }
    private static void concat(String... string) {
        String s = "";
        for (String w : string) {
            s = s.concat(w);//s+=w;
        }
        System.out.println(s);


	}

}
