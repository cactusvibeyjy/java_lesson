package ch18.coms.model;

public class Person {
	private String name;
	private String email;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "[이름=" + name + ", 이메일=" + email + "]";
	}

	public boolean validate() {
		if (name.equals("admin")) 
			return true;
		else
			return false;
		
	}
}
