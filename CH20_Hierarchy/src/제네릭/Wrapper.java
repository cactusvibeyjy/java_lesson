package 제네릭;

public class Wrapper <E> {
	private E object;
	public void set(E object) {
		this.object = object;
	}
	public E get() {
		return object;
	}
	public static void main(String[] args) {
		Wrapper<Cat> wrapper = new Wrapper<>();
		Cat cat = new Cat("마틸다");
		wrapper.set(cat);
		Cat retrieved = wrapper.get();
		System.out.println(retrieved);
	}

}
