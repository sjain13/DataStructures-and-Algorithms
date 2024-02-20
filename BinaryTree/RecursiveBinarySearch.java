package BinaryTree;

import java.util.Scanner;

public class RecursiveBinarySearch {
    private TreeNode root;
	
	private class TreeNode{
		private int data;
		private TreeNode left;
		private TreeNode right;
		
		public TreeNode(int data) {
			this.data = data;
		}
	}
	
	//Recursive Binary Search
	public TreeNode search(TreeNode root, int key) {
		if(root == null || root.data == key) {
			return root;
		}
		if(key < root.data) {
			return search(root.left, key);
		}
		else {
			return search(root.right,key);
		}
	}
	
	public TreeNode insert(TreeNode root, int value) {
		if(root==null) {
			root = new TreeNode(value);
			return root;
		}
		if(value < root.data) {
			root.left = insert(root.left, value);
		}
		else {
			root.right = insert(root.right, value);
		}
		return root;
	}
	
	public void insert(int value) {
		root = insert(root, value);
	}
	
	public void inOrder() {
		inOrder(root);
	}
	
	public void inOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.println(root.data + " ");
		inOrder(root.right);
	}
	
	public static void main(String[] args) {
		RecursiveBinarySearch bt = new RecursiveBinarySearch();
		bt.insert(5);
		bt.insert(3);
		bt.insert(7);
		bt.insert(1);
		
		bt.inOrder();
		
		System.out.print("Enter the number you want to search in BinaryTree: ");
		try (// Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in)) {
            // Read the user's input
            String userInput = scanner.nextLine();
            
            TreeNode searchNode = bt.search(bt.root, Integer.parseInt(userInput));
            if(searchNode != null) {
            	System.out.println("Node found is :" + searchNode.data);
            }
            else {
            	System.out.println("Node node found. ");
            }
            scanner.close();
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
		
	}
    
}
