
public class SelectionSort {

	public static void main(String[] args) {
		
		// 배열 생성
		int[] data = { 40, 20, 70, 10, 50, 60, 30, 80};
		
		System.out.println("선택 정렬 전 데이터");
		for(int i : data) {
			System.out.print(i+", ");
		}
		
		System.out.println("\n\n선택 정렬 후 데이터");
		
		// 선택정리 메소드 호출
		selectionSort(data);
		
		for(int i : data) {
			System.out.print(i+", ");
		}

	}

	private static void selectionSort(int[] list) {
		// 변수 생성
		int temp;	// 임의 변수
		int least;	// 최소값
		for(int i = 0; i < list.length; i++) {
			least = 1;
			for(int j = i + 1; j < list.length; j++) {
				// 최소값 탐색
				if(list[j] < list[least]) {
					least = j;
				}
			}
			
			// i번째 원소와 least 위치의 원소를 교환
			temp = list[i];
			list[i] = list[least];
			list[least] = temp;
		}
		
	}

}
