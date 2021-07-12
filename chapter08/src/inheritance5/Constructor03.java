package inheritance5;

class A {
	public A() {
		System.out.println("생성자 A");
	}

	public A(int x) {
		System.out.println("매개변수 생성자 A");
	}
	
	public A(int x, int y) {
		System.out.println("매개변수 생성자 2개 A");
	}
}

class B extends A{
	public B() {
		super(1);
		System.out.println("생성자 B");
	}

	public B(int x) {
		super(1,2);	// 기본적으로 상속관계의 기본 생성자 호출하지만 super 예약어 선언으로 input 값을 지정하면 특정 해당 생성자 호출
		System.out.println("매개변수 생성자 B");
	}
}

public class Constructor03 {
	public static void main(String[] args) {
		B b;
		b = new B(5);	// input 값을 갖는 메소드 B를 호출
		
		B c = new B();
	}

}
