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
		System.out.println(this);	// this�� ����Ű�� ��ü�� ���޸� �ּ�
	}
	
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay);	// bDay ��ü�� RAM�� ���ּ� ���
		bDay.printThis();			// this�� ����Ű�� ��ü�� ���޸� �ּ�
		
		bDay.setMonth(6);
		System.out.println(bDay);
		bDay.printThis();
		
		bDay.setDay(28);
		System.out.println(bDay);
		bDay.printThis();
		
		
	}

}
