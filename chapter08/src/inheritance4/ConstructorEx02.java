package inheritance4;

class A {

	public A() {
		System.out.println("������ A");
	}
}

class B extends A {

	public B() {
		super();
		/*
		 *  super : ����Ŭ����(�θ�Ŭ����)�� ������ ȣ��, �ݵ�� ������ �޼ҵ��� ù��° ���ο� ����,
		 *  		�������� �ʾƵ� �����Ǿ� ���� Ŭ������ ���� �ڵ� ���� ��.
		 */
		System.out.println("������ B");
	}

}

class C extends B {

	public C() {
		super();
		System.out.println("������ C");
	}
}

public class ConstructorEx02 {

	public static void main(String[] args) {
		C c;
		c = new C();
	}
}
