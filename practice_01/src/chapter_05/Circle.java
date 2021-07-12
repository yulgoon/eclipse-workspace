package chapter_05;	// 원의 반지름(radius)을 구하기

public class Circle {

	// 변수(속성 정의)
	int radius;		// 원의 반지름 지정
	String name;	// 원의 이름 지정
	
	// 생성자(실행부가 아무것도 없는 경우는기본 생성자) => 생성자는 메소드이지만 return 값이 없고 클래스 이름과 반드시 동일해야 함
	public Circle()	{}	// Prac02_Circle이라는 class의 기본 생성자(; class명과 동일한 이름의 메소드)
								// 기본 생성자; input 매개변수 및 실행부 등 아무 것도 없는 생성자, 생략이 가능
	
	// 메소드(기능 정의)
	public double getArea() {	// getArea를 호출하면 return 부분을 반환 / 반복되는 메소드(함수, 계산)를 지정해두고 호출해서 사용
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle();	// Circle 객체를 생성, referance 이름 pizza / 선언을 먼저 하고 할당
		pizza.radius = 10;				// 피자의 반지름을 10으로 설정 ("referance" + ".")
		pizza.name = "자바 피자";			// 피자의 이름을 설정
		double area = pizza.getArea();	// 피자의 면적 (getArea()의 return부 호출해서 area 변수에 할당)
		System.out.println(pizza.name+"의 면적은 : "+area+"입니다.");
		
		Circle doughnut = new Circle();	// Circle 객체를 생성, referance 이름 doughnut / 선언을 하면서 할당
								// 이 때에 new 다음에 오는 "Prac02_Circle()"는 생성자
		doughnut.radius = 2;
		doughnut.name = "자바 도넛";
		area = doughnut.getArea();
		System.out.println(doughnut.name+"의 면적은 : "+area+"입니다.");
				
		Circle 단팥빵 = new Circle();
		단팥빵.radius = 3;
		단팥빵.name = "자바 앙꼬빵";
		area = 단팥빵.getArea();
		System.out.println(단팥빵.name+"의 면적은 : "+area+"입니다.");
	}
	
	}

