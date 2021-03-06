

import Bag.Bag;
import Bag.Book;
import Bag.Notebook;
import Bag.PencilCase;

public class BagTest {

	public static void main(String[] args) {

		Bag<Book> bag = new Bag<>(new Book());
		Bag<PencilCase> bag2 = new Bag<>(new PencilCase());
		Bag<Notebook> bag3 = new Bag<>(new Notebook());
		
		// Bag<Water> bag4 = new Bag<>(new Water());
		
		bag.setOwner("김푸름");
		bag2.setOwner("김푸름");
		
		
		bag.showType();
		System.out.println("Thing is : " + bag.getThing());
		
		bag2.showType();
		System.out.println("Thing is : " + bag2.getThing());
		
		bag3.showType();
		System.out.println("Thing is : " + bag3.getThing());
		
		boolean result = bag.isSameOwner(bag2);
		if(result) {
			System.out.println("소유자가 동일합니다.");
		}
		else {
			System.out.println("소유자가 다릅니다.");
		}
		
	}

}
