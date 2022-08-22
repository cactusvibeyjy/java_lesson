package 정규표현식;

import java.util.regex.Pattern;

public class RegexPractice {

	public static void main(String[] args) {
		 System.out.println("Cat".matches("[a-dA-D]at"));
		 System.out.println("Cat".matches("[Cc]at"));
		 System.out.println("Cat".toLowerCase().matches("cat"));
		 
		 //[^c] c만 제외하고 매치 확인 (대소문자 구분)
		 System.out.println("Cat".matches("[^c]at"));
		 //\w => 한개의 문자 또는 숫자 => 문자열 "\\w"
		 System.out.println("1232".matches("\\w\\w\\w"));
		//횟수 n개 {n}, 한개이상 +
		 System.out.println("1232".matches("\\w{3}"));
		 System.out.println("1232".matches("\\w+"));
		 
		 
		 //전화번호 매치
		 System.out.println("010-1234-5678".matches(
				 ("(02|010|051)-\\d{3,4}-\\d{4}")));
		 String regex = "(02|010|051)-\\d{3,4}-\\d{4}"; //정규표현식
		 String phoneNumber = "010-1234-5678";
		 boolean result = Pattern.matches(regex, phoneNumber);
		 
		 if (result) {
			 System.out.println("올바른 전화번호 형식");
		 }
		 else {
			 System.out.println("올바르지 않은 전화번호 형식");
		 }
		 
		 regex = "\\w+@\\w.\\w+(\\.\\w+)?";
		 String email = "angel@naver.com";
		 result = Pattern.matches(regex,  email);
		 if(result) {
			 System.out.println("정규식과 일치. 올바른 이메일 형식.");
		 }
		 else {
			 
			 System.out.println("정규식과 일치하지 않음. 올바른 이메일 형식이 아님.");
		 }
			 
			 
	}
	
	

}
