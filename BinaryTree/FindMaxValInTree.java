package BinaryTree;

public class FindMaxValInTree {
    private TreeNode root;
	
	private class TreeNode{
		private int data; //Generic Type
		private TreeNode left;
		private TreeNode right;
		
		public TreeNode(int data) {
			this.data = data;
		}
	}
	
	public void createBinaryTree() {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(8);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5); 
		TreeNode t6 = new TreeNode(6); 
		TreeNode t7 = new TreeNode(7); 
		
		root = t1;
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		t3.right = t7;
		
	}
	
	public int findMax(TreeNode root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int result = root.data;
		int left = findMax(root.left);
		int right = findMax(root.right);
		if(left>result) {
			result = left;
		}
		if(right>result) {
			result = right;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		FindMaxValInTree b1 = new FindMaxValInTree();
		b1.createBinaryTree();
		int maxVal = b1.findMax(b1.root);
		System.out.println("Maximum Value found in Tree is : " + maxVal);
	}
    
}
