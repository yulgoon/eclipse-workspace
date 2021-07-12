package chapter_05;	// ���� ������(radius)�� ���ϱ�

public class Circle {

	// ����(�Ӽ� ����)
	int radius;		// ���� ������ ����
	String name;	// ���� �̸� ����
	
	// ������(����ΰ� �ƹ��͵� ���� ���±⺻ ������) => �����ڴ� �޼ҵ������� return ���� ���� Ŭ���� �̸��� �ݵ�� �����ؾ� ��
	public Circle()	{}	// Prac02_Circle�̶�� class�� �⺻ ������(; class��� ������ �̸��� �޼ҵ�)
								// �⺻ ������; input �Ű����� �� ����� �� �ƹ� �͵� ���� ������, ������ ����
	
	// �޼ҵ�(��� ����)
	public double getArea() {	// getArea�� ȣ���ϸ� return �κ��� ��ȯ / �ݺ��Ǵ� �޼ҵ�(�Լ�, ���)�� �����صΰ� ȣ���ؼ� ���
		return 3.14 * radius * radius;
	}
	
	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle();	// Circle ��ü�� ����, referance �̸� pizza / ������ ���� �ϰ� �Ҵ�
		pizza.radius = 10;				// ������ �������� 10���� ���� ("referance" + ".")
		pizza.name = "�ڹ� ����";			// ������ �̸��� ����
		double area = pizza.getArea();	// ������ ���� (getArea()�� return�� ȣ���ؼ� area ������ �Ҵ�)
		System.out.println(pizza.name+"�� ������ : "+area+"�Դϴ�.");
		
		Circle doughnut = new Circle();	// Circle ��ü�� ����, referance �̸� doughnut / ������ �ϸ鼭 �Ҵ�
								// �� ���� new ������ ���� "Prac02_Circle()"�� ������
		doughnut.radius = 2;
		doughnut.name = "�ڹ� ����";
		area = doughnut.getArea();
		System.out.println(doughnut.name+"�� ������ : "+area+"�Դϴ�.");
				
		Circle ���ϻ� = new Circle();
		���ϻ�.radius = 3;
		���ϻ�.name = "�ڹ� �Ӳ���";
		area = ���ϻ�.getArea();
		System.out.println(���ϻ�.name+"�� ������ : "+area+"�Դϴ�.");
	}
	
	}

