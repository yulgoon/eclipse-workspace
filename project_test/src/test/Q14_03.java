package test;

public class Q14_03 {

	public static void main(String[] args) {

		int[] intArray = new int[10];
		int total = 0;
		double avg;

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) (Math.random() * 10 + 1);
		}
		System.out.println("������ ������ : ");

		for (int i = 0; i < 10; i++) {
			System.out.print(intArray[i] + " ");
			total += intArray[i];
		}
		System.out.println();

		avg = (double) total / intArray.length;
		System.out.println("����� : " + avg);
	}

}
