package binary_tree;

public class BinaryTree_Main {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.setRoot(bt.createNode(50));
		bt.getRoot().setLeft(bt.createNode(17));
		bt.getRoot().getLeft().setLeft(bt.createNode(12));
		bt.getRoot().getLeft().setRight(bt.createNode(23));
		bt.getRoot().getLeft().getLeft().setRight(bt.createNode(14));
		bt.getRoot().getLeft().getLeft().setLeft(bt.createNode(9));
		bt.getRoot().getLeft().getRight().setLeft(bt.createNode(19));
		
		bt.getRoot().setRight(bt.createNode(72));
		bt.getRoot().getRight().setLeft(bt.createNode(54));
		bt.getRoot().getRight().setRight(bt.createNode(76));
		bt.getRoot().getRight().getLeft().setRight(bt.createNode(67));
		bt.preOrder();
		//System.out.println(bt);
		bt.inOrder();
		bt.postOrder();
		bt.displayLevelWise();
		bt.printLeafNode();
		bt.printNonLeafNode();
		System.out.println("\nSum of Leaf  Node  : "+bt.leafNodeSum());
		System.out.println("Sum of NOn-Leaf Node : "+bt.nonLeafNodeSum());
		System.out.println("No of Nodes in Tree  : "+bt.nodeCount());
		
		BinaryTree b1 =new BinaryTree();
		BinaryTree b2 =new BinaryTree();
		
		for(int i = 1 ; i < 9 ;i++) {
			b1.insertLevelwise(i*10);
		}
		for(int i = 1 ; i < 9 ;i++) {
			b2.insertLevelwise(i*10);
		}
		
		b1.displayLevelWise();
		b2.displayLevelWise();
		//System.out.println(b1.compareTree(b2));
		if(b1.compareTree(b2)) {
			System.out.println("\nBoth Trees Are Same");
		}
		else {
			System.out.println("Both Trees Are Not Same");
		}
	}

}
