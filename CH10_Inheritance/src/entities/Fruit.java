package entities;

public class Fruit {
	//protected 자식 클래스에서 사용가능 + 같은 패키지
	protected int id;

	@Override
	public String toString() {
		return "Fruit [id=" + id + "]";
	}
	
}
