package abstractex;

public abstract class Computer { // class�� abstract ���� -> �߻� �޼ҵ带 �����ϴ� template
	/*
	 * �߻� �޼ҵ� : ����(����)��({})�� ���� ����θ� ������ method -> ���� �صΰ� ������ ����� ���� ���� Ŭ�������� ��
	 * public void display(); public void typing();
	 * public int add(int a, int b); public int add(int a, int b) {} {} �κ�(�����)��
	 * return �κ��� ������� �ʾƼ� error
	 * 
	 * class�� method ��� �ݵ�� abstract ���ǰ� �Ǿ�� ��
	 */

	public abstract void display(); // �߻� �޼ҵ�

	abstract public void typing(); // �߻� �޼ҵ�

	public void add(int a, int b) {
	} // �Ϲ� �޼ҵ�

	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
