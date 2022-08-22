package 클래스예제;

public class Example8 {

	public static void main(String[] args) {
		Hero a = new Hero("아서스");
		Hero b = new Hero("레오나");

		Hero.battle(a, b);
	}

}

class Hero {
	String name;
	int hp;

	public Hero(String name) {
		this.name = name;
		hp = 30;
	}

	public void punch(Hero enemy) {
		int damage = (int) (Math.random() * 10) + 1;// 1~10사이 랜덤

		enemy.hp -= damage;

	}

	public static void battle(Hero a, Hero b) {
		boolean firstAttack = true;
		while (a.hp > 0 && b.hp > 0) {
			if (firstAttack) {
				a.punch(b);
				System.out.printf("[%s]의 펀치\n", a.name);
				System.out.printf("%s: %d/30\n", b.name, b.hp);
			} else {
				b.punch(a);
				System.out.printf("[%s]의 펀치\n", b.name);
				System.out.printf("%s: %d/30\n", a.name, a.hp);
			}
			firstAttack = !firstAttack;

		}

	}
}
