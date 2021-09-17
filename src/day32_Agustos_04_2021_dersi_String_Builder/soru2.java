package day32_Agustos_04_2021_dersi_String_Builder;

public class soru2 {

	public static void main(String[] args) {
		//sonuc?
		
		StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb);

	}

}
