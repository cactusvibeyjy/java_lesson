package application;

public class 리터럴과NEW {
public static void main(String[] args) {
	//리터럴 방식 vs new키워드
	String new1 = new String("헬로우");
	String new2 = new String("헬로우");
	String literal1 = "헬로우";
	String literal2 = "헬로우";
	String new3 = literal1;
	System.out.println(new1);
	System.out.println(new2);
	System.out.println(new3);
	System.out.println(literal1);
	System.out.println(literal2);
}
}
