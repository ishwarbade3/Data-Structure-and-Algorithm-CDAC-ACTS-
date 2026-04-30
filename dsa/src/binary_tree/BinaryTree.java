package binary_tree;

public class BinaryTree {
	private BTNode root;

	public BinaryTree() {
		root = null;
	}

	public BTNode getRoot() {
		return root;
	}

	public void setRoot(BTNode root) {
		this.root = root;
	}

	@Override
	public String toString() {
		return "BinaryTree [root=" + root + "]";
	}

	public BTNode createNode(int data) {
		BTNode newNode = new BTNode(data);
		return newNode;
	}

	private void visitPreOrder(BTNode root) {
		if (root == null) {
			// System.out.println("Binary Tree Is Empty!!!");
			return;
		}
		System.out.print(root.getData() + "  ");
		visitPreOrder(root.getLeft());
		visitPreOrder(root.getRight());
	}

	private void visitInOrder(BTNode root) {
		if (root == null)
			return;
		visitInOrder(root.getLeft());
		System.out.print(root.getData() + "  ");
		visitInOrder(root.getRight());
	}

	private void visitPostOrder(BTNode root) {
		if (root == null)
			return;
		visitPostOrder(root.getLeft());
		visitPostOrder(root.getRight());
		System.out.print(root.getData() + "  ");
	}

	public void preOrder() {
		System.out.print("\nPre Order TraverSal : ");
		visitPreOrder(root);
	}

	public void inOrder() {
		System.out.print("\nIn Order Traversal  : ");
		visitInOrder(root);
	}

	public void postOrder() {
		System.out.print("\nPost Order Traversal : ");
		visitPostOrder(root);
	}

	public void displayLevelWise() {
		if (root == null) {
			System.out.println("Binary Tree Is Empty !!!");
			return;
		}
		BT_Queue q = new BT_Queue();
		BTNode iter;
		q.enqueue(root);
		System.out.print("\nLevwl Wise Traversal : ");
		while (!q.isEmpty()) {
			iter = q.dequeue();
			System.out.print(iter.getData() + " ");
			if (iter.getLeft() != null) {
				q.enqueue(iter.getLeft());
			}
			if (iter.getRight() != null) {
				q.enqueue(iter.getRight());
			}
		}
	}

	public void printLeafNode() {
		if (root == null) {
			System.out.println("Binary Tree Is Empty !!!");
			return;
		}
		BT_Queue q = new BT_Queue();
		BTNode iter;
		q.enqueue(root);
		System.out.print("\nLeaf Nodes are : ");
		while (!q.isEmpty()) {
			iter = q.dequeue();
			if (iter.getLeft() == null && iter.getRight() == null) {
				System.out.print(iter.getData() + "  ");
			}
			if (iter.getLeft() != null) {
				q.enqueue(iter.getLeft());
			}
			if (iter.getRight() != null) {
				q.enqueue(iter.getRight());
			}
		}
	}

	public void printNonLeafNode() {
		if (root == null) {
			System.out.println("Binary Tree Is Empty !!!");
			return;
		}
		BT_Queue q = new BT_Queue();
		BTNode iter;
		q.enqueue(root);
		System.out.print("\nNon-Leaf Nodes are : ");
		while (!q.isEmpty()) {
			iter = q.dequeue();
			if (iter.getLeft() != null || iter.getRight() != null) {
				System.out.print(iter.getData() + "  ");
			}
			if (iter.getLeft() != null) {
				q.enqueue(iter.getLeft());
			}
			if (iter.getRight() != null) {
				q.enqueue(iter.getRight());
			}
		}
	}

	public int nonLeafNodeSum() {
		if (root == null) {
			System.out.println("Binary Tree Is Empty !!!");
			return -1;
		}
		BT_Queue q = new BT_Queue();
		BTNode iter;
		q.enqueue(root);
		int sum = 0;
		while (!q.isEmpty()) {
			iter = q.dequeue();
			if (iter.getLeft() != null || iter.getRight() != null) {
				sum += iter.getData();
			}
			if (iter.getLeft() != null) {
				q.enqueue(iter.getLeft());
			}
			if (iter.getRight() != null) {
				q.enqueue(iter.getRight());
			}
		}
		return sum;
	}

	public int leafNodeSum() {
		if (root == null) {
			System.out.println("Binary Tree Is Empty !!!");
			return -1;
		}
		BT_Queue q = new BT_Queue();
		BTNode iter;
		q.enqueue(root);
		int sum = 0;
		while (!q.isEmpty()) {
			iter = q.dequeue();
			if (iter.getLeft() == null && iter.getRight() == null) {
				sum += iter.getData();
			}
			if (iter.getLeft() != null) {
				q.enqueue(iter.getLeft());
			}
			if (iter.getRight() != null) {
				q.enqueue(iter.getRight());
			}
		}
		return sum;
	}

	public int nodeCount() {
		if (root == null) {
			System.out.println("Binary Tree Is Empty !!!");
			return -1;
		}
		BT_Queue q = new BT_Queue();
		BTNode iter;
		q.enqueue(root);
		int count = 0;
		while (!q.isEmpty()) {
			iter = q.dequeue();
			count++;
			if (iter.getLeft() != null) {
				q.enqueue(iter.getLeft());
			}
			if (iter.getRight() != null) {
				q.enqueue(iter.getRight());
			}
		}
		return count;
	}

	public void insertLevelwise(int data) {
		BTNode newNode = new BTNode(data);
		if (root == null) {
			root = newNode;
			return;
		}
		BTNode iter;
		BT_Queue q = new BT_Queue();
		q.enqueue(root);
		while (!q.isEmpty()) {
			iter = q.dequeue();
			if (iter.getLeft() == null) {
				iter.setLeft(newNode);
				return;
			} else {
				q.enqueue(iter.getLeft());
			}
			if (iter.getRight() == null) {
				iter.setRight(newNode);
				return;
			} else {
				q.enqueue(iter.getRight());
			}
		}
	}
	public boolean compareTree(BinaryTree r) {
		if(this.root == null || r.getRoot()==null) {
			return false;
		}
		BT_Queue q1 =new BT_Queue();
		BT_Queue q2 =new BT_Queue();
		BTNode iter1,iter2;
		q1.enqueue(root);
		q1.enqueue(r.getRoot());
		while(!q1.isEmpty() && !q2.isEmpty()) {
			iter1 =q1.dequeue();
			iter2 =q2.dequeue();
		}
	}
}
