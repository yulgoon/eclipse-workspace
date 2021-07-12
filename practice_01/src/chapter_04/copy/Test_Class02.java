package chapter_04.copy;

public class Test_Class02 {

	public static void main(String[] args) {
		
		int score = 81;
		char grade;
		
		if ( score >= 90 ) { grade = 'A'; }
		
		else if ( score >= 80 ) { grade = 'B'; }
		
		else if ( score >= 70 ) { grade = 'C'; }
		
		else if ( score >= 60 ) { grade = 'D'; }
		
		else { grade = 'F'; }

		System.out.println( grade + "학점입니다." );
		System.out.println( "점수는 " + score + "점입니다." );

	}
}
