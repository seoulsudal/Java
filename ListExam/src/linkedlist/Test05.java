package linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import vector.Print;

public class Test05 {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		Print p = new Print();
		
		list.add("서울");
		list.add("북경");
		list.add("상해");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.add(1, "LA");
		p.Print(1, list);
		list.addFirst("런던");
		p.Print(2, list);
		list.addLast("서울");
		p.Print(3, list);
		
		list.offer("파리");
		p.Print(4, list);
		list.offerFirst("로마");
		p.Print(5, list);
		list.offerLast("베른");
		p.Print(6, list);
		
		System.out.println("7 : " + list.peek());
		System.out.println("8 : " + list.peekFirst());
		System.out.println("9 : " + list.peekLast());
		
		list.poll();
		p.Print(10, list);
		list.pollFirst();
		p.Print(11, list);
		list.pollLast();
		p.Print(12, list);
		
		list.push("제주");
		p.Print(13, list);
		System.out.println("14 : " + list.pop());
		
		System.out.println("15 : " + list.get(3));
		System.out.println("16 : " + list.getFirst());
		System.out.println("17 : " + list.getLast());
		
		System.out.println("18 : " + list.indexOf("서울"));
		System.out.println("19 : " + list.lastIndexOf("서울"));
		
		list.removeFirst();
		p.Print(20, list);
		list.removeLast();
		p.Print(21, list);
		list.remove(3);
		p.Print(22, list);
		list.remove("LA");
		p.Print(23, list);
		
		List<String> list2 = Arrays.asList("북경", "상해");
		list.addAll(list2);
		
		Object obj[] = list.toArray();
		System.out.println("24 : " + Arrays.toString(obj));
		
		String cities[] = new String[0];
		cities = list.toArray(cities);
		System.out.println("25 : " + Arrays.toString(cities));
		
		list.removeAll(list2);
		p.Print(26, list);
	}

}
