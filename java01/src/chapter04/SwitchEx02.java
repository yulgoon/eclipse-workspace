package chapter04;

public class SwitchEx02 {

	public static void main(String[] args) {
		
		String medal = "1";
		
		switch (medal) {
		case "Gold": case "G": case "g": case "금": case "금메달": case "1":
			System.out.println("금메달");
			break;
			
		case "Silver": case "S": case "s": case "은": case "은메달": case "2":
			System.out.println("은메달");
			break;
			
		case "Bronze": case "B": case "b": case "동": case "동메달": case "3":
			System.out.println("동메달");
			break;
		
		default:
			System.out.println("메달 없음");
			break;
			
		}
	}
}
