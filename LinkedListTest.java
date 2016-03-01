import java.util.LinkedList;

public class LinkedListTest {
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.add("F");
		list.add("B");
		list.add("D");
		list.add("E");
		list.add("C");
		
		list.addLast("G");
		list.addFirst("A");
		
		list.add(1,"A2");
		
		System.out.println("init data:" + list);
		//init data:[A, A2, F, B, D, E, C, G]
		
	}
	
}