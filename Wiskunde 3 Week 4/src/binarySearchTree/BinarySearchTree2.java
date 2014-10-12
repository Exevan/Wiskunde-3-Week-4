package binarySearchTree;

public class BinarySearchTree2 {

	private class BinaryNode {

		public int data ;
		public BinaryNode left , right ;

		public BinaryNode (int data){
			this (data, null, null);
		}

		public BinaryNode (int data, BinaryNode leftChild, BinaryNode rightChild) {
			this.data = data ;
			this.left = leftChild ;
			this.right = rightChild ;
		}
	}	

	private BinaryNode root ;

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