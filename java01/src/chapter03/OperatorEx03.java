package chapter03;

public class OperatorEx03 {

	public static void main(String[] args) {
		
		int gameScore = 150;			//	ó�� ���� ���� 150
		
		int lastScore1 = ++gameScore;	//	���� ���� 151�� ����(���� ���� ���Ͽ� ���) 
		System.out.println(lastScore1);
		
		int lastScore2 = --gameScore;	//	151���� 150���� ����
		System.out.println(lastScore2);
		// ; ó�� ���� ����
		
		int lastScore3 = gameScore++; 	//	���� �� 150�� ���� ��µ� �� ++(1����) ����
		System.out.println(lastScore3);
		
		int lastScore4 = gameScore--;	//	���� �� 151�� ���� ��µ� �� --(1����) ����
		System.out.println(lastScore4);
		
		int lastScore5 = gameScore++; 	//	�ٽ� ���� �� 150�� ���� ���, 151 ���
		System.out.println(lastScore5);
		// ; ó�� �Ŀ� ����
		
		int lastScore6 = ++gameScore;
		System.out.println(lastScore6);	// ���� �� 151�� 1�� ���ؼ� ���; 152
		
		int lastScore7 = gameScore--;
		System.out.println(lastScore7);	// ���� �� 152�� ���� ����ϰ� 1����
		System.out.println(gameScore);	// ������ ��ϵ� ���� �� ���
		
	}
}

