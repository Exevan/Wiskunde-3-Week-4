package binaryTree;

public class BinaryTree1<E> {
	
	private class BinaryNode<E> {
		public E data ;
		public BinaryNode<E> left , right ;
		
		public BinaryNode(E data) {
			this.data = data;
		}
		
		public void setLeft(BinaryNode<E> left) {
			this.left = left;
		}
		
		public void setRight(BinaryNode<E> right) {
			this.right = right;
		}
	}
	
	public BinaryNode<E> root ;	
	
	public int getMaxDepth() {
		int maxleft = 0;
		int maxright = 0;
		BinaryNode <E> node = root ;
		while (node != null) {
			node = node.left;
			maxleft ++;
		}
		node = root ;
		while ( node != null ) {
			node = node.right;
			maxright++;
		}
		return Math.max(maxleft, maxright);
	}
	
	public void initializeBinaryTree() {
		BinaryNode<Integer> nodeA = new BinaryNode<Integer>(1);
		BinaryNode<Integer> nodeB = new BinaryNode<Integer>(2);
		BinaryNode<Integer> nodeC = new BinaryNode<Integer>(3);
		BinaryNode<Integer> nodeD = new BinaryNode<Integer>(4);
		BinaryNode<Integer> nodeE = new BinaryNode<Integer>(5);
		BinaryNode<Integer> nodeF = new BinaryNode<Integer>(6);
		BinaryNode<Integer> nodeG = new BinaryNode<Integer>(7);
	
		nodeC.setLeft(nodeA);
		nodeC.setRight(nodeG);
		
		nodeA.setLeft(nodeD);
		nodeA.setRight(nodeF);
		
		nodeG.setLeft(nodeE);
		nodeG.setRight(nodeB);
		
	}
}

