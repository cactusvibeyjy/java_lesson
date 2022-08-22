package try_catch_finally;

public class App {
	public static void main(String[] args)  {
		Person p1 = new Person();
		try {
			p1.setName(null);
			System.out.println("No return");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally{
			//예외가 발생하더라도 무조건 실행됨
		
		System.out.println("파이널리 무조건 실행됨");
		}
		
		System.out.println("End of program");
		
	}

}
