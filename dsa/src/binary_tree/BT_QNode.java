package binary_tree;

public class BT_QNode {
	private BTNode data;
	private BT_QNode next;

	public BT_QNode() {
		data = null;
		next = null;
	}
	public BT_QNode(BTNode data) {
		this.data = data;
		next = null;
	}

	public BTNode getData() {
		return data;
	}

	public void setData(BTNode data) {
		this.data = data;
	}

	public BT_QNode getNext() {
		return next;
	}

	public void setNext(BT_QNode next) {
		this.next = next;
	}
}
