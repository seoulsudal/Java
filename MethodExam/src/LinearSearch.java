
public class LinearSearch {

	public static void main(String[] args) {
		
		// 리스트
		int[] list = {1, 4, 5, -6, 2, 3, 7};
		
		int search;
		
		// 리스트에 있는 키를 찾는 메소드 호출 및 결과 출력
		search = lineSearch(list, 4);
		System.out.println("4 검색결과 인덱스 : "+search);
		search = lineSearch(list, -5);
		System.out.println("-5 검색결과 인덱스 : "+search);
		search = lineSearch(list, 7);
		System.out.println("7 검색결과 인덱스 : "+search);

	}

	// 리스트에 있는 키를 찾는 메소드
	private static int lineSearch(int[] list, int key) {
		for(int i = 0; i < list.length; i++) {
			if(key == list[i]) {
				return i;
			}
			
		}
		return -1;
	}

}
