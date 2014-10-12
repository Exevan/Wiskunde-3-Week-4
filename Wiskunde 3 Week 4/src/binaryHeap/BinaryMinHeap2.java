package binaryHeap;

public class BinaryMinHeap2<E extends Comparable<E>> {

	private E[] heap ;
	private int size ;

	public BinaryMinHeap2(int capacity){
		heap = (E[]) new Comparable[capacity];
		size = 0;
	}

	@SuppressWarnings("unchecked")
	private void doubleCapacity(){
		E[] oldHeap = heap;
		heap = (E[]) new Comparable[oldHeap.length*2];
		for(int i=0; i<oldHeap.length; ++i){
			heap[i] = oldHeap[i];
		}
	}

	public void insert(E x) {
		if(size == 0) {
			heap[0] = x;
			size+=1;
			return;
		}

		if(heap[size-1] != null)
			doubleCapacity();
		heap[size] = x;

		int i = size;
		while((i != 0) && smaller(x, heap[(i-1)/2])) {		
			heap[i] = heap[(i-1)/2];
			i = (i-1)/2;
		}
		heap[i] = x;
		size+=1;
	}

	private boolean smaller(E a, E b) {
		return a.compareTo(b) < 0;
	}

	public E deleteMin (){
		if (size <= 0) return null ;
		E tmp = heap[0];
		heap[0] = heap[size -1];
		int i = 0;
		boolean stop = false ;
		do {
			int left = 2*i+1;
			int right = 2*i+2;
			int smallest = i;
			
			if(left < size && heap[left].compareTo(heap[smallest]) < 0)
				smallest = left;
			if(right < size && heap[right].compareTo(heap[smallest]) < 0)
				smallest = right;
			
			if(smallest != i) {
				E tmp2 = heap[i]; //toegevoegd
				heap[i] = heap[smallest];
				heap[smallest] = tmp2; //toegevoegd
				i = smallest ;
			} else {
				stop = true ;
				heap[i] = heap[size-1];
			}
			
		} while(!stop);
		-- size ;
		return tmp ;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		for(int i=0; i<size; ++i){
			buffer.append(heap[i] + " ");
		}
		return buffer.toString();
	}
}