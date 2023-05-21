
public class Movie {
  private int code;
  private char title;
  private int year;
  private String actor;
  private int duration;
  
public Movie(int code, char title, int year, String actor,int duration) {
	super();
	this.setCode(code);
	this.setTitle(title);
	this.setYear(year);
	this.setActor(actor);
	this.setDuration(duration);
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public char getTitle() {
	return title;
}
public void setTitle(char title) {
	this.title = title;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getActor() {
	return actor;
}
public void setActor(String actor) {
	this.actor = actor;
}
public void setDuration(int duration) {
	this.duration=duration;
}
public String getDuration() {
	return duration;
}
}
