package chapter_04;

public class Prac_p123_Q4_03 {

	public static void main(String[] args) {
		
		int lineCount=4;	// ��ü ���� ��
		int starCount=1;	// ���ٿ� ���� �۰� ���� *�� �� : ù°�ٿ� 1��
		int spaceCount=3;	// ���� ���� �� ���� ���� : ù°�ٿ� 3ĭ
		
		for (int i=0; i<lineCount; i++) {			// ������ ó��
			for (int j=0; j<spaceCount; j++) {		// *��� ������ ���� ó��
				System.out.print(' ');
			}
			for (int j=0; j<starCount; j++) {		// *����� ó��
				System.out.print('*');				// �� j�� ���� ���������� for�� �ȿ��� �����ؼ� ����x
			}
			for (int j=0; j<spaceCount; j++ ) {		// *��� �������� ����ó��
				System.out.print(' ');
			}
		System.out.println();
		spaceCount -=1;
		starCount +=2;

		}
	}
}
