package chapter_05;

import chapter_05.Order;

public class Order_test {
	
	public static void main(String[] args) {
		
		Order order = new Order();
		order.number = 201803120001L;
		order.ID = "abc123";
		order.date = "2018�� 3�� 12��";
		order.name = "ȫ���";
		order.product = "PD0345-12";	// product = �ֹ� ��ǰ ��ȣ
		order.address = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : "+order.number);
		System.out.println("�ֹ��� ���̵� : "+order.ID);
		System.out.println("�ֹ� ��¥ : "+order.date);
		System.out.println("�ֹ��� �̸� : "+order.name);
		System.out.println("�ֹ� ��ǰ ��ȣ : "+order.product);
		System.out.println("��� �ּ� : "+order.address);
		
	}
}
