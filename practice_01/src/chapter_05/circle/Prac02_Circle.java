package chapter_05.circle;

public class Prac02_Circle {

	// ����(�Ӽ� ����)
	int radius;		// ���� ������ ����
	String name;	// ���� �̸� ����
	
	// ������(����ΰ� �ƹ��͵� ���� ��� �⺻ ������)
	public Prac02_Circle()	{}	// Prac02_Circle�̶�� class�� �⺻ ������(; class��� ������ �̸��� �޼ҵ�)
								// �⺻ ������; input �Ű����� �� ����� �� �ƹ� �͵� ���� ������, ������ ����
	
	public double getArea() {	// getArea�� ȣ���ϸ� return �κ��� ��ȯ / �ݺ��Ǵ� �޼ҵ�(�Լ�, ���)�� �����صΰ� ȣ���ؼ� ���
		return 3.14 * radius * radius;
	}
	
}
