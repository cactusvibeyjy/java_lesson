package 배열과반복문예제;

public class Example7 {

	public static void main(String[] args) {
		int[] bacterialCountLogs = new int [10];
		
		writeLog(bacterialCountLogs);
		printLog(bacterialCountLogs);
		//int result = (int)Math.pow(2, 3);
	}
	public static void writeLog(int[] logs) {
		for(int i =0; i <logs.length; i++) {
			logs[i] = (int)Math.pow(2, i);
		}
		
	}
	public static void printLog(int[] arr) {
		System.out.printf("[");
		for (int i =0; i < arr.length; i++) {
			System.out.printf("%d", arr[i]);
			if (i !=arr.length - 1) {
				System.out.printf(", ");
			}
		}
		System.out.printf("]");
	}
}
