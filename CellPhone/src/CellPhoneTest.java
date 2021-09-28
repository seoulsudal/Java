import java.util.Scanner;

public class CellPhoneTest {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 인스턴스
		CellPhone phone = new CellPhone();
		
		// 정보 입력
		System.out.println("모델명을 입력하세요.");
		phone.setModelName(input.nextLine());
		
		System.out.println("제조회사를 입력하세요.");
		phone.setManufactureCompany(input.nextLine());
		
		System.out.println("색상을 입력하세요.");
		phone.setColor(input.nextLine());
		
		System.out.println("전원 여부를 입력하세요.(true/false)");
		phone.setPower(input.nextBoolean());
		
		System.out.println("카메라 장착여부를 입력하세요.(true/false)");
		phone.setCamera(input.nextBoolean());
		
		phone.powerStatuse();
		System.out.println(phone.getModelName());
		System.out.println(phone.getManufactureCompany());
		System.out.println(phone.getColor());
		System.out.println(phone.isPower());
		System.out.println(phone.isCamera());
		
	}

}
