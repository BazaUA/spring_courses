package bazalytskyi.hom2work2;

public class Juggler implements Performer {
	private int beanBags = 3;

	public Juggler() {
	}

	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}

	public void perform() {
		System.out.println("JUGGLING " + beanBags + " BEANBAGS");
	}
}
