package 메소드오버로딩;

public class Person {
	public void greet() {
		System.out.println("Hello!");
	}
	public void greet(String name) {
		System.out.println("Hello! " + name);
	}
	public void greet(int height) {
		if(height > 185) {
			System.out.println("You are tall!");
			
		}
		System.out.println("Hello~");
	}
	public void greet(String name, int height) {
		if (height >185) {
			System.out.println("you are tall");
			
		}
		System.out.println("hello" +name);
	}
}
