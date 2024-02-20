package BinaryTree;

import java.util.Stack;

public class PreOrderTraversal {
	private TreeNode root;
	
	private class TreeNode{
		private int data; //Generic Type
		private TreeNode left;
		private TreeNode right;
		
		public TreeNode(int data) {
			this.data = data;
		}
	}
	
	//Recursive Pre-Order
	public void preOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		System.out.println(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	//Iterative Pre-Order
	public void preOrderIterative(TreeNode root) {
			if(root == null) {
				return;
			}
			Stack<TreeNode> stack = new Stack<>();
			stack.push(root);
			while(!stack.isEmpty()) {
				TreeNode temp = stack.pop();
				System.out.println(temp.data);
				if(temp.right != null) {
					stack.push(temp.right);
				}
				if(temp.left != null) {
					stack.push(temp.left);
				}
			}
		}
	
	public void createBinaryTree() {
		TreeNode t1 = new TreeNode(9);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		/* TreeNode t5 = new TreeNode(5); */
		
		root = t1;
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		/* t2.right = t5; */
		
	}
	
	public static void main(String[] args) {
		PreOrderTraversal bt = new PreOrderTraversal();
		bt.createBinaryTree();
		System.out.println("Recursive PreOrder Traversal");
		bt.preOrder(bt.root);
		System.out.println("Iterative PreOrder Traversal");
		bt.preOrderIterative(bt.root);
		
	}

}

