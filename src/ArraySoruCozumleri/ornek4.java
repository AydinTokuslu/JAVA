package ArraySoruCozumleri;

public class ornek4 {

	public static void main(String[] args) {
		// Write a Java program to calculate the average value of array elements.
		
		int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
		int sum=0;
		for (int i = 0; i < numbers.length; i++) {
			sum+=numbers[i];
		}
		double average=sum/numbers.length;
		
		System.out.println("average value og the array is : "+ average);
		

	}

}
