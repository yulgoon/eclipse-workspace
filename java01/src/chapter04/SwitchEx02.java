package chapter04;

public class SwitchEx02 {

	public static void main(String[] args) {
		
		String medal = "1";
		
		switch (medal) {
		case "Gold": case "G": case "g": case "��": case "�ݸ޴�": case "1":
			System.out.println("�ݸ޴�");
			break;
			
		case "Silver": case "S": case "s": case "��": case "���޴�": case "2":
			System.out.println("���޴�");
			break;
			
		case "Bronze": case "B": case "b": case "��": case "���޴�": case "3":
			System.out.println("���޴�");
			break;
		
		default:
			System.out.println("�޴� ����");
			break;
			
		}
	}
}
