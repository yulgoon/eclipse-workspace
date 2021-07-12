package chapter_05;

import chapter_05.Person;

public class Person_test {

	public static void main(String[] args) {
		Person person;
		person = new Person();
		person.age = 40;
		person.name = "James";
		person.marriage = true;
		person.kids = 3;

		System.out.println("나이 : " + person.age + "세");
		System.out.println("이름 : " + person.name);
		System.out.println("결혼 여부 : " + person.marriage);
		System.out.println("자녀 수 : " + person.kids + "명");
		
		
	}

}
