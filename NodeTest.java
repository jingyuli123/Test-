

public class NodeTest {
	
	public static void main(String[] args) {
		
		Node node1 = new Node("node1");
		Node node2 = new Node("node2");
		Node node3 = new Node("node3");
		
		node1.next = node2;
		node2.next = node3;
		
		System.out.println(node1.next.next.data);//node3
		
	}
	
}

class Node {
	
	String data; 
	
	Node next;
	
	public Node(String data) {
		this.data = data;
	}
	
}