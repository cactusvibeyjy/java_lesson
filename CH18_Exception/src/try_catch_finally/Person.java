package try_catch_finally;

public class Person {
	void setName(String name) throws Exception {
		if (name == null) {
			throw new Exception("null cannot be entered");
		}
		System.out.println("Name is "+ name);
	}

}
