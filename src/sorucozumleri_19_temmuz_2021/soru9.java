package sorucozumleri_19_temmuz_2021;

public class soru9 {

	public static void main(String[] args) {
		/*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şeklini yazdırınız.  65=A'nın ascıı değeri
        */
		
		int harf = 65;
        for (int satir = 0; satir < 6; satir++) {// satır kontrolu
            for (int sutun = 0; sutun <= satir; sutun++) {// sutun kontrolu
                System.out.print((char)(sutun+harf)+" ");
            }
            System.out.println();
        }
        
		

	}

}
