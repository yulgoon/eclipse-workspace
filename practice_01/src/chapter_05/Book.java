package chapter_05;

public class Book {
	String title;
	String authour;
	
	public Book(String t) {				// ������
		title = t; authour = "���ڹ̻�";
	}
	
	public Book(String t, String a) {	// ������
		title = t; authour = a;
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("�����", "�����㺣��");
		Book loveStory = new Book("������");
		
		System.out.println(littlePrince.title + " " + littlePrince.authour);
		System.out.println(loveStory.title + " " + loveStory.authour);
		
		
	}
}
