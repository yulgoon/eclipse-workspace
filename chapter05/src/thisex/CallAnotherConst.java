package thisex;

class Person {
	String name;
	int age;
	
	Person(){						// input 값이 없는 Person method에서 this로 (객체)자기 자신의 레퍼런스를 아래 Person method의 인풋 값 매개 변수 할당
		this("이름없음",1);			// this를 이용해 Person(String, int) 호출 -> 생성자에서 다른 생성자를 호출하는 this
	}
	Person(String name, int age) {	// 위 Person 메소드에 대해 실제 작동하는 method
		this.name = name;			// 객체의 멤버 변수와 메소드 변수의 이름이 같을 때 특정하기 위한 this
		this.age = age;
	}
	Person returnItSelf() {
		return this;				// 자기 자신(this)을 반환 -> 출력하면 힙주소 출력
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf();
		System.out.println(p);		// (p)와 (noName) 출력 결과 같음 (패키지명).(클래스명)@(heap address)
		System.out.println(noName);
	}
}
