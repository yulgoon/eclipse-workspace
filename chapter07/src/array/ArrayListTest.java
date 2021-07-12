package array;

import java.util.ArrayList;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<Book>();	// ArrayList 선언, <> Generic 자료형
		
		library.add(new Book("태백산맥", "조정래"));			// 0, add 메소드를 통해서 추가
		library.add(new Book("데미안", "헤르만헤세"));		// 1
		library.add(new Book("어떻게 살 것인가", "유시민"));	// 2
		library.add(new Book("토지", "박경리"));			// 3
		library.add(new Book("어린왕자", "생텍쥐베리"));		// 4
		
		for(int i=0; i<library.size(); i++) {	// 방 0번부터 방 끝번까지 반목복
			Book book = library.get(i);	// i는 각 방의 정보, 첫번째에는 0번째 방을 불러옴
			book.showBookInfo();
		}
		System.out.println();
		
		System.out.println("=== 향상된 for문 사용 ===");
		for(Book book : library) {	// 향상된 for문으로 처음 방부터 끝 방까지 정보를 불러옴
			book.showBookInfo();
		}
		System.out.println("=== library.size() : "+library.size()+" ===");	// 방의 개수, library 객체(ArrayList) 배열의 개수 
		System.out.println("위와 아래 for문의 결과(출력)는 같습니다.");
	}

}
