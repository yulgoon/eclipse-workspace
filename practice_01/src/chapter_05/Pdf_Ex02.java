package chapter_05;

import java.util.Scanner;

public class Pdf_Ex02 {

	int width;
	int height;
	
	public int getArea() {
		return width * height;
	}
	
	public Pdf_Ex02() {}
	
	public static void main(String[] args) {

		Pdf_Ex02 rect = new Pdf_Ex02();
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> ");
		
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		
		System.out.println("사각형의 면적은 "+rect.getArea());
		
		scanner.close();
	}
	
	
	
}


