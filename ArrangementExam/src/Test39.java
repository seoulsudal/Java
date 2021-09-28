
public class Test39 {

	public static void main(String[] args) {
		// 배열 생성
		int[][] arr = {{1, 2, 3, 4, 5},
					   {6, 7, 8, 9, 10},
					   {11, 12, 13, 14, 15},
					   {16, 17, 18, 19, 20},
					   {21, 22, 23, 24, 25}};
		// 합 선언
		int sum;
		// 합 초기화
		sum = 0;
		// 알고리즘
		for(int j = 0; j < arr.length; j++) {
			for(int i = 0; i < arr[0].length; i++) {
				if(i == j) {
					sum += arr[j][i];
				}
			}
		}
		System.out.println("합계 : "+sum);
	}

}
