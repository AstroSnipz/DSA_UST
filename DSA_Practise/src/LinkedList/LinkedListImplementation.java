package LinkedList;

class Node{
	int data;
	Node next;
	
	Node(int data, Node next){
		this.data = data;
		this.next = next;
		}
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class LinkedListImplementation {

	public static void main(String[] args) {
		
		Node node1 = new Node(10);
		Node node2 = new Node(20, node1);
		System.out.println(node2.next);
	}

}
