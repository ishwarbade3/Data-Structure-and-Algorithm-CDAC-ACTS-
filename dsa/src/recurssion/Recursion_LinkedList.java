package recurssion;

import linkedlist.Node;
import linkedlist.Remove_Cycle;
import linkedlist.Singly_LL;

public class Recursion_LinkedList extends Remove_Cycle {

	public Recursion_LinkedList(Node head) {
		super(head);
	}

	public Node reverseLL(Node head) {
		if (head == null) {
			System.out.println("Linked List Is Empty!!!!");
			return null;
		}
		if (head.getNext() == null) {
			//System.out.println("Linked List have Only One Node!!!!");
			return head;
		}
		Node temp;
		temp = reverseLL(head.getNext());
		head.getNext().setNext(head);
		head.setNext(null);
		return temp;
	}
	public void  display(Node head) {
		if(head == null) {
			return;
		}
		System.out.print(head.getData()+" -> ");
		 display(head.getNext());
	}
	

	public static void main(String[] args) {

		Recursion_LinkedList ll = new Recursion_LinkedList(null);
		ll.insertLast(10);
		ll.insertLast(20);
		ll.insertLast(30);
		ll.insertLast(40);
		ll.insertLast(50);
		ll.insertLast(60);

		ll.display();
		Node node;
		node = ll.reverseLL(ll.getHead());
//		ll.head = node;
//		ll.display();
		System.out.println();
		ll.display(node);
	}

}
