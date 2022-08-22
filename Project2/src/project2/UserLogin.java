package project2;


public class UserLogin {
	private String id;
	private String password;
	private String name;
	public UserLogin(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "UserLogin [id=" + id + ", password=" + password + ", name=" + name + "]";
	}
	
	public void add() {
		UserLogin newUser = new UserLogin(id, password, name);
		newUser.id = Prompt.toString("id : ");
		newUser.password = Prompt.toString("password : ");
		newUser.name = Prompt.toString("Name : "); 
	}
	
	
}
