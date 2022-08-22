package 한줄씩읽기;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
	public static void main(String[] args) {
		String fileLocation = "C:\\JAVA\\Workspace\\CH19_Reading_Writing\\test.txt";
		System.out.println(new File(fileLocation).exists());
		System.out.println();
		
		try(BufferedReader reader = new BufferedReader(new FileReader(fileLocation))) {
		
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line); //읽은 파일에서 읽은 한줄을 그대로 출력ㄴ
			}
		} 
		catch (FileNotFoundException e) {
			
			System.out.println("File not found : " + fileLocation);
		}
		catch(IOException e) {
			System.out.println("Not able to read : " + fileLocation);
		} 
		
	}
}
