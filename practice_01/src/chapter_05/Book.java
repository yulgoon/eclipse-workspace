package chapter_05;

public class Book {
	String title;
	String authour;
	
	public Book(String t) {				// 생성자
		title = t; authour = "작자미상";
	}
	
	public Book(String t, String a) {	// 생성자
		title = t; authour = a;
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐베리");
		Book loveStory = new Book("춘향전");
		
		System.out.println(littlePrince.title + " " + littlePrince.authour);
		System.out.println(loveStory.title + " " + loveStory.authour);
		
		
	}
}
