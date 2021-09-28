import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);

		String name; // 이름 변수 선언
		String city; // 도시 변수 선언
		int age; // 나이 변수 선언
		double weight; // 무게 변수 선언
		boolean single; // 독신 변수 선언

		System.out.println("이름을 입력하세요.");
		name = input1.nextLine(); // 이름 입력

		System.out.println("도시를 입력하세요.");
		city = input1.nextLine(); // 도시 입력

		System.out.println("나이를 입력하세요.");
		age = input.nextInt(); // 나이 입력

		System.out.println("무게를 입력하세요.");
		weight = input.nextDouble();// 무게 입력

		System.out.println("독신여부를 입력하세요.");
		single = input.nextBoolean();// 독신 입력

		System.out.print("이름은 " + name + "이고, ");
		System.out.print("도시는 " + city + ", ");
		System.out.print("나이는 " + age + "살, ");
		System.out.print("체중은 " + weight + "Kg, ");
		System.out.print("독신 여부는 " + single + " 입니다.");

		input.close();

	}

}
