package chapter03;

public class OperatorEx02 {

	public static void main(String[] args) {
		
		int mathScore = 95;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println("토탈 점수 : " + totalScore);

		int avgScore1 = (mathScore + engScore) / 2;	// int가 아닌 double 선언하여야 소수점 아래 값을 살릴 수 있다.
		System.out.println("잘못된 평균 점수 : " + avgScore1);
		
		double avgScore2 = (mathScore + engScore) / 2.0;	// 이와 같이 double로 선언하여야 소수점 아래 정확한 평균 값이 구해진다.
		System.out.println("정확한 평균 점수 : " + avgScore2);
		
		int mod = mathScore % engScore;	// engScore로 matheScore를 나눈 나머지 값
		String ch1 = "나눈 나머지 : ";
		System.out.println(ch1 + mod);
		
		
	}
	
}

