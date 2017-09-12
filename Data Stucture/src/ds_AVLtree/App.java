package ds_AVLtree;

public class App {

	public static void main(String[] args){
		
		AVLtree tree =new AVLtree();
		AVLnode root=null;
		root=tree.insert(root,2);
		root=tree.insert(root,1);
		root=tree.insert(root,3);
		root=tree.insert(root,4);
		root=tree.insert(root,10);
		tree.traversePreOrder(root);
		root=tree.insert(root,8);
		
		root=tree.insert(root,7);
		//tree.delete(root, 4);
		//tree.traverseInOrder(root);
		//System.out.println(tree.Height(root));
		tree.traversePreOrder(root);
		//tree.traversePostOrder();
		
		//System.out.println("value"+tree.findvalue(root, 4).data);
		
		
	}

}
