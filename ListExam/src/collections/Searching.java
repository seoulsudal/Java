package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Searching {

	public static void main(String[] args) {

		int key = 50;
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < 100; i++) {
			list.add(i);
		}
		
		//Collections.shuffle(list);
		
		int index = Collections.binarySearch(list, key);
		System.out.println("탐색의 반환값 = " + index);
		
	}

}
