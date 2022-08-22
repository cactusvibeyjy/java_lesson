package 배열과반복문예제;

public class Example4 {

	public static void main(String[] args) {
		String s = "Programming is fun! right?";
		int[] result= count(s);
		
		System.out.printf("%s\n => 자음 %d개, 모음 %d개", s, result[0], result[1]);
	}
	public static int[] count(String str) {
		int conso = 0;
		int vowel = 0;
		
		char[] characters = str.toUpperCase().toCharArray();
		
		for(int i =0; i < characters.length; i++) {
			switch(characters[i]) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vowel++;
				break;
			case ' ':
			case '\t':
			case '\n':
			case ',':
			case '.':
			case '!':	
			case '?':	
				break;
			default:
				conso++;
				break;
			}
		}
		return new int[] {conso, vowel};
	}
}


