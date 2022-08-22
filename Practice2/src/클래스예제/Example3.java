package 클래스예제;

public class Example3 {
	public static void main(String[] args) {
		Miner malon = new Miner("말런");
		Miner gloria = new Miner("글로리아");
		
		malon.mine();
		malon.mine();
		malon.mine();
		gloria.mine();
		gloria.mine();
		System.out.println(malon.toString());
		System.out.println(gloria.toString());
	
	}
}
class Miner{
	String name;
	int coins;
	
	public Miner(String name) {
		this.name=name;
		coins =0;
	}

@Override
	public String toString() {
		return "Miner {name=" + name + ", coins=" + coins + "}";
	}

	//	@Override
//	public String toString() {
//		return String.format("Miner{ name: %s, coins: %d}", name, coins);
//
//}
	public void mine () {
		coins += 1;
	}
}
