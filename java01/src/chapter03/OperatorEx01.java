package chapter03;

public class OperatorEx01 {

	public static void main(String[] args) {
		
		int num1 = 10;				// = : 대입연산자(가장 마지막에 연산 됨)
		int num2 = 20;				// num1, num2 : lvalue / 10, 20 : rvalue
		
		System.out.println(+num1);	// +, - 등 : 부호연산자
		System.out.println(-num2);	// 출력은 양수 20에 -를 붙인 것 뿐 변수 값 변화X
		System.out.println(num2);	// 단항 연산자
		
		num2 = -num2;				// 대입연산자로 인해 변수 값이 변함(양수 -> 음수)
		System.out.println(num2);	// 음수인 -20이 출력
		
		int num3 = num1 + num2;		// 이항 연산자, +는 산술연산자
		System.out.println(num3);
				
	}
		
}
