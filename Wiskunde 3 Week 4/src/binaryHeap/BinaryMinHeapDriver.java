package binaryHeap;

public class BinaryMinHeapDriver {
	
	public static void main(String[] args){
		//test voor deleteMin() uit oefening 6
		BinaryMinHeap2<Integer> heap = new BinaryMinHeap2<Integer>(7);
		heap.insert(1);
		heap.insert(1);
		heap.insert(1);
		heap.insert(10);
		heap.insert(1);
		heap.insert(10);
		
		System.out.println(heap);
		heap.deleteMin();
		System.out.println(heap);

	}
	
}
