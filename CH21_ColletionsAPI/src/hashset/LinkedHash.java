package hashset;

import java.util.LinkedHashSet;

public class LinkedHash {

	public static void main(String[] args) {
		//순서대로 출력됨 , 중복안됨
		LinkedHashSet<String> fruits = new LinkedHashSet<String>();
		
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("오렌지");
		fruits.add("오렌지");
		fruits.add("배");
		fruits.add("사과");
		fruits.add("사과");

		for(String f: fruits) {
			System.out.println(f);
		}

	}
}