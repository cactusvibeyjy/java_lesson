package integerVariable;

public class Casting {
	public static void main(String[] args) {
		//형변환
		//자동 형 변환
		byte a = 32;
		//1 바이트로 저장된 값을 2바이트로 변환
		short b = a;
		//2바이트를 4바이트로
		int c = b;
		//4바이트를 8바이트로
		long d = c;
		//int x =d; 더 타입을 그보다 작은 타입에 넣을 수 없다.
		//플로트(4바이트로) 저장된 소수점을 더블 (8바이트)로 변환
		float e = 1.12F; //실수의 기본 타입은 double이기 떄문에 F를 붙임
		double f = e;
		
		//명시적 변환 (원할때)
		long g = 1000000;
		int h = (int) g;
		
		short i = (short) h;
		
		System.out.println(i); //명시적 뱐횐시 큰타입에서 변환시 손실 가능성
		
		
	}
}
