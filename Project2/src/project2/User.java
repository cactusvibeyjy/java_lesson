package project2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


//import project.Prompt;
//import project.TeacherLogin;

public class User {
	List<UserLogin> user = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
	public User() {
		user.add(new UserLogin("yjy", "1234", "Yie"));
	}
	
	public void run() {
		int num = 0;
		while((num = menu()) != 0) {
			switch (num) {
			case 1:
				UserLogin();
				break;
			case 2:
				newUser();
				break;
			case 3:
				userList();
			}
		}
	}

	private void newUser() {
		String id =  Prompt.toString("id : ");
		String password =  Prompt.toString("password : ");
		String confirmPassword = Prompt.toString("Password confirm : ");
		String name = Prompt.toString("Name : ");
		
		if(idTest(id)) {
			System.out.println("중복된 ID입니다.");
		} else if(password.equals(confirmPassword)) {
			user.add(new UserLogin(id, password, name));
			System.out.println("회원가입이 완료되었습니다.");
		} else {
			System.out.println("비밀번호를 다시 입력하시오.");
		}
	}
	

	private void UserLogin() {
		while (true) {
			String id = Prompt.toString("id : ");

			String password = Prompt.toString("password : ");

			UserLogin user = Findid(id);
			UserHandler userhandle = new UserHandler();

			if (user == null) {
				System.out.println("입력하신 아이디가 일치하지 않습니다.");
				System.out.println("다시 입력하시오.");
			} else if(user.getPassword().equals(password)) {
				System.out.println("접속하였습니다.");
				userhandle.UserHandlerun();
				break;
			} else {
				System.out.println("입력하신 패스워드가 일치하지 않습니다.");
				System.out.println("다시 입력하시오.");
			}
		}
		
	}
	
	private boolean idTest(String id) {
		boolean check = true;
		UserLogin user = Findid(id);
		if (user == null)
			check = false;
		return check;
	}
	private UserLogin Findid(String id) {
		for(UserLogin userLogin : user) {
			if(userLogin.getId().equals(id)) {
				return userLogin;
			}
		}
		return null;
	}
	public int menu() {
		return Prompt.inputInt("[1]로그인 [2]신규사용자 [3]사용자 목록 [0]종료\n입력 >>");
	}
	
	public void userList() {
			System.out.println("[유저 목록]");

			Iterator<UserLogin> iterator = user.iterator();

			while(iterator.hasNext()) {
				System.out.println(iterator.next() + " ");
			}
		
	}
}
