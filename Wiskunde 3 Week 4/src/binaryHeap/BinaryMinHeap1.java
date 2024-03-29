package binaryHeap;

public class BinaryMinHeap1<E extends Comparable<E>> {

	private E[] heap ;
	private int size ;

	public BinaryMinHeap1(int capacity){
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

	public E getMax(){
		int s = (int) Math.floor((size-2) / 2);
		E max = heap[s];
		for(int i = s+1; i < size; i++)
			if(heap[i].compareTo(max) < 0) max = heap[i];
		return max;		
	}

	//	Geoptimaliseerd
	//	public E getMax(){
	//		int s = (size/2);
	//		E max = heap[s];
	//		for(int i = s; i < size; i++)
	//			if(heap[i].compareTo(max) < 0) max = heap[i];
	//		return max;		
	//	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		for(int i=0; i<size; ++i){
			buffer.append(heap[i] + " ");
		}
		return buffer.toString();
	}
}