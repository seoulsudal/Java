
public class Test38 {

	public static void main(String[] args) {
		
		// 배열 생성
		int[][] arr = new int[5][5];
		// 변수 생성
		int num = 1;
		// 배열 초기화
		for(int j = 0; j < arr.length; j++) {
			for(int i = 0; i < arr[0].length; i++) {
				arr[j][i] = num++;
			}
		}
		// 배열 출력
		for(int j = 0; j < arr.length; j++) {
			for(int i = 0; i < arr[0].length; i++) {
				System.out.print(arr[j][i]+"\t");
			}
			System.out.println();
		}
	}

}
