package chapter04;

public class SwitchEx01 {

	public static void main(String[] args) {
		
		String medal = "4th";
		
		switch (medal) {
		case "Gold":
			System.out.println("금메달");
			break;
			
		case "Silver":
			System.out.println("은메달");
			break;
			
		case "Bronze":
			System.out.println("동메달");
			break;
		
		default:
			System.out.println("메달 없음");
			break;
			
		}

	}
}
