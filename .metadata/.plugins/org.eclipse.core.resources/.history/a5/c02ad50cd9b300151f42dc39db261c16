
public class BST<E extends Comparable<E>> {
	private Node<E> root;
	
	public BST(){
		root = null;
	}
	
	public add(E item){
		if(root == null){
			root = item;
		}
	}
	
	private class Node<E>{
		private E data;
		private Node<E> left;
		private Node<E> right;
		
		private Node(E data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
		
		private Node(E data, Node<E> left, Node<E> right){
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
}
