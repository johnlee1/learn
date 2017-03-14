package data_structures;

import java.util.EmptyStackException;

public class Stack<T> {
	
	private static class Node<T> {
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	private Node<T> top;
	
	public T pop() {
		if (top == null) throw new EmptyStackException();
		T topData = top.data;
		top = top.next;
		return topData;
	}
	
	public void push(T data) {
		Node<T> topNode = new Node<T>(data);
		topNode.next = top;
		top = topNode;
	}
	
	public T peek() {
		if (top.data == null) throw new EmptyStackException();
		return top.data;
	}
	
	public boolean isEmpty() {
		return top == null;
	}

}
