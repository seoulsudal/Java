
public class BinarySearch {

	public static void main(String[] args) {
		
		// 변수 생성
		int[] data = {10, 20, 30, 40, 50, 60, 70, 80};
		
		// 데이터에서 수를 찾는 메소드 호출
		int retValue = binarySearch(data, 60);
		
		// 결과 출력
		if(retValue != -1) {
			System.out.println("인덱스 "+retValue+" 에서 발견");
		}
		else {
			System.out.println("탐색 실패");
		}

	}

	private static int binarySearch(int[] list, int key) {
		// 변수 생성
		int low;
		int middle;
		int high;
		
		// 변수 초기화
		low = 0;
		high = list.length - 1;
		
		// 검색
		while(low <= high) {				// 아직 수가 남아있는지 확인
			middle = (low + high) / 2;		// 중간요서 결정
			if(key == list[middle]) {
				return middle;
			}
			else if(key > list[middle]) {	// 중간요소보다 크면
				low = middle + 1;			// 새로운 low값 설정
			}
			else {							// 중간요소보다 작으면
				high = middle - 1;			// 새로운 high값 설정
			}
		}
		return -1;
	}

}
