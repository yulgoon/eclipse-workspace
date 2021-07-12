package inheritance4;

class A {

	public A() {
		System.out.println("생성자 A");
	}
}

class B extends A {

	public B() {
		super();
		/*
		 *  super : 수퍼클래스(부모클래스)의 생성자 호출, 반드시 생성자 메소드의 첫번째 라인에 오며,
		 *  		선언하지 않아도 생략되어 상위 클래스에 대해 자동 선언 됨.
		 */
		System.out.println("생성자 B");
	}

}

class C extends B {

	public C() {
		super();
		System.out.println("생성자 C");
	}
}

public class ConstructorEx02 {

	public static void main(String[] args) {
		C c;
		c = new C();
	}
}
