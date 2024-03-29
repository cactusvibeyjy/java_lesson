package com.spring.ex02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class PersonTest2 {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("person.xml"));//고정 설정
		PersonService person1 = (PersonService) factory.getBean("personService1");
		person1.sayHello();
		System.out.println();

		PersonService person2 = (PersonService) factory.getBean("personService2");
		person2.sayHello();
		
		System.out.println();
		PersonService person3 = (PersonService) factory.getBean("personService3");
		person3.sayHello();
	}
}
