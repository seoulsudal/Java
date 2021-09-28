
public class FruitTest {

	public static void main(String[] args) {

		//Melon melon = new Melon(350.6, 25000, 2.5);
		Melon melon = new Melon();
		melon.setCalorie(350.6);
		melon.setPrice(25000);
		melon.setWeight(2.5);
		melon.setCultivationPlantationInformation("대한민국 제주도");
		
		System.out.println(melon);

	}

}
