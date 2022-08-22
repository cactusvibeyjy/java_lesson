package project2;

//import java.sql.Date;

public class UserData {
	String comment;
	String club;
	int distance;
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "UserData [club=" + club + ", distance=" + distance + "]";
	}
	
	
	
}
