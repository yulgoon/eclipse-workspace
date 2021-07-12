package chapter02;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		double dNum1 = 1.2;	// double : 8bytes
		float fNum2 = 0.9F;	// float : 4bytes
		
		int iNum3 = (int)dNum1 + (int)fNum2;
			// ������ int ������ ��ȯ�Ͽ� ���� -> dNum1=1, dNum2=0�� �Ǹ� �����Ͽ� 1�� ��
		int iNum4 = (int)(dNum1 + fNum2);
			// ������ ���� �����ϰ� �� ��ȯ -> 1.2+0.9=2.1 -> int �� ��ȯ�ϸ� 2�� ��
		
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		// ���� ���� �� �Ҵ� ���� ���꿡�� ����� �� ��ȯ �� �ڷᰡ �սǵ� �� ����
		
		
	//cf -> ��ȯ���� �ʰ� �״�� �����ϸ� �ڷ��� �ս��� ���ְų� ���̰� ��
		double dNum5 = 1.2;
		double dNum6 = 0.9;
		
		double dNum7 = dNum5 + dNum6;
		
		System.out.println(dNum7);
		
	}
	
	
}

