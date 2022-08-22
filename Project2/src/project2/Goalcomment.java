package project2;

import java.util.Scanner;

public class Goalcomment {
	Scanner scanner = new Scanner(System.in);
//	boolean isRunning = true;
//	public void run() {
//		while (isRunning) {
//			add();
//		}
//		scanner.close();
//	}
	public String club;
	public int distance;
	public String comment;
	public Goalcomment() {
		// TODO Auto-generated constructor stub
	}
	public Goalcomment(String club, int distance, String comment) {
		super();
		this.club = club;
		this.distance = distance;
		this.comment = comment;
	}
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
		return "목표 코멘트 [클럽 :" + club + ", 거리 :" + distance + ", 노트 :" + comment + "]";
	}
	
	
	
}
