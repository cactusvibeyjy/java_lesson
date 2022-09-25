package com.spring.ex02;

public class PersonServiceImpl implements PersonService {
	private String name;
	private String local;
	private int age;
	
	public PersonServiceImpl(String name) {
		this.name = name;
	}


	public PersonServiceImpl(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public PersonServiceImpl(String name, int age, String local) {
		super();
		this.name = name;
		this.age = age;
		this.local = local;
	}
	@Override
	public void sayHello() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "살");
		System.out.println("지역: " + local );
	}
}
