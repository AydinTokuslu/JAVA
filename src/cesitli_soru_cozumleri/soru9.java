package cesitli_soru_cozumleri;

public class soru9 {

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
		
		// tek satirda yapmanin kodu da su sekildedir
        
        String yeniStr = "J" + str.replaceAll("\\d","").replace("@",".").substring(1).toLowerCase();
        
        System.out.println(yeniStr);
		
		
	}

}
