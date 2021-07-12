package thisex_t;	// 하나의 페이지에 여러개의 class 만들 수 있지만 public class는 반드시 하나만 와야 함
					// 저장은 public class의 이름으로 해야 함
class BirthDay {
	
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
		}
	public void printThis() {
		System.out.println(this);	// this가 가리키는 객체의 힙메모리 주소
		}
	}
	
public class ThisExample {
	
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay);	// bDay 객체의 RAM의 힙주소 출력
		bDay.printThis();			// bDay가 가리키는 객체의 힙 주소

		System.out.println(bDay.year);
			
		}
	}