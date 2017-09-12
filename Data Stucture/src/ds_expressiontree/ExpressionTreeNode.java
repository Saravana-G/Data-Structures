package ds_expressiontree;

import java.util.Stack;


public class ExpressionTreeNode {
	char data;
	ExpressionTreeNode left;
	ExpressionTreeNode right;
	
	public ExpressionTreeNode(char data) {
		this.data=data;
		left = null;
		right = null;
	}
	
}

class ExpressionTree{
	public ExpressionTreeNode insert(char[] value) {
		Stack<ExpressionTreeNode> stack = new Stack<>();
		int size = value.length;
		for(int i=0;i<size;i++) {
			if(value[i] =='*' || value[i] =='/' || value[i] =='+' || value[i] =='-' || value[i] =='%'  ) {
				ExpressionTreeNode newnode= new ExpressionTreeNode(value[i]);
				newnode.right = stack.pop();
				newnode.left = stack.pop();
				stack.push(newnode);
				
				
			}else {
				ExpressionTreeNode newnode= new ExpressionTreeNode(value[i]);
				stack.push(newnode);
			}
		}
		return stack.pop();
	}
	public void traverseInOrder(ExpressionTreeNode root) {
		if(root!=null) {

			traverseInOrder(root.left);
			System.out.println(root.data);
			traverseInOrder(root.right);
			
		}
	}
}
