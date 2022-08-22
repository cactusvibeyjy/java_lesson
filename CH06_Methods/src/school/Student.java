package school;

public class Student {
	private String name;
	private int age;
	private boolean isVisible;
	private double temperature;

	public Student(String name, int age, boolean isVisible, double temperature) {
		this.name = name;
		this.age = age;
		this.isVisible = isVisible;
		this.temperature = temperature;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", isVisible=" + isVisible + ", temperature=" + temperature
				+ "]";
	}
	
	
//	public String toString() {
//		// 객체의 정보를 리턴한다
//		return "Student [name=" +name+ ", age=" +age+ ", isVisible=" +isVisible+
//				", temperature="
//				 +temperature+"]";
	

}

