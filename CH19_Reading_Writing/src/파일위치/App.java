package 파일위치;

import java.io.File;

public class App {
	public static void main(String[] args) {
		String fileLocation = "C:\\JAVA\\Workspace\\CH19_Reading_Writing\\test.txt";
		System.out.println(new File(fileLocation).exists());
		
		
	}

}
