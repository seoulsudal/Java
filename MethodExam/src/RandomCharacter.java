
public class RandomCharacter {

	public static void main(String[] args) {

		// 변수 생성
		final int NUMBER_OF_CHARS = 175;	// 무작위 생성 문자 개수
		final int CHARS_PER_LINE = 25;		// 한줄의 문자 개수
		
		// 무작위 생성 문자 출력
		for(int i = 0; i < NUMBER_OF_CHARS; i++) {
			// 무작위 문자 생성기
			//char ch = getRandomLowCaseLetter();
			// char ch = getRandomUpperCaseLetter();
			// char ch = getRandomDigitCaseLetter();
			 char ch = getRandomCharacter();
			
			if((i + 1) % CHARS_PER_LINE == 0) {
				System.out.println(ch+" ");	// 다음줄 개행
			}
			else {
				System.out.print(ch+" ");
			}
			
		}

	}


	// 무작위 문자 생성기
	private static char getRandomCharacter(char char1, char char2) {		
		return (char)(char1 + Math.random() * (char2 - char1 + 1));
	}
	
	// 영어 소문자
	private static char getRandomLowCaseLetter() {
		return getRandomCharacter('a', 'z');
	}
	
	// 영어 대문자
	private static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A', 'Z');
	}
	
	// 숫자
	private static char getRandomDigitCaseLetter() {
		return getRandomCharacter('0', '9');
	}
	
	// char형 값의 범위(0 ~ 65535)
	private static char getRandomCharacter() {
		return getRandomCharacter('\u0000', '\uFFFF');
	}
}
