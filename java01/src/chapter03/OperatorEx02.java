package chapter03;

public class OperatorEx02 {

	public static void main(String[] args) {
		
		int mathScore = 95;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println("��Ż ���� : " + totalScore);

		int avgScore1 = (mathScore + engScore) / 2;	// int�� �ƴ� double �����Ͽ��� �Ҽ��� �Ʒ� ���� �츱 �� �ִ�.
		System.out.println("�߸��� ��� ���� : " + avgScore1);
		
		double avgScore2 = (mathScore + engScore) / 2.0;	// �̿� ���� double�� �����Ͽ��� �Ҽ��� �Ʒ� ��Ȯ�� ��� ���� ��������.
		System.out.println("��Ȯ�� ��� ���� : " + avgScore2);
		
		int mod = mathScore % engScore;	// engScore�� matheScore�� ���� ������ ��
		String ch1 = "���� ������ : ";
		System.out.println(ch1 + mod);
		
		
	}
	
}

