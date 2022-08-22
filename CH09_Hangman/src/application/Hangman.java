package application;

import java.util.Scanner;

/*
 * 전체 행맨 게임을 실행하는 클래스
 */

public class Hangman {
	private boolean running = true;
	RandomWord word = new RandomWord();
	Scanner scanner = new Scanner(System.in);
	int remainTries = 7;
	private char lastGuess;
	
	
	public void run() {
		do {
			displayWord();
			getUserInput();
			checkUserInput();
			//remainTries();
			//맞는지 체크 => 맞을시 running = false	
		} while (running);  //running이 false가 되면 반복종료

	}


	public void displayWord() {
		//단어표시
		
		System.out.println(word.toString());//랜덤으로 선택된 단어 출력		
	}

	public void getUserInput() {
		//단어 맞추기
		//유조에게 한 문자 입력 요구
		//입력 받은 문자열에서 한 문자를 뽑아서
		//RandomWord 클래스에 전달 (addGuess(문자) 메소드를 만들자)
		System.out.print("알파벳 입력 : ");	
		System.out.printf("%d번의 기회가 남았음"+remainTries);
		String guess = scanner.nextLine(); //유저가 입력한 문자열 받음
		//문자열에서 빼낸 한 문자를 랜덤워드 메서드 addGuess에 입력
		word.addGuess(guess.charAt(0));
		//lastGuess = guess.charAt(0);
		
	}

	public void checkUserInput() {
		//단어 체크
		if(word.isCompleted()) {
			System.out.println("COREECT!");
			System.out.println("The answer is : " +word);	
			running = false;
		}
//		addGuess = word.addGuess();
//		if(addGuess) {
//			if(word.isCompleted()) {
//				System.out.println("CORRECT!!");
//				System.out.println("The answer is : " +word);
//				running = false;
//			}
		//}
		else {
			remainTries--;
			if (remainTries == 0) {
				System.out.println("Game is over!");
				running = false;
			}
			if (remainTries <7) {
				System.out.printf("%d번의 기회가 남았습니다.\n", remainTries);
			}
		}
		
	}
	public void close() {
		scanner.close();
	}
	
	}

