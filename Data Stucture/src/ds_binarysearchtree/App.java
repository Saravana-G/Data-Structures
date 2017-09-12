package ds_binarysearchtree;

public class App {

	public static void main(String[] args){
		
		BST tree =new BST();
		BSTNode root=null;
		root=tree.insert(root,2);
		root=tree.insert(root,1);
		root=tree.insert(root,3);
		root=tree.insert(root,4);
		root=tree.insert(root,10);
		root=tree.insert(root,8);
		root=tree.insert(root,7);
		
		
		System.out.println(tree.minValue(root).data);
		System.out.println(tree.maxValue(root).data);
		System.out.println(tree.find(root, 7).data);
		
		tree.delete(root, 4);
		tree.traverseInOrder(root);
		
		//tree.traversePreOrder();
		//tree.traversePostOrder();
		
		
	}

}
