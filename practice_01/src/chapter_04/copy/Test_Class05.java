package chapter_04.copy;

public class Test_Class05 {

	public static void main(String[] args) {
		
		String medal="Gold";
		int ranking;
		
		if (medal=="Gold"||medal=="G"||medal=="Gol") {
			medal="�ݸ޴�"; ranking=1;
			}
		
		else if (medal=="Silver"||medal=="S"||medal=="Sil") {
			medal="���޴�";
			ranking=2;
			}
		else if (medal=="Bronze"||medal=="B"||medal=="Bro") {
			medal="���޴�";
			ranking=3;
			}
		else {medal="�޴� ����"; ranking=0;}
		
		System.out.println(medal+"�̰�, "+ranking+"���Դϴ�.");
	}
}
