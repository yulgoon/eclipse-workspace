package chapter_04.copy;

public class Test_Class05 {

	public static void main(String[] args) {
		
		String medal="Gold";
		int ranking;
		
		if (medal=="Gold"||medal=="G"||medal=="Gol") {
			medal="금메달"; ranking=1;
			}
		
		else if (medal=="Silver"||medal=="S"||medal=="Sil") {
			medal="은메달";
			ranking=2;
			}
		else if (medal=="Bronze"||medal=="B"||medal=="Bro") {
			medal="동메달";
			ranking=3;
			}
		else {medal="메달 없음"; ranking=0;}
		
		System.out.println(medal+"이고, "+ranking+"등입니다.");
	}
}
