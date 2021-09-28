
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount("홍길동", "1231241241", 3000, 3);

		System.out.println(account1);
		System.out.println(account2);
	}

}
