package 한줄씩쓰기;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
	public static void main(String[] args) {
		
	String fileLocation = "C:\\JAVA\\Workspace\\CH19_Reading_Writing\\test.txt";
	try {
		BufferedWriter br = new BufferedWriter(new FileWriter(fileLocation));
		br.write("Orange");
		br.newLine();
		br.write("Apple");
		br.newLine();
		br.write("Banana");
		br.newLine();
		br.close();//쓸때는 파일을 닫아야 함.
	} catch (IOException e) {
		//파일을 쓸때 파일이 없으면 새로 만듬
		System.out.println("File cannot be used : " +fileLocation);
	}
	
	System.out.println("파일 쓰기 완료 : " + fileLocation);
	}
}
