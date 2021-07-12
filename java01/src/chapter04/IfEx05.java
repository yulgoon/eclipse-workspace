package chapter04;

public class IfEx05 {

	public static void main(String[] args) {
		
		int score = 70;
		char grade;
		
		if (score>90) {grade='A';}

		else {grade='B';}
		
		System.out.println("당신의 점수는 "+score+"이고, "+"학점은 "+grade+"입니다.");
		
	}
}
		// 조건의 결과가 True or False인 경우는 if조건문보다는 조건연산자 A?B:C가 간략하고 편함
		// grade=(score >= 90)?'A':'B'; ->(IfEx06 참고)

