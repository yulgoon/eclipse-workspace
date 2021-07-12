package constructor;

//import constructor.Person;	// import (package).(class);

public class PersonTest {
	
	public static void main(String[] args) {
	
		Person personLee = new Person();
		personLee.name = "이영수";
		personLee.height = 181.2F;
		personLee.weight = 72.3F;
		System.out.println(personLee.name+"님의 신장은 "+personLee.height+"cm이고, 체중은 "+personLee.weight+"kg입니다.");
	
		Person personKim = new Person("김준형");
		personKim.height = 179.8F;
		personKim.weight = 73.9F;
		System.out.println(personKim.name+"님의 신장은 "+personKim.height+"cm이고, 체중은 "+personKim.weight+"kg입니다.");
	
		Person personPark = new Person("박정길", 180.1F, 68.8F);
		System.out.println(personPark.name+"님의 신장은 "+personPark.height+"cm이고, 체중은 "+personPark.weight+"kg입니다.");
		
		Person personCho = new Person();
		personCho.setName("조덕용");
		personCho.setHeight(183.2F);
		personCho.setWeight(74.1F);
		System.out.println(personCho.getName()+"님의 신장은 "+personCho.getHeight()+"cm이고, 체중은 "+personCho.getWeight()+"kg입니다.");
	}
}
