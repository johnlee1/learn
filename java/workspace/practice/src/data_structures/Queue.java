package data_structures;

import java.util.NoSuchElementException;

public class Queue<T> {
	
	private static class Node<T> {
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	private Node<T> first;
	private Node<T> last;
	
	public void add(T data) {
		Node<T> lastNode = new Node<T>(data);
		if (last != null) {
			last.next = lastNode;
		}
		last = lastNode;
		if (first == null) {
			first = last;
		}
	}
	
	public T remove() {
		if (first == null) throw new NoSuchElementException();
		T data = first.data;
		first = first.next;
		if (first == null) {
			last = null;
		}
		return data;
	}
	
	public T peek() {
		if (first == null) throw new NoSuchElementException();
		return first.data;
	}
	
	public boolean isEmpty() {
		return first == null;
	}

}
