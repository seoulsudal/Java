
public class Loan {
	
	// 필드 선언
	private double annuallnterestRate;	// 연이율
	private int numberOfYears;			// 대출 기간
	private double loanAmount;			// 대출금액
	private java.util.Date loanDate;	// 대출일자
	
	// 메소드 선언
	// 기본 생성자
	public Loan() {
		this(2.5, 1, 1000);
	}
	
	// 주어진 이율, 기간, 금액으로 객체 생성자
	public Loan(double annuallnterestRate, int numberOfYears, double loanAmount) {
		this.annuallnterestRate = annuallnterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}

	// 연이율 반환
	public double getAnnuallnterestRate() {
		return annuallnterestRate;
	}
	// 연이율 변경
	public void setAnnuallnterestRate(double annuallnterestRate) {
		this.annuallnterestRate = annuallnterestRate;
	}
	// 대출기간 반환
	public int getNumberOfYears() {
		return numberOfYears;
	}
	// 대출기간 변경
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}
	// 대출금액 반환
	public double getLoanAmount() {
		return loanAmount;
	}
	// 대출금액 변경
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	// 대출일 반환
	public java.util.Date getLoanDate(){
		return loanDate;
	}

	// 월 상환액 반환
	public double getMonthlyPayment() {
		double monthlyInterestRate = annuallnterestRate / 1200;		// 월 이자율 = 년 이자율 / 12(%로 받아서 100)
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (Math.pow(1 / (1 +monthlyInterestRate), numberOfYears * 12)));
		return monthlyPayment;
	}

	// 총 상환액 반환
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
	
}
