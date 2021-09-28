import java.util.Scanner;

public class TestVoidMethod {

	public static void main(String[] args) {
		double score;

		Scanner input = new Scanner(System.in);
		System.out.print("학점 : ");
		score = input.nextDouble();
		printGrade(score);

	}
	public static void printGrade(double score) {
		if(score < 0 || score > 100) {
			System.out.println("유효하지 않은 점수");
		}
		else if(score >= 90.0) {
			System.out.println("A");
		}
		else if(score >= 80.0) {
			System.out.println("B");
		}
		else if(score >= 70.0) {
			System.out.println("C");
		}
		else if(score >= 60.0) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}

}
