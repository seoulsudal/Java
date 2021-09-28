
public class ArrayTestReverse {

	public static void main(String[] args) {
		
		int[] list = {1, 2, 3, 4, 5, 6, 7};
		int[] reverseList;
		
		System.err.println("메소드 호출 전 리스트");
		for(int i : list) {
			System.out.print(i+", ");
		}
		
		reverseList = reverse(list);
		
		System.out.println("\n\n메소드 호출 후 리스트");
		for(int i : reverseList) {
			System.out.print(i+", ");
		}
	}

	private static int[] reverse(int[] list) {
		int[] result = new int[list.length];
		for(int i = 0, j = list.length-1; i < list.length; i++, j--) {
			result[i] = list[j];
		}
		return result;
	}

}
