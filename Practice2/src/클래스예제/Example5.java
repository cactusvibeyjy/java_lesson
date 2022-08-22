package 클래스예제;

public class Example5 {

	public static void main(String[] args) {
	
	Item sb = new Item("스톰 브레이커", 600);
	Item g = new Item("인피티니 건틀렛", 999);
	Item b= new Item("호크아이의 활", 50);
	Item s = new Item("캡틴아메리카의 방패", 50);
	
	Item[] items = {sb, g, b, s};
	for (int i =0; i < items.length; i++) {
		System.out.println(items[i].toString());
	}
	
			
			
	}
	
	
}

class Item{
	String name;
	int power;
	
	public Item(String str, int i) {
		name = str;
		power = i;
	}

	@Override
	public String toString() {
		return String.format("Item {name:%s, power: %d }", name, power);
	
	}
}
	
