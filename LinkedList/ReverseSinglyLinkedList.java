
public class ReverseSinglyLinkedList {
	private static ListNode head;
	public static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void display() {
		ListNode current = head;
		while(current != null) {
			System.out.println(current.data + " ---> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public void display(ListNode node) {
		ListNode current = node;
		System.out.println("Reversed List : ");
		while(current != null) {
			System.out.println(current.data + " ---> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public static ListNode reverse(ListNode head) {
		if(head==null) {
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous=current;
			current=next;
			
		}
		return previous;
		
	}
	
	public static void main(String[] args) {
		ReverseSinglyLinkedList s1 = new ReverseSinglyLinkedList();
		ListNode n1 = new ListNode(10);
		ListNode n2 = new ListNode(8);
		ListNode n3 = new ListNode(1);
		ListNode n4 = new ListNode(11);
		
		s1.head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		s1.display();
		
		ListNode previous = s1.reverse(head);
		s1.display(previous);
		
		
	}

}
