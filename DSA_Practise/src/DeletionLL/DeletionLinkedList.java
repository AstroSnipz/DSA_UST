package DeletionLL;

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


public class DeletionLinkedList {
	
	public static void Traversal(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	public static Node convertArr2LL(int[] arr) {
		if(arr.length==0) {  //checks if there are no elements in the array
			return null;
		}
		Node head = new Node(arr[0]);
		Node mover = head;
		for(int i=1; i<arr.length; i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;
		}
		
		return head;
	}
	
	// Deleting the Head of LinkedList
	public static Node DeleteHead(Node head) {
		if(head==null) {
			return null;
		}
		head = head.next;
		return head;
	}
	
	// Deleting the Tail of LinkedList
	public static Node DeleteTail(Node head) {
		if(head==null || head.next==null) { // checks if its an empty  LL || if there is only one node in LL
			return null;
		}
		Node temp = head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
		return head;
	}
	
	// Deleting kth element of LinkedList
	public static Node DeleteKthElement(Node head, int k) {
		if(head==null) {
			return null;
		}
		if(k==1) {
			head = head.next;
			return head;
		}
		Node temp = head;
		Node prev = null;
		int count = 0;
		while(temp!=null) {
			count++;
			if(count==k) {
				prev.next = prev.next.next;
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		return head;
	}
	
	// Deleting a value in LinkedList
	public static Node DeleteN(Node head, int val) {
		if(head==null) {
			return null;
		}
		if(val==head.data) {
			head = head.next;
		}
		Node temp = head;
		Node prev = null;
		while(temp!=null) {
			if(temp.data==val) {
				prev.next = prev.next.next;
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		return head;
	}
	
	
	
	
	public static void main(String[] args) {
		
		int[] arr = {12, 5, 6, 8};
		Node head = convertArr2LL(arr);
//		head = DeleteHead(head);
//		head = DeleteTail(head);
//		head = DeleteKthElement(head, 2);
		head = DeleteN(head, 8);
		Traversal(head);
		
	}
}
