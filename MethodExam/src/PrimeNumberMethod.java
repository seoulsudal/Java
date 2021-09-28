
public class PrimeNumberMethod {

	public static void main(String[] args) {
		
		System.out.println("50개의 소수를 출력하는 프로그램");
		printPrimeNumbers(50);

	}

	// 소수를 출력하는 메소드
	private static void printPrimeNumbers(int numberOfPrimes) {

		// 변수 생성
		final int NUMBER_OF_PRIMES_PER_LINE = 10;	// 행에 10개씩
		int count;	// 소수의 개수
		int number;	// 소수의 테스트 초기 숫자
		
		// 변수 초기화
		count = 0;
		number = 2;
		
		// 소수 찾기
		while(count < numberOfPrimes) {
			// 소수 출력하고 개수를 늘린다
			if(isPrime(number)) {
				count++;
				
				if(count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					// 소수가 10번째까지 출력하고 줄 바꾸기
					System.out.printf("%-5s\n", number);
				}
				else {
					// 소수 10번전까지 출력
					System.out.printf("%-5s", number);
				}
			}
			// count를 1씩 증가
			number++;
		}
		
	}

	// 소수 구하는 메소드
	public static boolean isPrime(int number) {
		// 소수인지 테스트
		for(int divisor = 2; divisor <= number / 2; divisor++) {
			if(number % divisor == 0) {
				return false;
			}
		}
		return true;
	}

}
