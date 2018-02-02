package bazalytskyi.hom2work2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
		Performer performer = (Performer) context.getBean("duke");
		performer.perform();
		System.out.println("----------------");
		Performer poeticDuke= (Performer) context.getBean("poeticDuke");
		poeticDuke.perform();
		System.out.println("----------------");
		Performer kenny = (Performer) context.getBean("kenny");
		kenny.perform();
		System.out.println("----------------");
		Performer hank = (Performer) context.getBean("hank");
		hank.perform();
	}

}
