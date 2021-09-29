
public class ProductTest {

	public static void main(String[] args) {
		
		Product p = new Product();
		DiscountProduct d = new DiscountProduct();
		
		p.setName("27인치 모니터");
		p.setPrice(250000);
		
		d.setName("40인치 모니터");
		d.setPrice(300000);
		d.setDiscountProduct(25);
		
		System.out.println(d);

	}

}
