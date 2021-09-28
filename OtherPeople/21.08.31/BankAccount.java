
public class BankAccount {
	private String name; // 이름
	private String accountNumber; // 계좌번호
	private int deposit; // 잔액
	private double interest; // 연이율
	
	// 기본 생성자
	public BankAccount() {
		this("", "", 0, 0);
	}
	// 모든 데이터 생성자
	public BankAccount(String name, String accountNumber, int deposit, double interest) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.deposit = deposit;
		this.interest = interest;
	}
	// 이름 반환
	public String getName() {
		return name;
	}
	// 이름 변경
	public void setName(String name) {
		this.name = name;
	}
	// 계좌번호 반환
	public String getAccountNumber() {
		return accountNumber;
	}
	// 계좌번호 변경
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	// 잔액 반환
	public int getDeposit() {
		return deposit;
	}
	// 잔액 변경
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	// 이자율 반환
	public double getInterest() {
		return interest;
	}
	// 이자율 변경
	public void setInterest(double interest) {
		this.interest = interest;
	}
	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", accountNumber=" + accountNumber + ", deposit=" + deposit + ", interest="
				+ interest + "]";
	}
}
