
public class Test1 {

	public static void main(String[] args) {
	
/*		//int[] arr = {10, 20, 30, 40, 50};
		//int[] arr1 = arr;
		//arr1[0] = 50;

		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
	
		System.out.println(arr[0]);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		System.out.println(arr1[1]);
		System.out.println();
		System.out.println(arr.length);
		System.out.println(arr1.length);
*/		
		int[] number = new int[10];
		
		for(int i = 0; i < number.length; i++) {
			number[i] = (int) (Math.random() * 10);
			
			//System.out.println(number[i]);
		}
		
		for(int i : number) {
		
			System.out.println(i);
		}

		
	}

}
