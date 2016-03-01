

public class NodeTest2 {
	
	public static void main(String[] args) {
		
		Node node1 = new Node("node1");
		Node node2 = new Node("node2");
		Node node3 = new Node("node3");
		
		node1.next = node2;
		node1.previous = node3;
		
		node2.previous = node1;
		node2.next = node3;
		
		node3.next = node1;
		node3.previous = node2;
		
		//insert node4 between node1 and node2
		Node node4 = new Node("node4");
		
		node1.next = node4;
		node4.previous = node1;
		node4.next = node2;
		node2.previous = node4;
		
		//delete node4
		node1.next = node2;
		node2.previous = node1;
		node4.previous = null;
		node4.next = null;
		
	}
	
}

class Node {
	
	Node previous;
	
	String data;
	
	Node next;
	
	public Node (String data) {
		this.data = data;
	}
	
}