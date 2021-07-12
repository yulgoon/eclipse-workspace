package abstractex;

public class Notebook extends Computer {

	@Override
	public void display() {
		System.out.println("Notebook Display()");
	}

	@Override
	public void typing() {

	} // 수퍼클래스가 추상클래스면 서브클래스도 추상클래스로! or 수퍼클래스의 추상메소드를 서브클래스에서 재정의(Override)!

}
