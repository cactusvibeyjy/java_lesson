package application;


public class Cat {
	//스테틱 상수는 final 앞에 static 붙음. 객체 생성없이 사용
	//상수는 값을 바꿀 없는 수
	private String name;
	private int id;
 static final String FOOD = "cat's food";
	 //스테틱 변수는 공유해서 값을 사용 가능하다. 초기값 0
	private static int count = 0; //스테틱 변수 초기값 0
	
	public Cat(String name) {
		
		this.name = name;
		count++;
		id = count;
	}
	//스테틱 메소드는 인스턴스 변수를 사용 할 수 없다.
	//스테틱 변수는 사용 가능.
	public static int getCount() {
		//name ="이름";
		return count;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	


	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Cat [고양이 아이디: " +id+ " 이름: " + name + "]";
	}
	

	
	

}
