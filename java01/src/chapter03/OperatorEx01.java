package chapter03;

public class OperatorEx01 {

	public static void main(String[] args) {
		
		int num1 = 10;				// = : ���Կ�����(���� �������� ���� ��)
		int num2 = 20;				// num1, num2 : lvalue / 10, 20 : rvalue
		
		System.out.println(+num1);	// +, - �� : ��ȣ������
		System.out.println(-num2);	// ����� ��� 20�� -�� ���� �� �� ���� �� ��ȭX
		System.out.println(num2);	// ���� ������
		
		num2 = -num2;				// ���Կ����ڷ� ���� ���� ���� ����(��� -> ����)
		System.out.println(num2);	// ������ -20�� ���
		
		int num3 = num1 + num2;		// ���� ������, +�� ���������
		System.out.println(num3);
				
	}
		
}
