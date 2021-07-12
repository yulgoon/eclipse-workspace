package array;

import java.util.ArrayList;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<Book>();	// ArrayList ����, <> Generic �ڷ���
		
		library.add(new Book("�¹���", "������"));			// 0, add �޼ҵ带 ���ؼ� �߰�
		library.add(new Book("���̾�", "�츣���켼"));		// 1
		library.add(new Book("��� �� ���ΰ�", "���ù�"));	// 2
		library.add(new Book("����", "�ڰ渮"));			// 3
		library.add(new Book("�����", "�����㺣��"));		// 4
		
		for(int i=0; i<library.size(); i++) {	// �� 0������ �� �������� �ݸ�
			Book book = library.get(i);	// i�� �� ���� ����, ù��°���� 0��° ���� �ҷ���
			book.showBookInfo();
		}
		System.out.println();
		
		System.out.println("=== ���� for�� ��� ===");
		for(Book book : library) {	// ���� for������ ó�� ����� �� ����� ������ �ҷ���
			book.showBookInfo();
		}
		System.out.println("=== library.size() : "+library.size()+" ===");	// ���� ����, library ��ü(ArrayList) �迭�� ���� 
		System.out.println("���� �Ʒ� for���� ���(���)�� �����ϴ�.");
	}

}
