package 상속예제;

public class WizardTest {
	public static void main(String[] args) {
		GreatWizard gandalf = new GreatWizard("간달프", 100, 100, 100);
	    
	    System.out.println(gandalf.toString());
	    
	    gandalf.energyVolt();
	  }
}
class Novice {
	protected String name;
	protected int hp;
	
	public Novice(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	public String toString() {
		return String.format("[Novice] %s(HP: %d)", name, hp);
	}
}

class Wizard extends Novice{
	protected int mp;

	public Wizard(String name, int hp, int mp) {
		super(name, hp);
		this.mp = mp;
	}



public void energyVolt() {
	System.out.printf("%s의 에너지볼트!\n", name);
	}
}
	
class GreatWizard extends Wizard {
	protected int shield;
	public GreatWizard(String name, int hp, int mp, int shield) {
		super(name, hp, mp);
		this.shield = shield;
	}
	public String toString() {
		return String.format("[대마법사] 간달프(HP: %d, MP: %d, SHIELD: %d)", hp, mp, shield);
	}
	public void energyVolt() {
		System.out.printf("%s의 에너지 볼트! (대마법사 버프로 데미지 +30 추가)", name);
		
	}
}
	

	

	


