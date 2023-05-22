
public class Ticket implements PriceList{
	private String code;
    private String movieName;
    private String issueDate;
    private String ticketType;
    private double price;
    
	public Ticket(String code, String movieName, String issueDate, String ticketType, double price) {
		this.setCode(code);
		this.setMovieName(movieName);
		this.setIssueDate(issueDate);
		this.setTicketType(ticketType);
		this.setPrice(price);
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getTicketType() {
		return ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public double calculateCost() {
		// TODO Auto-generated method stub
		return 0;
	}
    

}
