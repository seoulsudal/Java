package vector;

import vector.Print;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Test03 {

	public static void main(String[] args) {

		Vector<String>vector = new Vector<String>(20);
		Print p = new Print();

		vector.addElement("서울");
		vector.addElement("도쿄");
		vector.addElement("뉴욕");
		
		for(int i = 0; i < vector.size(); i++) {
			System.out.print(vector.elementAt(i) + "\t");
		}
		
		System.out.println("\n");
		
		System.out.println("1 : " + vector.firstElement());
		System.out.println("2 : " + vector.lastElement());
		
		vector.insertElementAt("파리", 2);
		p.Print(3, vector);
		vector.setElementAt("런던", 1);
		p.Print(4, vector);
		
		System.out.println("3 : " + vector.capacity());
		System.out.println("4 : " + vector.size());
		
		vector.trimToSize();
		
		System.out.println("5 : " + vector.capacity());
		
		vector.removeElement("뉴욕");
		p.Print(6, vector);
		vector.removeElementAt(1);
		p.Print(7, vector);
		vector.removeAllElements();
		p.Print(8, vector);
		
		List<String> list = Arrays.asList("서울", "도쿄", "뉴욕");
		vector.addAll(list);
		p.Print(9, vector);
		vector.setSize(6);
		p.Print(10, vector);
	}

}
