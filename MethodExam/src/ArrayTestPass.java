
public class ArrayTestPass {

	public static void main(String[] args) {
		
		int[] array = {10, 20};
		
		System.out.println("swap 메소드 호출 이전");
		System.out.println("배열의 인수값 : "+array[0]+", "+array[1]);
		swap(array[0], array[1]);
		System.out.println("swap 메소드 호출 이후");
		System.out.println("배열의 인수값 : "+array[0]+", "+array[1]);
		
		System.out.println("\n배열에 인수 전달");
		System.out.println();
		System.out.println("swapFirstTwoInArray 메소드 호출 이전");
		System.out.println("배열의 인수값 : "+array[0]+", "+array[1]);
		swapFirstTwoInArray(array);
		System.out.println("swapFirstTwoInArray 메소드 호출 이후");
		System.out.println("배열의 인수값 : "+array[0]+", "+array[1]);

	}

	private static void swapFirstTwoInArray(int[] arrayPass) {
		int temp;
		temp = arrayPass[0];
		arrayPass[0] = arrayPass[1];
		arrayPass[1] = temp;
	}

	private static void swap(int i, int j) {
		int temp;
		temp = i;
		i = j;
		j = temp;
	}

}
