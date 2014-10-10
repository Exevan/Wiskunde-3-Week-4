package binaryTree;

public class BinaryTree2 {

	private class BinaryNode {
		public int data;
		public BinaryNode left, right ;
	}

	private BinaryNode root;

	public boolean lookup (int target) {
		BinaryNode node = root;
		while(node != null && node.data != target) {
			if(target < node.data)
				node = node.left;
			else
				node = node.right;
		}
		return node != null;
	}
}