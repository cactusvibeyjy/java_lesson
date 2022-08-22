package 상속예제;

public class CarTest {

	public static void main(String[] args) {
		Car c = new Car("Sonata");
		Car t = new Suv("Sorento", 1.5);
		
		System.out.println(c.toString());
		System.out.println(t.toString());
	}

}
class Car{
	protected String name;
	public Car(String name) {
		this.name = name;
		}

	@Override
	public String toString() {
		return String.format("[자동차] { name: %s }", name);
	}
}
class Suv extends Car {
	protected double ton;
	public Suv(String name, double ton) {
		super(name);
		this.ton = ton;
		}
	public String toString() {
		return String.format("[SUV] { name: %s, ton: %.1f }", name, ton);
	}


	}	
	

