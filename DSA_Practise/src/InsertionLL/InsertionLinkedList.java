package InsertionLL;

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

public class InsertionLinkedList {
	
	public static void Traversal(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	public static Node convertArr2LL(int[] arr) {
		Node head = new Node(arr[0]);
		Node mover = head;
		for(int i=1; i<arr.length; i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;
		}
		return head;
	}
	
	// Inserting at the head of LinkedList
	public static Node InsertionAtHead(Node head, int val) {
		Node temp = new Node(val, head);
		return temp;
	}
	
	// Insertion at the Tail of LinkedList
	public static Node InsertionAtTail(Node head, int val) {
		Node tail = new Node(val);
		if(head==null) {
			return tail;
		}
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = tail;
		return head;
	}
	
	// Insertion at the Kth element
	public static Node InsertionAtK(Node head, int val, int k) {
		
		if(head==null) {
			if(k==1) {
				return new Node(val);
			}else {
				return head;
			}
		}
		
		if(k==1) {
			Node temp = new Node(val, head);
			return temp;
		}
		
		Node temp = head;
		int count = 0;
		while(temp!=null) {
			count++;
			if(count == k-1) {
				Node newNode = new Node(val);
				newNode.next = temp.next;
				temp.next = newNode;
				break;
			}
			temp = temp.next;
		}
		return head;
	}
	
	// Insertion of element before the value x
	public static Node InsertionBeforeX(Node head, int val, int x) {
		
		if(head==null) {
			return null;
		}
		
		Node newNode = new Node(val);
		if(x==head.data) {
			newNode.next = head;
			return newNode;
		}
		
		Node temp = head;
		while(temp.next!=null) { // here its temp.next coz here u no need to go till last element
			if(temp.next.data == x) {
				newNode.next = temp.next;
				temp.next = newNode;
				break;
			}
			temp = temp.next;
		}
		return head;
	}

	public static void main(String[] args) {
		
		int[] arr = {12, 5, 6, 8};
		Node head = convertArr2LL(arr);
//		Traversal(head);
//		head = InsertionAtHead(head, 7);
//		head = InsertionAtTail(head, 7);
//		head = InsertionAtK(head, 9, 5);
		head = InsertionBeforeX(head, 20, 8);
		Traversal(head);
		
	}

}
