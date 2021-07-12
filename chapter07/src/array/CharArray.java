package array;

public class CharArray {

	public static void main(String[] args) {
		
		char[] alphabets = new char [26];
		char ch = 'A';
		
		for(int i=0, j=0; i<alphabets.length; i++, j++, ch++) {	// A~Z 배열 방에 저장
			alphabets[i] = ch;							// ASCII 값으로 각 배열 방에 저장
		}
		
		for(int i=0; i<alphabets.length; i++) {			// 배열 각 방의 내용을 출력
			System.out.println(alphabets[i]+", "+(int)alphabets[i]);
		}
	}
}
