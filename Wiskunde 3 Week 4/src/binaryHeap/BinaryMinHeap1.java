package binaryHeap;

public class BinaryMinHeap1<E extends Comparable<E>> {
	
	private E[] heap ;
	private int size ;
	
	public BinaryMinHeap1(int capacity){
		heap = (E[]) new Comparable[capacity];
		size = 0;
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
}