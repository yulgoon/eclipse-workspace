package chapter_05;
	// class �ۿ� �Է��� �� �ִ� �� : package, import

public class Student_Test {	// Ŭ���� ���� �Ӽ���(����), �޼ҵ�, ������ �ۼ�

	// ���� �κ� : ���� ������ �޼ҵ� ���������� ���� ���� / �Ӽ��� ����
	int studentID;
	String studentName;
	int grade;
	String address;
	
	// �޼ҵ� �κ� / main method �ܺ� : ����� / ��� ����
	public void showStudentInfo()	{	// "void" : ȣ�Ⱚ�� ���� "()" / return�� ���� �޼ҵ�; void ����
		System.out.println( studentName +", "+ address );
	}	// ���� �޼ҵ忡 �Ű������� �־ ���� 
		
	public static int add(int n1, int n2)	{	// add �Լ��� 2���� input ��(ȣ�Ⱚ; n1, n2)�� ���� / n1, n2 -> num1, num2 �Է��ص� �� (k1, k2 ��)
					// method �ۼ� : "�޼ҵ��" + "('���ڰ� ������ �Է�')" / cf) showStudentInfo()�� ��� �ۼ��� ���ڰ� ��� "()"
		int result = n1 + n2;	// ������ int result
		return result;			// result ���� ȣ��
	}
	
	public static void main(String[] args) {	// "void" : ȣ�Ⱚ�� ���� "()" / main method ���� : �����

		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);	// add �Լ� ȣ���ؼ� ���� num1, num2 ���� ���� / num1, num2�� ���� n1, n2���� ����(�ڷ���(int; ������)�� �°Ը� �� �����ϸ� ��)
		
		System.out.println(num1+"+"+num2+"="+sum+"�Դϴ�." );
		
	}
		// publick static�� public static void �޼ҵ�� ������ �޸𸮸� ���
}
