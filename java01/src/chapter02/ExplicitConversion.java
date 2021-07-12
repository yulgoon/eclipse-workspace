package chapter02;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		double dNum1 = 1.2;	// double : 8bytes
		float fNum2 = 0.9F;	// float : 4bytes
		
		int iNum3 = (int)dNum1 + (int)fNum2;
			// 각각을 int 형으로 변환하여 연산 -> dNum1=1, dNum2=0이 되며 연산하여 1이 됨
		int iNum4 = (int)(dNum1 + fNum2);
			// 각각을 먼저 연산하고 형 변환 -> 1.2+0.9=2.1 -> int 형 변환하면 2가 됨
		
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		// 위와 같이 각 할당 값의 연산에서 명시적 형 변환 시 자료가 손실될 수 있음
		
		
	//cf -> 변환하지 않고 그대로 연산하면 자료의 손실을 없애거나 줄이게 됨
		double dNum5 = 1.2;
		double dNum6 = 0.9;
		
		double dNum7 = dNum5 + dNum6;
		
		System.out.println(dNum7);
		
	}
	
	
}

