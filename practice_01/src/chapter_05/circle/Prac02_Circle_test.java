package chapter_05.circle;

import chapter_05.circle.Prac02_Circle;

public class Prac02_Circle_test {

	public static void main(String[] args) {
		
		Prac02_Circle pizza;
		pizza = new Prac02_Circle();	// Circle ��ü�� ����, referance �̸� pizza / ������ ���� �ϰ� �Ҵ�
		pizza.radius = 10;				// ������ �������� 10���� ���� ("referance" + ".")
		pizza.name = "�ڹ� ����";			// ������ �̸��� ����
		double area = pizza.getArea();	// ������ ���� (getArea()�� return�� ȣ���ؼ� area ������ �Ҵ�)
		System.out.println(pizza.name+"�� ������ : "+area+"�Դϴ�.");
		
		Prac02_Circle doughnut = new Prac02_Circle();	// Circle ��ü�� ����, referance �̸� doughnut / ������ �ϸ鼭 �Ҵ�
								// �� ���� new ������ ���� "Prac02_Circle()"�� ������
		doughnut.radius = 2;
		doughnut.name = "�ڹ� ����";
		area = doughnut.getArea();
		System.out.println(doughnut.name+"�� ������ : "+area+"�Դϴ�.");
				
		Prac02_Circle ���ϻ� = new Prac02_Circle();
		���ϻ�.radius = 3;
		���ϻ�.name = "�ڹ� �Ӳ���";
		area = ���ϻ�.getArea();
		System.out.println(���ϻ�.name+"�� ������ : "+area+"�Դϴ�.");
		
		
		
	}
}
