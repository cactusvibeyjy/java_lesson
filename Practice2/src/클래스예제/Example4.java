package 클래스예제;

public class Example4 {

	public static void main(String[] args) {
		Cube a = new Cube(3);
		Cube b = new Cube(5);

		System.out.printf("정육면체 a의 부피: %d, 겉넓이: %d\n", a.volume(), a.surfaceArea());
		System.out.printf("정육면체 b의 부피: %d, 겉넓이: %d\n", b.volume(), b.surfaceArea());
	}

}

class Cube {
	int length;
	int volume;
	int surfaceArea;

	public Cube (int i) {
		length = i;
	}

	public int volume() {
		volume = length * length * length;
		return volume;

	}

	public int surfaceArea() {
		surfaceArea = 6 * length * length;
		return surfaceArea;

	}
}
