package chapter_04;

public class Prac_p123_Q5 {

	public static void main(String[] args) {
		
		int line=7;		// ��ü ���� ��
		int star=1;		// * ��� ���� -> �ʱ� ��°�
		int space=3;	// ���� ��� ���� -> �ʱ� ��°�
		
		for (int i=0; i<line; i++) {			// ������ ó��
			for (int j=0; j<space; j++) {		// *��� ������ ���� ó��
				System.out.print(' ');
			}
			for (int j=0; j<star; j++) {		// *����� ó��
				System.out.print('*');				// �� j�� ���� ���������� for�� �ȿ��� �����ؼ� ����x
			}
			for (int j=0; j<space; j++ ) {		// *��� �������� ����ó��
				System.out.print(' ');
			}

		if (i<=2) {								// (����, *) ���� ������ ó��
			star+=2;
			space-=1;
		}
		else {
			star-=2;
			space+=1;
		}
		System.out.println();
		}
	}
}
