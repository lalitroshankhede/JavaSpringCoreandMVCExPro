package comstandlonecolle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("comstandlonecolle/config.xml");
		 Person per = con.getBean("personData",Person.class);
		System.out.println(per.getFriends());
		System.out.println(per.getFriends().getClass().getName());
		
		System.out.println("=======================================");
		
		
		System.out.println(per.getFees());
		System.out.println(per.getFees().getClass().getName());
	
	
		System.out.println("=======================================");
		
		System.out.println(per.getProperties());
		System.out.println(per.getProperties().getClass().getName());
	
	}
}
