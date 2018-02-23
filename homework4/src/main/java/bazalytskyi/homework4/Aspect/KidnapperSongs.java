package bazalytskyi.homework4.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect 
public class KidnapperSongs implements Kidnapper {
	private String stolenSong; 

	@Pointcut("execution(* bazalytskyi.homework4.Singer.sing(String)) && args(song)")
	public void sing(String song) {}
	
	@Before("sing(song)")
	public void interceptSong(String song) {
		System.out.println("Stoling song...");
		this.stolenSong=song;
	}

	public String getSong() {
		return this.stolenSong;
	}

}
