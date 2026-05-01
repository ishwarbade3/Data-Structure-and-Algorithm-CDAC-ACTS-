package doubly_linked_list;

public class Doubly_Cir_Main {
	public static void main(String[] args) {
		Doubly_Circular ll = new Doubly_Circular();
		ll.display();
		ll.insertFirst(10);
		ll.insertFirst(20);
		ll.display();
		ll.insertLast(30);
		ll.insertLast(40);
		ll.display();
		ll.deleteFirst();
		ll.display();
		ll.deleteLast();
		ll.display();
		ll.deleteLast();
		ll.display();
		ll.deleteFirst();
		ll.display();
		
	}

}
