package chapter02;

public class ImplicitConversion {

	public static void main(String[] args) {
		
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);	// byte : 1byte
		System.out.println(iNum);	// int : 4bytes
		
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum2);	// int
		System.out.println(fNum);	// float
		  
		
		  double dNum;
		  	dNum = fNum + iNum;		// double : float + int ~ ���������� double �������� ��ȯ
		  	
		 System.out.println(dNum);
		  
		
		
	}
}
