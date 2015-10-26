
public class SingleLinkedList<E> {
	private Node<E> head = null;
	private int size = 0;
	
	public void add( E item ){
		head = new Node<E>( item, head );
		size++;
	}
	
	public void addLast(E item){
		Node p = head;
		while( p.next!= null ){
			p = p.next; 
			
		}
	}
	
	
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

