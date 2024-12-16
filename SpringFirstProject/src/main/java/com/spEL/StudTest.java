package com.spEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class StudTest {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("com/spEL/config.xml");

		Student stud = con.getBean("student", Student.class);

		System.out.println(stud);

		SpelExpressionParser spl = new SpelExpressionParser();
		Expression ex = spl.parseExpression("33*2");

		System.out.println(ex.getValue());

	}

}
