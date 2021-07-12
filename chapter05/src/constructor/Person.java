package constructor;

public class Person {

	String name;
	float height;
	float weight;
	
	public Person() {}	// 기본생성자, 생략 가능(시스템상 자동 생성)
						// 클래스 내에 다른 생성자가 있을 때 오류가 나기 때문에 이 때에는 자동 생성되지 않는다.
	
	public Person(String pname) {
		name = pname;
	}
	
	public Person(String pname, float pheight, float pweight) {
		name=pname;
		height=pheight;
		weight=pweight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
}
