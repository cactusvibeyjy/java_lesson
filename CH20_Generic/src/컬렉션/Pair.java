package 컬렉션;

public class Pair<T, S> {
	private T value1;
	private S value2;
	
	public Pair(T value1, S value2) {
		this.value1 = value1;
		this.value2 = value2;
	}
	public T getOne() {
		return value1;
	}
	
	public S getTwo() {
		return value2;
	}
	@Override
	public String toString() {
		return "Pair [value1=" + value1 + ", value2=" + value2 + "]";
	}
	
	
}
