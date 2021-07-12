package chapter_04.copy;

public class Test_Class01 {

	public static void main(String[] args) {
		
		int score = 81;
		char grade;
		
		if ( score >= 90 ) {
			grade = 'A';
			System.out.println("A학점입니다");
		}
		
		else if ( score >= 80 ) {
			grade = 'B'; 
			System.out.println("B학점입니다.");
		}
		
		else if ( score >= 70 ) {
			grade = 'C';
			System.out.println("C학점입니다.");
		}
		
		else if ( score >= 60 ) {
			grade = 'D';
			System.out.println("D학점입니다.");
		}
		
		else {
			grade = 'F';
			System.out.println("F학점입니다.");
		}
		System.out.println("점수는 " + score + "점이고, " + grade + "학점입니다.");
	}
}
