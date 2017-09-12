package ds_binarytree;

public class App {

	public static void main(String[] args){
		
		BinaryTree tree = new BinaryTree();
		
		tree.insert(2);
		tree.insert(1);
		tree.insert(3);
		tree.insert(4);
		tree.insert(5);
		tree.insert(100);
		tree.insert(8);
		tree.deleteNode(100);
		tree.insert(7);
		
		//tree.traverseInOrder(tree.root);
		//tree.traversePreOrder();
		//tree.traversePostOrder();
		
		System.out.println(tree.size(tree.root));
		System.out.println(tree.findmax(tree.root));
		System.out.println(tree.size(tree.root));
		System.out.println(tree.treeheight(tree.root));
		System.out.println(tree.finddeep(tree.root).data);
	}

}
