package queue_linkedlist;

import linkedlist.Node;

public class Queue_LL {
	protected Node front , rear;
	
	public Queue_LL() {
		front=rear=null;
	}
	public void enqueue(int data) {
		Node newNode = new Node(data);
		if(rear == null) {
			front=rear=newNode;
			return;
		}
		rear.setNext(newNode);
		rear=newNode;
	}
	public int dequeue() {
		if(front == null ) {
			return -1;
		}
		int d;
		if(front == rear) {
			d=front.getData();
			front= rear=null;
			return d;
		}
		Node deletable = front;
		front=front.getNext();
		deletable.setNext(null);
		d= deletable.getData();
		deletable= null;
		return d;
	}
	public int peek() {
		if(front == null) {
			return-1;
		}
		return front.getData();
	}
	public boolean isEmpty() {
		return front == null&&rear ==null;
	}

}
