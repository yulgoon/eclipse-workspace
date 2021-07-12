package constructor;

public class Person {

	String name;
	float height;
	float weight;
	
	public Person() {}	// �⺻������, ���� ����(�ý��ۻ� �ڵ� ����)
						// Ŭ���� ���� �ٸ� �����ڰ� ���� �� ������ ���� ������ �� ������ �ڵ� �������� �ʴ´�.
	
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
