package 배열과반복문예제;

public class Arrays {

	public static void main(String[] args) {
		int[] users = {581, 512, 527, 495, 141, 236};
		double totalUsers = sum(users);
		System.out.printf("총 사용자: %.0f명\n", totalUsers);
		double dailyUser = average(totalUsers, users.length);
		System.out.printf("하루 평균 사용자: %.2f명", dailyUser);
	}
	public static double sum(int[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	public static double average(double sum, int count) {
		return sum / count;
	}

}
