package project2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class UserHandler {
	Scanner scanner = new Scanner(System.in);
	Goalcomment gcomment;
	List<Goalcomment> commentList = new ArrayList<Goalcomment>();
	public List<Goalcomment> searchComment;
//	List<UserData> dataList = new ArrayList<UserData>();
//	private List<UserData> searchlog;
//	private List<UserData> mylog;
	
	
	public void UserHandlerun() {
		int num = 0;
		
		while((num = userMenu()) !=0) {
			switch(num) {
			case 1: goal();
					break;
			case 2: goalComment();
					break;
			case 3: searchGoal();
					break;
			
		
			case 0:
				System.out.println("프로그램 종료");
				break;
			default : 
				System.out.println("잘못된 입력입니다.");
			}
			System.out.println();
		}
	}
	
	public int userMenu() {
		System.out.println("****0을 입력하면 메인으로 이동****");
		return Prompt.inputInt("[1] 나의 목표 " 
							  +"[2] 목표 입력 "
							  +"[3] 목표 조회\n"
						
							  +"입력 >>");			
		}
	
//		Scanner scanner = new Scanner(System.in);
//		UserData club = new UserData();
//		System.out.println("[클럷별 목표 입력]");
//		
//		System.out.println("클럽 입력 >>");
//		String clubs = scanner.nextLine();
//		int distance = scanner.nextInt();
//		System.out.println("목표 거리 입력 >>");
//			
//		
//		while(true) {
//			int number = Prompt.inputInt("0 : 설정 취소");
//			if(number==0) {
//			System.out.println(" 목표설정을 취소합니다.");
//				return;
//		return toString();
			//} 
	public void goalComment() {
		System.out.println("목표를 입력하세요.");
		System.out.print("클럽 : ");
		String club = scanner.nextLine();
		System.out.print("거리 : ");
		int distance = scanner.nextInt();
		scanner.nextLine();		
		System.out.print("코멘트를 입력 >>");
		String comment = scanner.nextLine();
		gcomment = new Goalcomment(club, distance, comment);
		
	}
	private void goal() {
		System.out.println("드라이버: 200~210m");
		System.out.println("우 드: 140~160m");
		System.out.println("아이언은 그대로만 치자!");
		System.out.println("어프로치 정확도 올리기");
		System.out.println(gcomment);
	}
		
	
		
		
		
//	public void mylog() {
//		System.out.println("연습로그");
//		
//		System.out.println();
//		Iterator<UserData> iterator = mylog.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next() + " ");
//		}
//	}
	public void searchGoal() {
		System.out.println("[목표를 조회합니다.]");
		System.out.println(gcomment);
		//String club = Prompt.toString("클럽 입력 >>");

//		Iterator<Goalcomment> iterator = goalComment.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next() + " ");
//		
//	}
	}

}
