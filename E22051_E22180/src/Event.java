
public class Event {
private char moviePlaying;
private String date;
private String time;
private int room;
public Event(char moviePlaying, String date, String time, int room) {
	super();
	this.setMoviePlaying(moviePlaying);
	this.setDate(date);
	this.setTime(time);
	this.setRoom(room);
}
public char getMoviePlaying() {
	return moviePlaying;
}
public void setMoviePlaying(char moviePlaying) {
	this.moviePlaying = moviePlaying;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public int getRoom() {
	return room;
}
public void setRoom(int room) {
	this.room = room;
}

}
