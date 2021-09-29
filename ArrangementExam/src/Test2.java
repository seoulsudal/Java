
public class Test2 {

	public static void main(String[] args) {
		
		char letter = 'A';
		char[] alphabet = new char[26];

		for(int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char) (letter + i);
		}
		for(char j : alphabet) {
			System.out.println(j);
		}
	}

}
