package data_structures;

public class LinkedList {
	
	private static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}

	Node head;
	int size;
	
	LinkedList() {}
	
	void appendToTail(int data) {
		Node endNode = new Node(data);
		Node currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = endNode;
	}
	
	Node deleteNode(int data) {
		Node currentNode = head;
		
		if (currentNode.data == data) {
			this.head = currentNode.next;
			return currentNode;
		}
		
		while (currentNode.next != null) {
			if (currentNode.next.data == data) {
				currentNode.next = currentNode.next.next;
				return currentNode.next;
			}
			currentNode = currentNode.next;
		}
		
		return null;
	}
	
	
}
