package chapter04;

public class SwitchEx01 {

	public static void main(String[] args) {
		
		String medal = "4th";
		
		switch (medal) {
		case "Gold":
			System.out.println("�ݸ޴�");
			break;
			
		case "Silver":
			System.out.println("���޴�");
			break;
			
		case "Bronze":
			System.out.println("���޴�");
			break;
		
		default:
			System.out.println("�޴� ����");
			break;
			
		}

	}
}
