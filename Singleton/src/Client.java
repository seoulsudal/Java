
public class Client {

	public static void main(String[] args) {
		
		OperationSingleton calculatorSingleton = OperationSingleton.getInstance();
		
		int firstNumber = 100;
		int seconNumber = 20;
		
		calculatorSingleton.operate(OperationSingleton.ADD_OPERATION, firstNumber, seconNumber);
		calculatorSingleton.operate(OperationSingleton.SUBSTRACT_OPERATION, firstNumber, seconNumber);
		calculatorSingleton.operate(OperationSingleton.MULTIPLY_OPERATION, firstNumber, seconNumber);
		calculatorSingleton.operate(OperationSingleton.DIVIDE_OPERATION, firstNumber, seconNumber);		

	}

}
