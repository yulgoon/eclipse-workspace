package chapter02;

public class Q4 {

	public static void main(String[] args) {
		
		//(p.69) Q4. 변수 두개를 선언해서 10과 2.0을 대입하고 두 변수의 사칙 연산 결과를 정수로 출력해 보세요.
		
		int i = 10;
		double j = 2.0;
		
		System.out.println((int)i+(int)j);
		System.out.println((int)i-(int)j);
		System.out.println((int)i*(int)j);
		System.out.println((int)i/(int)j);
		
		//or
		
		System.out.println((int)(i+j));
		System.out.println((int)(i-j));
		System.out.println((int)(i*j));
		System.out.println((int)(i/j));
		
		//cf
		System.out.println(i+j);
		// 실수형 : 10이라는 int 데이터가 10.0이라는 double 데이터로 형 변환되어 결과값은 10.0+2.0으로 12.0이 됨
		
	}
	
	
	
}
