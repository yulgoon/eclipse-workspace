package chapter02;

public class Q4 {

	public static void main(String[] args) {
		
		//(p.69) Q4. ���� �ΰ��� �����ؼ� 10�� 2.0�� �����ϰ� �� ������ ��Ģ ���� ����� ������ ����� ������.
		
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
		// �Ǽ��� : 10�̶�� int �����Ͱ� 10.0�̶�� double �����ͷ� �� ��ȯ�Ǿ� ������� 10.0+2.0���� 12.0�� ��
		
	}
	
	
	
}
