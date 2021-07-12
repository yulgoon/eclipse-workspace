package chapter03;

public class OperatorEx05 {

	public static void main(String[] args) {
		
		
		int myAge = 27;
		
		boolean value1 = myAge > 26;	// rval보다 크면 true
		System.out.println(value1);
		
		boolean value2 = myAge <= 27;	// rval보다 작거나 같으면 true
		System.out.println(value2);

		boolean value3 = myAge >= 28;	// rval보다 크거나 같으면 true
		System.out.println(value3);
	
		boolean value4 = myAge == 27;	// rval와 같으면 true
		System.out.println(value4);
		
		boolean value5 = myAge != 27;	// rval와 다르면(같지 않으면) true
		System.out.println(value5);
		
		boolean value6 = myAge != 29;
		System.out.println(value6);
		
	}
	
	
}
