package binaryTree;

public class BinaryTree2<E> {

	private class BinaryNode<E> {

		public E data;
		public BinaryNode<E> left, right ;

		public String toString(){
			return data.toString();
		}
	}

	private BinaryNode<E> root;


	public void printInorder2(){
		Stack<BinaryNode<E>> stack = new Stack <BinaryNode <E> >();
		BinaryNode <E > node = root ;
		while (! stack . isEmpty () || node != null ){
			if ( node != null ){
				stack . push ( node );
				node = node . getLeft ();
			} else {
				node = stack . pop ();
				System . out . print ( node . toString () + " " );
				if ( node . getRight () != null ){
					stack . push ( node . getRight ());
				}
				node = null ;
			}
		}
		System . out . println ();
	}


}