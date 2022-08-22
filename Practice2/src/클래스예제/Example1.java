package 클래스예제;

public class Example1 {

	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		
		c.radius = 4;
		c.height = 5;
		System.out.printf("원기둥의 부피: %.2f\n", c.getVolume());
		System.out.printf("원기둥의 겉넓이: %.2f\n", c.getArea());
		
	}

}
class Cylinder {
	int radius;
	int height;
		
		
		public double getVolume() {
			return radius*radius*Math.PI*height;
		}
		public double getArea() {
			double ca = Math.PI*radius*radius;
			double ra = height * 2 * Math.PI * radius;
			return 2 *ca+ra;
		}
}


