package abstractex;

public class GoodCal extends Calculator {
	// 추상 클래스를 상속받아서 실행부 입력한 클래스

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] a) { // a : 배열값 저장
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum / a.length;
	}

	public static void main(String[] args) {
		GoodCal c = new GoodCal();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] { 2, 3, 4 })); // sum += a[i] -> (0,1,2) 2+3+4 / 3

	}

}
