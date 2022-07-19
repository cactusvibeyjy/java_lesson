package application;

public class New_null참조변수 {

	public static void main(String[] args) {
		// String응ㄴ 기본 자료형이 아닌 참조 자료형, 
		//참조 변수는 기복적으로 주소값을 갖는다.
		String text = null; //참조변수의 주소값이 없음
		text = "Hello!";
		
		//text = new String("Hello!"); new는 메모리에 문자열 공간을 만듬
		
		System.out.println(text);
		
		String[] texts = null;
		System.out.println(texts);
		texts = new String[3];
		System.out.println(texts);
		System.out.println(texts[0]);//null 이라 default 값이 0
		System.out.println();
		texts[0] = new String("hi!");
		texts[1] = "hello";
		texts[2] = "good bye";
			
		for(String w : texts) {
				System.out.println(w);
			}
				
		
		;
	}

}
