
public class Test5 {

	public static void main(String[] args) {
		
		int[] degree = {28, 30, 29, 32, 31, 28, 29, 30};
		int airConditioner = 0;
		
		int[] degree1 = {33, 30, 29, 32, 31, 35, 29, 30};
		int airConditioner1 = 0;
		
		for(int i = 0; i < degree.length; i++) {
			if(degree[i] >= 30) {
				airConditioner += 1;
			}
		}
		System.out.printf("에어컨의 총 %d시간 동안 가동 되었다.\n",airConditioner);

		for(int j : degree1) {
			if(j >= 30) {
				airConditioner1 += 1;
			}
		}
		System.out.printf("에어컨의 총 %d시간 동안 가동 되었다.\n",airConditioner1);
		
		
	}

}
