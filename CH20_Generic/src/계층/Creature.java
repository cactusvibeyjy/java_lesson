package 계층;

public class Creature {
	private String name;

	public Creature(String name) {
		super();
		this.name = name;
	}
	
	public void feed() {
		System.out.println("생물입니다.");
	}

	@Override
	public String toString() {
		return name;
	}
	
	
}
