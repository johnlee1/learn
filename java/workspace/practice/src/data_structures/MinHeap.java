package data_structures;

public class MinHeap {
	
	private int[] heap;
	private int heapSize;
	
	public MinHeap(int capacity) {
		this.heap = new int[capacity];
		this.heapSize = 0;
	}
	
	public int leftChildPos(int pos) {
		assert pos < heapSize/2 : "Position has no left child";
		return 2*pos + 1;
	}
	
	public int rightchild(int pos) {
		assert pos < (heapSize-1)/2 : "Position has no right child";
		return 2*pos + 2;
	}
	
	public int parentPos(int pos) {
		assert pos > 0 : "Position has no parent";
		return (pos-1)/2;
	}
	
	public void swap(int pos1, int pos2) {
	    int temp = heap[pos1];
	    heap[pos1] = heap[pos2];
	    heap[pos2] = temp;
	}
	
	public void insert(int val) {
		if (heapSize == heap.length-1) doubleHeapSize();
		int pos = ++heapSize;
		for (; pos > 0 && val < heap[pos/2]; pos = pos/2)
			heap[pos] = heap[pos/2];
		heap[pos] = val;
	}
	
	public int extraMin() {
      int min = heap[0];
      heap[1] = heap[heapSize--];
      siftDown(1);
      return min;
	}
	
	private void doubleHeapSize() {
		int[] old = heap;
		heap = new int[2*heap.length];
		System.arraycopy(old, 0, heap, 0, heapSize);
	}
	
	private void siftDown(int pos) {
		int temp = heap[pos];
		int child;

		for (; 2*pos <= heapSize; pos = child)
	    {
			child = 2*pos;
			if (child != heapSize && heap[child] < heap[child + 1]) child++;
	        if (heap[child] < temp)  heap[pos] = heap[child];
	        else
	        	break;
	    }
		heap[pos] = temp;
	}
}
