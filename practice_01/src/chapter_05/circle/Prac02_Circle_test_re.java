package chapter_05.circle;

import chapter_05.circle.Prac02_Circle_re;

public class Prac02_Circle_test_re {

	public static void main(String[] args) {

		Prac02_Circle_re pizza = new Prac02_Circle_re ();
		pizza.radius = 10;
		pizza.name = "�ڹ�����";
		double area = pizza.getArea();
		System.out.println(pizza.name+"�� ������ "+area+"cm^2�Դϴ�.");
		
		Prac02_Circle_re doughnut = new Prac02_Circle_re();
		doughnut.radius = 2;
		doughnut.name = "�ڹٵ���";
		area = doughnut.getArea();
		System.out.println(doughnut.name+"�� ������ "+area+"cm^2�Դϴ�.");

	}

}