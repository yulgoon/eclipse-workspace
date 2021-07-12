package thisex;

public class BirthDay {
	
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void printThis() {
		System.out.println(this);	// this가 가리키는 객체의 힙메모리 주소
	}
	
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay);	// bDay 객체의 RAM의 힙주소 출력
		bDay.printThis();			// this가 가리키는 객체의 힙메모리 주소
		
		bDay.setMonth(6);
		System.out.println(bDay);
		bDay.printThis();
		
		bDay.setDay(28);
		System.out.println(bDay);
		bDay.printThis();
		
		
	}

}
