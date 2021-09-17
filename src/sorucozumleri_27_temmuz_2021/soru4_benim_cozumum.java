package sorucozumleri_27_temmuz_2021;

public class soru4_benim_cozumum {

	public static void main(String[] args) {
		 // bir int Array elemanlarinin işaretini(+-)degistiren bir method yaziniz.
        // input : 1,2,-3,4,-5,-6
        // output :-1,-2,3,-4,5,6
		
		 int[] arr = { 1, 2, -3, 4, -5, -6 };
		 for (int w : arr) {
			w*=-1;
			System.out.print(w+" ,");
		}
		System.out.println("");
		sayininTersiniAl(arr);
		

	}

	private static int[] sayininTersiniAl(int[] arr) {
		for (int w : arr) {
			w*= -1;
			System.out.print("method cozumu "+w+" ,");
		}
		return arr;
		
	}

}
