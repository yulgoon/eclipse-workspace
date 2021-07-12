package chapter_08;

public class Point {

	private int x, y;

	public Point() {
		this.x = this.y = 0;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColourPoint extends Point {
	private String colour;

	public ColourPoint(int x, int y, String colour) {
		super(x, y);
		this.colour = colour;
	}

	public void showColourPoint() {
		System.out.println(colour);
		showPoint();
	}
}
