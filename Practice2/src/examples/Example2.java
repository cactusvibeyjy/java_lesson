package examples;

public class Example2 {

	public static void main(String[] args) {
		String [] cities = {"Seoul", "Busan", "Incheon", 
				"Daegeon","Daegu"
		};
	
		int[] visitors = {599, 51,46,43,27};
		for (int i =0; i < cities.length; i++) {
			System.out.printf("%s:%d명 \n", cities[i], visitors[i]);
		}

}
}