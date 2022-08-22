package 다형성;

public class Housecat extends Cat{
	@Override
	public void vocal() {
		System.out.println("meow~!!");
	}
@Override
	public String toString() {
	// TODO Auto-generated method stub
	return "집고양이";
}
	public void callMaster() {
		System.out.println("집사");
		}
}
