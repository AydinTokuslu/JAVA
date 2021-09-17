package cesitli_soru_cozumleri_benim_tekrar;

public class cumle_duzeltme {

	public static void main(String[] args) {
		// String methodlarini kullanarak " Java ogrenmek123 Cok guzel@ " String’ini
        
        // "Java ogrenmek cok guzel." sekline getirin.
		
		String str=" Java ogrenmek123 Cok guzel@ ";
		str=str.replaceAll("\\d", "");
		System.out.println(str);
		
		str=str.replace("@", ".");
		System.out.println(str);
		
		str=str.replace("C", "c");
		System.out.println(str);
		
		

	}

}
