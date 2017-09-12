package ds_binarysearchtree;



public class BSTNode {
	int data;
	BSTNode left;
	BSTNode right;
	public BSTNode(int data) {
		this.data = data;
		left=null;
		right =null;
	}
	
}

class BST{
	public BSTNode insert(BSTNode root, int data) {
		if(root==null)
			root = new BSTNode(data);
		else if(data<root.data) {
			root.left=insert(root.left,data);
		}else if(data>root.data)
			root.right=insert(root.right,data);
		return root;
	}
	
	public void traverseInOrder(BSTNode root) {
		if(root!=null) {
			traverseInOrder(root.left);
			System.out.println(root.data);
			traverseInOrder(root.right);		
		}
	}
	
	public BSTNode minValue(BSTNode root) {
		while(root.left!=null) {
			root=root.left;
		}
		return root;
	}
	public BSTNode maxValue(BSTNode root) {
		while(root.right!=null) {
			root=root.right;
		}
		return root;
	}
	public BSTNode find(BSTNode root,int data) {
		if(root!=null) {
			if(root.data == data) {
				return root;
			}else if(data<root.data)
				return find(root.left,data);
			else
				return find(root.right,data);
		}
		return null;
	}
	
	public BSTNode delete(BSTNode root,int data) {
		if(root!=null) {
			if(data<root.data) 
				root.left=delete(root.left,data);
			else if(data>root.data)
				root.right = delete(root.right, data);
			else {
				if(root.left!=null && root.right!=null) {
					root.data=maxValue(root.left).data;
					return delete(root.left,root.data);
				}
				else if(root.left ==null) 
					return root.right;	
				 else if(root.right ==null) {
					return root.left;
				}else
					return null;
			}
		}
		return root;
	}
	
}
