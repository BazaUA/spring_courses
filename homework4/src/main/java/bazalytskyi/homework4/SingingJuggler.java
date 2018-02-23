package bazalytskyi.homework4;





public class SingingJuggler implements Singer {
	private String song;
	
	
	public void sing(String song) {
		this.song=song;
	}
	
	public String getSong() {
		return song;
	}
}
