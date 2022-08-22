package hashset;
import java.util.HashSet;
public class App {
	public static void main(String[] args) {
		//set은 순서가 없고 중복되지 않음
		
		HashSet<String> fruits = new HashSet<String>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("orange");
		fruits.add("pair");
		fruits.add("apple");
		fruits.add("apple");
		
		//리스트에 오렌지가 있나?
		System.out.println(fruits.contains("orange"));
		
		for(String f: fruits) {
			System.out.println(f);
		}
	}

}
