package LLTraversal;

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

public class LLTraversal {
	
	public static Node convertArr2LL(int[] arr){
		Node head = new Node(arr[0]);
		Node mover = head;
		for(int i=1;i<arr.length; i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;
			
		}
		return head;
	}
	
	public static int LengthOfLL(Node head) {
		int count = 0;
		Node temp = head;
		while(temp!=null) {
			temp=temp.next;
			count++;
		}
		
		return count;
	}
	
	public static boolean checkIfPresent(Node head, int val) {
		
		Node temp = head;
		while(temp!=null) {
			if(val == temp.data) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public static void main(String[] args) {
		
		int[] arr = {12, 5, 6, 8};
		Node head = convertArr2LL(arr);
		
		// LinkedList Traversal
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
		//Length of LL
		System.out.println("Length: "+LengthOfLL(head));
		
		// Searching an element in LinkedList
		System.out.println(checkIfPresent(head, 12));

	}

}
