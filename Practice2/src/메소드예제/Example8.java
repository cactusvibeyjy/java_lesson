package 메소드예제;

public class Example8 {

	public static void main(String[] args) {
		int a= 13;
		int b= 7;
		int c= 10;
		
		System.out.printf("%d층 -> %s 엘리베이터\n", a, guide(a));
		System.out.printf("%d층 -> %s 엘리베이터\n", b, guide(b));
		System.out.printf("%d층 -> %s 엘리베이터\n", c, guide(c));
	}
	
	public static String guide(int floor) {
		String guide = null;
		if (floor >= 11) {
			guide = "고층";
		}
		else {
			guide = "저층";
		}
		return guide;
	}

}
