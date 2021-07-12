package override3;

public class Cannon extends Weapon {

	@Override
	protected int fire() {
		return 10;	// Weapon 클래스에서 무기는 1명만 살상으로 정의했지만 Cannon은 10명 살상으로 재정의 
	}

}
