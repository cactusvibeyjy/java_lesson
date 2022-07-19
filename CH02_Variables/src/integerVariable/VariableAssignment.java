package integerVariable;

public class VariableAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dogs =8;
		int cats =3;
		System.out.println("1.Dogs: " + dogs);
		System.out.println("1.Cats: " + cats);
		
		dogs = cats;
		cats = 10;
		
		System.out.println("2.Dogs:" + dogs);
		System.out.println("2.Cats:" + cats);
	}

}
