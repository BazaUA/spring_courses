package bazalytskyi.homework4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bazalytskyi.homework4.AOP.Worker;
import bazalytskyi.homework4.Aspect.Kidnapper;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
		Performer performer = (Performer) context.getBean("duke");
		performer.perform();

		System.out.println("----------------");
		Worker poeticDuke = (Worker) context.getBean("poeticDuke");
		poeticDuke.takeMoney();

		System.out.println("----------------");
		Singer singingDuke = (Singer) context.getBean("singer");

		Kidnapper kidnapper = (Kidnapper) context.getBean("kidnapper");
		singingDuke.sing("Boom boom boom...");
		System.out.println(kidnapper.getSong());

	}

}
