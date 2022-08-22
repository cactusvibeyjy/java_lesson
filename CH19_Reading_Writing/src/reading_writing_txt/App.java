package reading_writing_txt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
	public static void main(String[] args) throws IOException {
		String text = "Hello!\n How are you?";//파일에 쓰기
		
		Path path = Paths.get("text.txt"); //상대경로
		
		//Files.write(파일경로, 내용) : 파일에쓰기
		Files.write(path, text.getBytes());
		
		//파일을 읽기
		String receivedText = Files.readString(path);
		System.out.println(receivedText);
	}

}
