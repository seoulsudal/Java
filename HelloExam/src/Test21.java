import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int hundredsPlace;	//100의 자리 변수 선언
		int tensPlace;		//10의 자리 변수 선언
		int unitsPlace;		//1의 자리 변수 선언
		int x;				//3자리 숫자 변수 선언
		int sum;			//각 자리의 수 합 변수 선언
		
		System.out.println("3자리 숫자를 입력하세요.");
		x = input.nextInt();	//3자리 숫자 입력
		
		hundredsPlace = x / 100;						//100의자리 계산
		tensPlace = (x - (hundredsPlace * 100)) / 10;	//10의자리 계산
		unitsPlace = x - (hundredsPlace * 100) - (tensPlace * 10);//1의자리 계산
		sum = hundredsPlace + tensPlace + unitsPlace;
		
		System.out.println(sum);
		
		

	}

}
