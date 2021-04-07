package dynamic_beat_14;

public class Beat {
	
	private int time; 	//timing
	private String noteName; 	//each note name
	// [get, set] method is using for The get set method uses the get set method to use variables that are private in other classes.
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	//constructor
	public String getNoteName() { 	
		return noteName;
	}
	public void setNoteName(String noteName) {
		this.noteName = noteName;
	}
	public Beat(int time, String noteName) {
		super();
		this.time = time;
		this.noteName = noteName;
	}
	
	
	
}
