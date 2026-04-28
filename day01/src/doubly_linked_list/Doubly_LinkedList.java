package doubly_linked_list;

public class Doubly_LinkedList {
	private D_Node head;

	public Doubly_LinkedList() {
		head = null;
	}

	public void insertFirst(int data) {
		D_Node newNode = new D_Node(data);

		if (head == null) {
			head = newNode;
			return;
		}
		newNode.setNext(head);
		head.setPrev(newNode);
		head = newNode;
	}

	public void insertLast(int data) {
		D_Node newNode = new D_Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		D_Node temp = head;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		newNode.setPrev(temp);
		temp.setNext(newNode);
		return;
	}

	public void insertAtPos(int data, int pos) {
		D_Node newNode = new D_Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		if (pos == 1) {
			insertFirst(data);
			return;
		}
		D_Node temp = head;
		for (int i = 1; i < pos - 1 && temp.getNext() != null; i++) {
			temp = temp.getNext();
		}
		newNode.setNext(temp.getNext());
		newNode.setPrev(temp);
		if (temp.getNext() != null) {
			newNode.getNext().setPrev(newNode);
		}
		temp.setNext(newNode);
		return;
	}

	public int deleteFirst() {
		if (head == null) {
			return -1;
		}
		int d;
		if (head.getNext() == null) {
			d = head.getData();
			head = null;
			return d;
		}
		D_Node deletable = head;
		head = head.getNext();
		head.setPrev(null);
		deletable.setNext(null);
		d = deletable.getData();
		deletable = null;
		return d;
	}

	public int deleteLast() {
		if (head == null) {
			return -1;
		}
		int d;
		if (head.getNext() == null) {
			d = head.getData();
			head = null;
			return d;
		}
		D_Node temp = head;
		while (temp.getNext().getNext() != null) {
			temp = temp.getNext();
		}
		D_Node deletable = temp.getNext();
		temp.setNext(null);
		deletable.setPrev(null);
		d = deletable.getData();
		deletable = null;
		return d;
	}

	public int deleteByPos(int pos) {
		if (head == null) {
			return -1;
		}
		if(pos <= 0) {
			System.out.println("Invalid Position !!!!");
			return-1;
		}
		int d;
		if (pos == 1) {
			return deleteFirst();
		}
		D_Node temp = head;
		int i;
		for (i = 1; i < pos - 1 && temp!= null; i++) {
			temp = temp.getNext();
		}
		if (temp == null||temp.getNext() == null) {
			System.out.println("Invalid Position !!!!");
			return -1;
		}
		D_Node deletable = temp.getNext();
		if (deletable.getNext() == null) {
			temp.setNext(null);
			deletable.setPrev(null);
		}
		else {
			temp.setNext(deletable.getNext());
			deletable.getNext().setPrev(temp);
		}
		deletable.setNext(null);
		deletable.setPrev(null);
		d = deletable.getData();
		deletable = null;
		return d;
	}
	public void display() {
		if(head==null) {
			System.out.println("Linked List is Empty!!!!");
			return;
		}
		D_Node temp = head;
		while(temp !=null) {
			System.out.print(temp.getData()+" -> ");
			temp=temp.getNext();
		}
		return;
	}
}
