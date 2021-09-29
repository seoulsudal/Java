import exam.Store;

public class StoreTest {

	public static void main(String[] args) {

		Store<String> store = new Store<String>();
		
		String str = "java";
		store.setData(str);
		
		String s = store.getData();
		System.out.println(s);
	}

}
