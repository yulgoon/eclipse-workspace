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

		System.out.println("���� : " + person.age + "��");
		System.out.println("�̸� : " + person.name);
		System.out.println("��ȥ ���� : " + person.marriage);
		System.out.println("�ڳ� �� : " + person.kids + "��");
		
		
	}

}
