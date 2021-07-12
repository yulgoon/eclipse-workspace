package chapter03;

public class OperatorEx08 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		boolean flag;				//!(부정) 연산자 : 연산 값 결과의 반대를 출력
		
		flag = !(num1 > 0);			// T이므로 F 출력
		System.out.println(flag);
		
		flag = !(num2 < 0);			// F이므로 T 출력
		System.out.println(flag);
		
		flag = !(num1 > num2);		// F이므로 T 출력
		System.out.println(flag);
		
		flag = !(num1 < num2);		// T이므로 F 출력
		System.out.println(flag);
	}
}
