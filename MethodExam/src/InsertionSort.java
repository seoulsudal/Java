
public class InsertionSort {

	public static void main(String[] args) {
		
		// 배열 생성
		int[] dataSort;
		int[] data = {8, 9, 5, 3, 4, 7, 1, 6, 2};
		
		System.out.println("삽입 정렬 전 데이터");
		for(int i : data) {
			System.out.print(i+", ");
		}
		
		System.out.println("\n\n삽입 정렬 후 데이터");
		
		// 삽입 정렬 메소드 호출
		dataSort = insertionSort(data);
		
		for(int i : data) {
			System.out.println(i+", ");
		}

	}

	private static int[] insertionSort(int[] data) {
		for(int i = 1; i < data.length; i++) {
			
			int currentElement;
			currentElement = data[i];
			
			int k;
			for(k = i - 1; (k > 0) && (data[k] > currentElement); k--) {
				data[k + 1] = data[k];
			}
			//현재 요소를 data[k + 1]에 저장
			data[k + 1] = currentElement;
		}
		return data;
	}

}
