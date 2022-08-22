package 클래스예제;

public class Example6 {

	public static void main(String[] args) {
		Menu jj = new Menu("짜장", 4900);
		Menu jb = new Menu("짬뽕", 5900);
		Menu ts = new Menu("탕수육", 13900);

		Menu[] menuArr = { jj, jb, ts };
		Order order = new Order(123, menuArr);

		System.out.printf("주문 합계: %d원\n", order.totalPrice());
	}

}

class Order {
	int orderNum;
	Menu[] menus;

	public Order(int i, Menu[] menuArr) {
		orderNum = i;
		menus = menuArr;
		// TODO Auto-generated constructor stub
	}
	// public Order(int i, Menu[] arr) {
	// orderNum =i;
	// menus = arr;

	public int totalPrice() {
		int sum = 0;
		for (int i = 0; i < menus.length; i++) {
			sum += menus[i].price;
		}
		return sum;

	}

}

class Menu {
	String name;
	int price;

	public Menu(String str, int i) {
		str = name;
		price = i;
	}
}
