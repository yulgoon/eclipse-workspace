package chapter_04;

public class Prac_p123_Q5 {

	public static void main(String[] args) {
		
		int line=7;		// 전체 라인 수
		int star=1;		// * 출력 변수 -> 초기 출력값
		int space=3;	// 공백 출력 변수 -> 초기 출력값
		
		for (int i=0; i<line; i++) {			// 라인을 처리
			for (int j=0; j<space; j++) {		// *모양 왼쪽의 공백 처리
				System.out.print(' ');
			}
			for (int j=0; j<star; j++) {		// *모양을 처리
				System.out.print('*');				// 위 j와 같은 문자이지만 for문 안에서 선언해서 영향x
			}
			for (int j=0; j<space; j++ ) {		// *모양 오른쪽의 공백처리
				System.out.print(' ');
			}

		if (i<=2) {								// (공백, *) 수의 증감을 처리
			star+=2;
			space-=1;
		}
		else {
			star-=2;
			space+=1;
		}
		System.out.println();
		}
	}
}
