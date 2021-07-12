package p;

public class A {

	int def;			// 다른 패키지에서 접근 차단
	private int pri;	// 다른 클래스에서 접근 차단
	protected int pro;	// 상속받지 않은 다른 패키지에서 접근 차단
	public int pub;

}
