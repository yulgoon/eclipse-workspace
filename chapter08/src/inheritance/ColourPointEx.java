package inheritance;

public class ColourPointEx {

	public static void main(String[] args) {

		Point p = new Point(); // Point Ŭ������ ��ü ����

		p.set(1, 2);
		p.showPoint();

		ColourPoint cp = new ColourPoint(); // ColourPoint ��ü
		cp.set(3, 4);
		cp.setColour("red");
		cp.showColourPoint();

		ColourPoint gr = new ColourPoint();
		gr.set(5, 6);
		gr.setColour("green");
		gr.showColourPoint();
	}
}
