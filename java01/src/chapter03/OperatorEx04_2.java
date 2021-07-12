package chapter03;

public class OperatorEx04_2 {

	public static void main(String[] args) {
		
		int gameScore = 150;
		
		int lastScore1 = gameScore++;
		System.out.println(lastScore1);
		System.out.println(gameScore);
		
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);
		System.out.println(gameScore);
		
		
	}
	
	
	
	
}
