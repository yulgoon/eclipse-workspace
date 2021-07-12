package constructor;

//import constructor.Person;	// import (package).(class);

public class PersonTest {
	
	public static void main(String[] args) {
	
		Person personLee = new Person();
		personLee.name = "�̿���";
		personLee.height = 181.2F;
		personLee.weight = 72.3F;
		System.out.println(personLee.name+"���� ������ "+personLee.height+"cm�̰�, ü���� "+personLee.weight+"kg�Դϴ�.");
	
		Person personKim = new Person("������");
		personKim.height = 179.8F;
		personKim.weight = 73.9F;
		System.out.println(personKim.name+"���� ������ "+personKim.height+"cm�̰�, ü���� "+personKim.weight+"kg�Դϴ�.");
	
		Person personPark = new Person("������", 180.1F, 68.8F);
		System.out.println(personPark.name+"���� ������ "+personPark.height+"cm�̰�, ü���� "+personPark.weight+"kg�Դϴ�.");
		
		Person personCho = new Person();
		personCho.setName("������");
		personCho.setHeight(183.2F);
		personCho.setWeight(74.1F);
		System.out.println(personCho.getName()+"���� ������ "+personCho.getHeight()+"cm�̰�, ü���� "+personCho.getWeight()+"kg�Դϴ�.");
	}
}
