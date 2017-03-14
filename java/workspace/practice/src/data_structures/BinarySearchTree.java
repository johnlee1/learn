package data_structures;

public class BinarySearchTree<T extends Comparable<T>> {

	private static class Node<T extends Comparable<T>> {
		private T data;
		private Node<T> leftChild;
		private Node<T> rightChild;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	public Node<T> rootNode;
	
	public Node<T> insert(Node<T> node, T data) {
		if (node == null) {
			node = new Node<T>(data);
		} else if (data.compareTo(node.data) < 0) {
			node.leftChild = insert(node.leftChild, data);
		} else {
			node.rightChild = insert(node.rightChild, data);
		}
		return node;
	}
	
	public void visit(Node<T> node) {
		System.out.println(node.data);
	}
	
	public void inOrderTraversal(Node<T> node) {
		if (node != null) {
			inOrderTraversal(node.leftChild);
			visit(node);
			inOrderTraversal(node.rightChild);
		}
	}
	
	public void postOrderTraversal(Node<T> node) {
		if (node != null) {
			postOrderTraversal(node.leftChild);
			postOrderTraversal(node.rightChild);
			visit(node);
		}
	}
}
