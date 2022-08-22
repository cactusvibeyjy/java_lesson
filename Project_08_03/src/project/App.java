package project;



public class App {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		 
		      while(true) {
		        System.out.println("[출결 관리 메인]");
		        System.out.printf("[1] 교수 로그인    [0] 종료\n");
		        int command = Prompt.inputInt("입력 >> ");

		        switch(command) {
		          case 1: teacher.System(); break;

		          case 0 : 
		            System.out.println("프로그램 종료");
		            break;
		          default : System.out.println("잘못된 명령입니다."); 
		        }
		        System.out.println();
		      }
		  }
		
		
}
