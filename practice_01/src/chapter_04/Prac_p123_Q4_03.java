package chapter_04;

public class Prac_p123_Q4_03 {

	public static void main(String[] args) {
		
		int lineCount=4;	// 전체 라인 수
		int starCount=1;	// 한줄에 가장 작게 찍힌 *의 수 : 첫째줄에 1개
		int spaceCount=3;	// 가장 넓은 한 공백 범위 : 첫째줄에 3칸
		
		for (int i=0; i<lineCount; i++) {			// 라인을 처리
			for (int j=0; j<spaceCount; j++) {		// *모양 왼쪽의 공백 처리
				System.out.print(' ');
			}
			for (int j=0; j<starCount; j++) {		// *모양을 처리
				System.out.print('*');				// 위 j와 같은 문자이지만 for문 안에서 선언해서 영향x
			}
			for (int j=0; j<spaceCount; j++ ) {		// *모양 오른쪽의 공백처리
				System.out.print(' ');
			}
		System.out.println();
		spaceCount -=1;
		starCount +=2;

		}
	}
}
