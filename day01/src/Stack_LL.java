import linkedlist.Node;

public class Stack_LL {
	protected Node top;

	public Stack_LL() {
		top = null;
	}

	public void push(int data) {
		Node newNode = new Node(data);
		if (top == null) {
			top = newNode;
			return;
		}
		newNode.setNext(top);
		top = newNode;
	}

	public int pop() {
		if (top == null) {
			return -1;
		}
		int d;
		if (top.getNext() == null) {
			d = top.getData();
			top = null;
			return d;
		}
		Node deletable = top;
		top = top.getNext();
		deletable.setNext(null);
		d = deletable.getData();
		deletable = null;
		return d;
	}

	public int top() {
		if (top == null) {
			return -1;
		}

		return top.getData();
	}

	public boolean isEmpty() {
		return top == null;
	}

}
