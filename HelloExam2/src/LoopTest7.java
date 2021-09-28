
public class LoopTest7 {

	public static void main(String[] args) {
		
		// 변수 생성
		int sum;	// 합
		
		// 합 초기화
		sum = 0;
		
		// 반복 계산
		for(int i = 0; i <= 10; ++i) {
			if(i % 3 == 0) {
				sum = sum + i;
				System.out.println(sum);
			}
		}
		// 결과 출력
		System.out.println("1부터 10까지의 수 중에서 3의 배수의 합은 "+sum+" 입니다.");

	}

}
