package 클래스예제;

public class Example2 {
	public static void main(String[] args) {
		Food chicken = new Food("chicken", 18000);
		Food pizza = new Food("pizza", 28000);
		Food sushi = new Food("sushi combo", 22000);
		Food[] foods = {chicken, pizza, sushi};
		for(int i=0; i < foods.length; i++) {
			System.out.println(foods[i].toString());
		}
	}
}
class Food{
	String name;
	int price;
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
		}
	@Override
	public String toString() {
		return "Food {name: " + name + ", price: " + price + "원}";
	}	
}


