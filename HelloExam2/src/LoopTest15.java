
public class LoopTest15 {

	public static void main(String[] args) {
		
		// 변수 생성
		final int NUMBER_OF_PRIMES;
		final int NUMBER_OF_PRIMES_PER_LINE;
		int count;
		int number;
		
		// 변수 초기화
		NUMBER_OF_PRIMES = 50;
		NUMBER_OF_PRIMES_PER_LINE = 10;
		count = 0;
		number = 2;
		
		System.out.println("50개의 소수를 출력하는 프로그램");
		
		// 반복적으로 소수 찾기
		while(count < NUMBER_OF_PRIMES) {
			// 숫자가 소수라고 가정
			boolean isPrime = true;	// 현재 숫자를 소수라 한다.
			
			// 숫자가 소수인지 판단
			for(int divisor = 2; divisor <= (number / 2); divisor++) {
				if(number % divisor == 0) {
					isPrime = false;
					break;
				}
			}
			
			// 소수를 출력하고 개수를 늘인다.
			if(isPrime) {
				count++;
				
				if(count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					// 소수가 10번째가 되면 출력하고 새줄로 이동
					System.out.println(number+",");
				}
				else {
					// 소수가 10번쨰가 안되었을 때 출력
					System.out.print(number+" : ");
				}
			}
			number++;
		}

	}

}
