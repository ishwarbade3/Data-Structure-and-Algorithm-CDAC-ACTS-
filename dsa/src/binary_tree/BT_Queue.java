package binary_tree;

public class BT_Queue {
	private BT_QNode front, rear;

	public BT_Queue() {
		front = rear = null;
	}

	public void enqueue(BTNode data) {
		BT_QNode newNode = new BT_QNode(data);
		if (front == null && rear == null) {
			front = rear = newNode;
			return;
		}
		rear.setNext(newNode);
		rear = newNode;
		return;
	}

	public BTNode dequeue() {
		if (front == null && rear == null) {
			return null;
		}
		BTNode d;
		if (front == rear) {
			d = front.getData();
			rear = front = null;
			return d;
		}
		BT_QNode deletable  =front;
		d = front.getData();
		front = front.getNext();
		deletable .setNext(null);
		deletable = null;
		return d;
	}

	public BTNode peek() {
		if (front == null) {
			return null;
		}
		return front.getData();
	}

	public boolean isEmpty() {
		return rear == null && front == null;
	}

}
