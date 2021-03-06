
public class BST<E extends Comparable<E>> {
	private Node<E> root;
	
	public BST(){
		root = null;
	}
	
	//wrapper for add method
	public boolean add(E item){
		if(root == null){
			root = new Node(item);
			return true;
		}else{
			return add(root, item);
		}
	}
	
	public boolean add(Node<E> localRoot, E item){
		if(item.compareTo(localRoot.data) == 0){
			return false;
		}else if(item.compareTo(localRoot.data) < 0){
			if(localRoot.left == null){
				localRoot.left = new Node<E>(item);
				return true;
			}else{
				return add(localRoot.left, item);
			}
		}else{
			if(localRoot.right == null){
				localRoot.right = new Node<E>(item);
				return true;
			}else{
				return add(localRoot.right, item);
			}
		}
		

	}
	
	//display formatted tree
	public String toString(){
		StringBuilder sb = new StringBuilder();
		preOrderTraverse(root, 1, sb);
		return sb.toString();
	}
	
	public void preOrderTraverse(Node<E> node,int depth, StringBuilder sb){
		for(int i = 1; i < depth; i++){
			sb.append(" ");
			if(node == null){
				sb.append("null\n");
			}else{
				sb.append(node.data.toString());
				sb.append("\n");
				preOrderTraverse(node.left, depth+1, sb);
				preOrderTraverse(node.right, depth+1, sb);
			}
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
