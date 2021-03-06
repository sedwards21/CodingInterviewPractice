import java.util.Iterator;
import java.util.NoSuchElementException;

public class DLList<E extends Comparable> {
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;
	
	public void add(E item){
		if(head == null){
			head = new Node<E>(item, null,null);
			tail = head;
			size++;
		}else{
			tail.next = new Node<E>(item, null, tail);
			tail = tail.next;
			size++;
		}
	}
	
	public int size(){
		return size;
	}
	
	
	public int find(E target){
		Node<E> p = head;
		int index = 0;
		while(p != null){
			if(target.compareTo(p.data) == 0 ){
				return index;
			}
			p = p.next;
			index++;
		}
		return -1;
	}
	
	public Iterator<E> iterator(){
		return new ListIter();
	}
	
	/* inner node class
	 * 
	 */
	private static class Node<E>{
		private E data;
		private Node<E> next;
		private Node<E> prev;
		
		public Node(E data, Node<E> next, Node<E> prev){
			super();
			this.data = data;
			this.next = next;
			this.prev = prev;
		}
	}
	
	/*
	 * Inner list iter
	 */
	private class ListIter implements Iterator<E>{
		private Node<E> nextItem = head;
		private Node<E> lastItemReturned = null;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return nextItem.next != null;
		}

		@Override
		public E next() {
			if( !hasNext() ){
				throw new NoSuchElementException();
			}
			lastItemReturned = nextItem;
			nextItem = nextItem.next;
			return lastItemReturned.data;
		}
		
		public void remove(){
			Node<E> delete = lastItemReturned;
			if( !hasNext() ){
				
			}else{
				lastItemReturned = lastItemReturned.next;
				delete.prev = null;
				delete.next = null;
			}
		}
		
	}
}
