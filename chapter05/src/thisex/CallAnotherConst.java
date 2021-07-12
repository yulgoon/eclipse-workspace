package thisex;

class Person {
	String name;
	int age;
	
	Person(){						// input ���� ���� Person method���� this�� (��ü)�ڱ� �ڽ��� ���۷����� �Ʒ� Person method�� ��ǲ �� �Ű� ���� �Ҵ�
		this("�̸�����",1);			// this�� �̿��� Person(String, int) ȣ�� -> �����ڿ��� �ٸ� �����ڸ� ȣ���ϴ� this
	}
	Person(String name, int age) {	// �� Person �޼ҵ忡 ���� ���� �۵��ϴ� method
		this.name = name;			// ��ü�� ��� ������ �޼ҵ� ������ �̸��� ���� �� Ư���ϱ� ���� this
		this.age = age;
	}
	Person returnItSelf() {
		return this;				// �ڱ� �ڽ�(this)�� ��ȯ -> ����ϸ� ���ּ� ���
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf();
		System.out.println(p);		// (p)�� (noName) ��� ��� ���� (��Ű����).(Ŭ������)@(heap address)
		System.out.println(noName);
	}
}
