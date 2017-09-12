package ds_expressiontree;

public class App {

	public static void main(String[] args){
		char c[]= {'A','B','C','*','+','D','/'};
		ExpressionTree tree = new ExpressionTree();
		ExpressionTreeNode root=tree.insert(c);
		tree.traverseInOrder(root);
	}

}
