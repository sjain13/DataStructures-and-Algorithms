package algorithms.LinkedList;

import java.util.Scanner;


public class SearchInSinglyLinkedList {
	private ListNode head;
	private static class ListNode{
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
	
	public boolean find(int searchkey) {
		ListNode current = head;
		while(current!=null) {
			if(current.data == searchkey) {
				return true;
			}
			current=current.next;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		ListNode node1 = new ListNode(10);
		ListNode node2 = new ListNode(8);
		ListNode node3 = new ListNode(1);
		ListNode node4 = new ListNode(11);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		SearchInSinglyLinkedList s1 = new SearchInSinglyLinkedList();
		s1.head = node1;
		s1.head.next = node2;
		
		s1.display();
		
		//Search in SingliLinkedList
		System.out.print("Enter the number you want to search in LinkedList: ");
		
		// Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Read the user's input
        String userInput = scanner.nextLine();
		boolean found = s1.find(Integer.parseInt(userInput));
		if(found) {
			System.out.println("key is found.");
		}
		else {
			System.out.println("Key not found!!!");
		}
		scanner.close();
		
		
		
	}

}
