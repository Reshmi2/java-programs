package deliverydetails;

public class Delivery {
	private String batsman,bowler,nonStriker;
	private Long over,ball,runs;
	public Delivery() {
		// TODO Auto-generated constructor stub
	}
	public String getBatsman() {
		return batsman;
	}
	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}
	public String getBowler() {
		return bowler;
	}
	public void setBowler(String bowler) {
		this.bowler = bowler;
	}
	public String getNonStriker() {
		return nonStriker;
	}
	public void setNonStriker(String nonStriker) {
		this.nonStriker = nonStriker;
	}
	public Long getOver() {
		return over;
	}
	public void setOver(Long over) {
		this.over = over;
	}
	public Long getBall() {
		return ball;
	}
	public void setBall(Long ball) {
		this.ball = ball;
	}
	public Long getRuns() {
		return runs;
	}
	public void setRuns(Long runs) {
		this.runs = runs;
	}
	public Delivery(String batsman,String bowler,String nonStriker,Long over,Long ball,Long runs)
	{
		super();
		this.batsman=batsman;
		this.bowler=bowler;
		this.nonStriker=nonStriker;
		this.over=over;
		this.ball=ball;
		this.runs=runs;
	}
	

}
