package chapter02;

public class CharacterEx02 {

	
	public static void main(String[] args) {
		
		char ch1 = '��';
		char ch2 = '\uD55C';	// '��'�� Unicode ��
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		
		char ch3 = '\uC774';
		System.out.println(ch3);
		char ch4 = '\uC131';
		System.out.println(ch4);
		char ch5 = '\uC5F4';
		System.out.println(ch5);

		char ch6 = '\uAC38';
		System.out.println(ch6);
		
		// char ch7 = -65;	char�� ���� �Է� �� ����

		char ch8 = 65;
		System.out.println(ch8);
		
		
	}
}
