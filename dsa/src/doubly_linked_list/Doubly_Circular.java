package doubly_linked_list;

public class Doubly_Circular {
	private D_Node head;

	public Doubly_Circular() {
		head = null;
	}

	public D_Node getHead() {
		return head;
	}

	public void setHead(D_Node head) {
		this.head = head;
	}

	public void insertFirst(int data) {
		D_Node newNode = new D_Node(data);

		if (head == null) {
			head = newNode;
			head.setNext(newNode);
			head.setPrev(newNode);
			return;
		}

		D_Node last = head.getPrev();

		newNode.setNext(head);
		newNode.setPrev(last);

		last.setNext(newNode);
		head.setPrev(newNode);

		head = newNode;
	}

	public void insertLast(int data) {
		D_Node newNode = new D_Node(data);

		if (head == null) {
			head = newNode;
			head.setNext(newNode);
			head.setPrev(newNode);
			return;
		}
		newNode.setNext(head);
		newNode.setPrev(head.getPrev());
		head.getPrev().setNext(newNode);
		head.setPrev(newNode);
		return;
	}

	public int deleteFirst() {
		if (head == null)
			return -1;
		int d;
		if (head.getNext() == head) {
			d = head.getData();
			head.setNext(null);
			head.setPrev(null);
			head = null;
			return d;
		}
		D_Node deletable;
		deletable = head;
		head = head.getNext();
		deletable.getPrev().setNext(head);
		head.setPrev(deletable.getPrev());
		d = deletable.getData();
		deletable.setNext(null);
		deletable.setPrev(null);
		deletable = null;
		return d;
	}

	public int deleteLast() {
		if (head == null)
			return -1;
		int d;
		if (head.getNext() == head) {
			d = head.getData();
			head.setNext(null);
			head.setPrev(null);
			head = null;
			return d;
		}
		D_Node deletable = head.getPrev();
		head.setPrev(deletable.getPrev());
		deletable.getPrev().setNext(head);
		d = deletable.getData();
		deletable.setNext(null);
		deletable.setPrev(null);
		deletable = null;
		return d;
	}

	public void display() {
		if (head == null) {
			System.out.println(" List Is Empty !!!");
			return;
		}
		if (head.getNext() == head) {
			System.out.println("Data : " + head.getData());
			return;
		}
		D_Node temp = head;
		System.out.print("Data : ");
		do {
			System.out.print(temp.getData());
			temp = temp.getNext();
			if (temp != head) {
				System.out.print(" -> ");
			}
		} while (temp != head);
		System.out.println();
		return;
	}
}
