package application;

public class 연산자위치 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//증감연사자의 위치에 따라 먼저 증감하고 할당 (=), 할당 (=)하고 증감
		int cats =5;
		System.out.println(cats++); //할당 먼저 ->증강
		System.out.println(cats); //증강되어서 6
		
		int dogs = 3;
		System.out.println(++dogs);
		
		int chickens = 10;
		int animals = cats + chickens++;//치킨 10 할당 후 증강하여 11
		System.out.println(animals);
		
		
		int apples = 5;
		int bananas = 4;
		int fruits = ++apples + bananas++;//사과 6 바나나 4 할당 후 5
		System.out.println(fruits);
			
	}

}
