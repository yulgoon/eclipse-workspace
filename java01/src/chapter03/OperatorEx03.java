package chapter03;

public class OperatorEx03 {

	public static void main(String[] args) {
		
		int gameScore = 150;			//	처음 변수 값은 150
		
		int lastScore1 = ++gameScore;	//	변수 값이 151로 증가(변수 값이 변하여 등록) 
		System.out.println(lastScore1);
		
		int lastScore2 = --gameScore;	//	151에서 150으로 감소
		System.out.println(lastScore2);
		// ; 처리 전에 적용
		
		int lastScore3 = gameScore++; 	//	변수 값 150이 먼저 출력된 후 ++(1증가) 적용
		System.out.println(lastScore3);
		
		int lastScore4 = gameScore--;	//	변수 값 151이 먼저 출력된 후 --(1감소) 적용
		System.out.println(lastScore4);
		
		int lastScore5 = gameScore++; 	//	다시 변수 값 150이 먼저 출력, 151 등록
		System.out.println(lastScore5);
		// ; 처리 후에 적용
		
		int lastScore6 = ++gameScore;
		System.out.println(lastScore6);	// 변수 값 151에 1을 더해서 출력; 152
		
		int lastScore7 = gameScore--;
		System.out.println(lastScore7);	// 변수 값 152를 먼저 출력하고 1감소
		System.out.println(gameScore);	// 마지막 등록된 변수 값 출력
		
	}
}

