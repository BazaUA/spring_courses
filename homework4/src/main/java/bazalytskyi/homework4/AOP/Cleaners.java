package bazalytskyi.homework4.AOP;

public class Cleaners {
	public void cleanBeforePerfomance() { // Перед виступом
		System.out.println("The cleaners is cleaning BEFORE the perfomance.");
	}

	public void goingOut() { // Перед виступом
		System.out.println("The cleaners is going out from the hall");
	}

	public void cleanAfterPerfomance() { // Після виступу
		System.out.println("The cleaners is cleaning AFTER the perfomance.");
	}

	public void giveMoney() { // Після робочого дня
		System.out.println("Boo! Give our money!!!");
	}
}
