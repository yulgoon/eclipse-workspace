package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		double [] data = new double[5];	// �迭�� ���� 5�� ����, �迭�� ����
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
		
		System.out.println();
		
		int[] data2 = {1,2,3,4,5};		// �迭 ����� ���ÿ� �� �Ҵ�
		
		 for(int i=0; i<data.length; i++) {
			System.out.println(data2[i]);
		 }
	}
}