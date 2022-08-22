package project2;

public class App {
	public static void main(String[] args) {
		User user = new User();
		while (true) {
			System.out.println("=====================");
			System.out.println("========골프로그========");
			System.out.println("=====================");
			System.out.println("[1] 사용자 로그인  [0]종료");
			int command = Prompt.inputInt("입력 >>");
			
			switch(command) {
				case 1: user.run();
				break;
				
				case 0: 
					System.out.println("프로그램을 종료합니다.");
					break;
					default: System.out.println("잘못된 입력입니다.");
				}
			System.out.println();
		}
	}

}
