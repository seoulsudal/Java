
public class Numbers {

	public static void main(String[] args) {
		
		int[] numbers = new int[5];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 10); 
		}
		
		for(int j : numbers) {
			System.out.println(j);
		}

	}

}
