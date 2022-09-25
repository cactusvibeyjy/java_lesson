package com.spring.ex01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
	   public static void main(String[] args){
	      ApplicationContext context=new ClassPathXmlApplicationContext("AOPTest.xml");
	      Person person=(Person)context.getBean("proxyCal");

	      person.show("yjy", "Chinese");
	      System.out.println();
			
	   }
	}

