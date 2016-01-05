
public class SLList<E extends Comparable> {
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
	
	public String get(int index){
		int count = 0;
		Node<E> p = head;
		String str = "";

		while(p != null ){
			if(count == index){
				return p.data.toString();
			}else{
				count++;
				p = p.next;
			}
		}
		return "";
	}
	
	public String toString(){
		Node<E> p = head;
		String str = "";
		
		while(p != null){
			str = str + p.data.toString() + "\n";
			p = p.next;
		}
		return str;
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
	
	public int size(){
		return size;
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