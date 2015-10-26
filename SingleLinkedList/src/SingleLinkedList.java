
public class SingleLinkedList<E> {
	private Node<E> head = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	private static class Node<E> {
		private E data;
		private Node<E> next;
		
		private Node(E dataItem, Node<E> nodeRef){
			data = dataItem;
			next = nodeRef;
		}
	}

	
}

