
public class TestCircleRectangle {

	public static void main(String[] args) {
		
		// 인스턴스
		Circle circle = new Circle(1.0);

		// 출력
		System.out.println("원 : "+circle.toString());
		System.out.println("반지름 : "+circle.getRadius());
		System.out.println("면적 : "+circle.getArea());
		System.out.println("둘레 : "+circle.getDiameter());
		
		// 인스턴스
		Rectangle rectangle = new Rectangle(2, 4);
		
		// 출력
		System.out.println("\n사각형 : "+rectangle.toString());
		System.out.println("가로 : "+rectangle.getWidth());
		System.out.println("세로 : "+rectangle.getHeight());
		System.out.println("면적 : "+rectangle.getArea());
		System.out.println("둘레 : "+rectangle.getPerimeter());

	}

}
