package application;

public class 출력포맷 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printf ("출력서식 (%d, %f, %c, %s)",출력값)
		int age = 25;
		String addr = "부산";
		System.out.printf("내 나이는 %d살 입니다.\n", age);
		System.out.printf("내 나이는 %d살 이고 \n%s에 살고 있습니다.", age, addr);
		
		double pi = 3.141592;
		
		System.out.printf("\n파이의 값은 : %.3f", pi);
	
	}

}
