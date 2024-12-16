package com.springlifecycleUsingInitandDestroy;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSamosa {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springlifecycleUsingInitandDestroy/configlifecycle.xml");

		context.registerShutdownHook();

		Samosa samosa = (Samosa) context.getBean("samosa1");

		System.out.println(samosa);

		System.out.println("******************");

		Pepsi pepsi = (Pepsi) context.getBean("pepsi1");
		System.out.println(pepsi);

		System.out.println("******************");

		Sandwich sd = (Sandwich) context.getBean("sandwich1");

		System.out.println(sd);

	}

}
