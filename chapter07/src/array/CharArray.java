package array;

public class CharArray {

	public static void main(String[] args) {
		
		char[] alphabets = new char [26];
		char ch = 'A';
		
		for(int i=0, j=0; i<alphabets.length; i++, j++, ch++) {	// A~Z �迭 �濡 ����
			alphabets[i] = ch;							// ASCII ������ �� �迭 �濡 ����
		}
		
		for(int i=0; i<alphabets.length; i++) {			// �迭 �� ���� ������ ���
			System.out.println(alphabets[i]+", "+(int)alphabets[i]);
		}
	}
}
