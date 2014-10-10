package binarySearchTree;

public class BinarySearchTree1 {

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


	public int getMax() {
		return getMax(root);
	}

	public int getMax(BinaryNode node) {
		if(node.right == null)
			return node.data;
		else
			return getMax(node.right);
	}
}