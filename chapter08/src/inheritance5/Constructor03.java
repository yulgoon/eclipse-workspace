package inheritance5;

class A {
	public A() {
		System.out.println("������ A");
	}

	public A(int x) {
		System.out.println("�Ű����� ������ A");
	}
	
	public A(int x, int y) {
		System.out.println("�Ű����� ������ 2�� A");
	}
}

class B extends A{
	public B() {
		super(1);
		System.out.println("������ B");
	}

	public B(int x) {
		super(1,2);	// �⺻������ ��Ӱ����� �⺻ ������ ȣ�������� super ����� �������� input ���� �����ϸ� Ư�� �ش� ������ ȣ��
		System.out.println("�Ű����� ������ B");
	}
}

public class Constructor03 {
	public static void main(String[] args) {
		B b;
		b = new B(5);	// input ���� ���� �޼ҵ� B�� ȣ��
		
		B c = new B();
	}

}
