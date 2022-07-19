package application;

public class 문자열메소드1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//charAt(인덱스번호): index번호에 해당하는 문자가 리턴(출력)
		String text = "ABCDE";
		System.out.println(text.charAt(0));
		System.out.println(text.charAt(1));
		System.out.println(text.charAt(2));
		System.out.println(text.charAt(3));
		System.out.println(text.charAt(4));
		//System.out.println(text.charAt(5));
		
		//문자열 알파벳순 비교
		String w1 = "abcd";
		String w2 = "abcf";
		//compareTo 는 문자열들을 비교해서 큰 순서 빼기 작은순서를 숫자로 계산하여 리턴
		//단어가 다 다를 경우 맨 앞부분만 비교한 후 리턴 종료
		System.out.println(w1.compareTo(w2));
		
		//contains(문자열) 문자열이 포함하고 있는지 확인
		text = "오늘 점심은 돈까스다";
		System.out.println(text.contains("돈까스"));
		
		
		//concat 함수는 문자열 합치기
		System.out.println(w1.concat(w2));
		
		//StringBuilder를 사용해 합침
		String finalString = new StringBuilder().append(w1).append(w2).toString();
		System.out.println(finalString);
		//String.format("",) : printf("%s", 변수) 대신 문자열을 출력하지 않고 문자열 형식을 만듬
		
		String formatString = String.format("%s %s", w1, w2);
		System.out.println(formatString);
		System.out.printf("%s %s", w1, w2);
		
	}

}
