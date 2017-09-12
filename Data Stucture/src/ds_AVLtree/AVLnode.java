package ds_AVLtree;

public class AVLnode {
	int data;
	AVLnode left;
	AVLnode right;
	int height;
	public AVLnode(int data) {
		this.data = data;
		left=null;
		right=null;
	}
}

class AVLtree{
	AVLnode root=null;
	
	public int Height(AVLnode root) {
		if(root==null)	return 0;
		else return root.height;
	}
	
	
	public AVLnode insert(AVLnode root,int data) {
		if(root==null) {
			root = new AVLnode(data);
			root.height=0;
		}
		else if(data<root.data) {
			root.left=insert(root.left, data);
			if(Height(root.left)-Height(root.right) ==2) {
				if(data<root.left.data)
					root=SingleRotateLeft(root);
				else
					root=DoubleRotateLeft(root);
			}
		}else if(data>root.data) {
			root.right=insert(root.right, data);
			
			if(Height(root.right)-Height(root.left) ==2) {
				System.out.println("wow");
				if(data>root.right.data)
					root=SingleRotateRight(root);
				else
					root=DoubleRotateRight(root);
			}
		}
		root.height=Math.max(Height(root.left), Height(root.right))+1;
		return root;
		
	}
	
	public AVLnode delete(AVLnode root,int data) {
		if(root!=null) {
			if(data<root.data)
				root.left=delete(root.left,data);
			else if(data>root.data)
				root.right=delete(root.right,data);
			else {
				if(root.left!=null && root.right!=null) {
					root.data=findmax(root.left).data;
					root.left= delete(root.left,root.data);
				}else if(root.left!=null)
					 root=root.left;
				else if(root.right!=null) {
					root=root.right;
				}else
					return null;
			}
		}
		root.height=Math.max(Height(root.left),Height(root.right))+1;
		if(Height(root.left)-Height(root.right) ==2) {
			if(data<root.left.data)
				root=SingleRotateLeft(root);
			else
				root=DoubleRotateLeft(root);
		}
		return root;
	}


	private AVLnode findmax(AVLnode left) {
		while(root.right!=null) {
			root=root.right;
		}
		return root;
	}


	private AVLnode DoubleRotateLeft(AVLnode root) {
		root.left=SingleRotateRight(root.left);
		return SingleRotateLeft(root);
	}

	private AVLnode DoubleRotateRight(AVLnode root) {
		root.right=SingleRotateLeft(root.right);
		return SingleRotateRight(root);
	}

	private AVLnode SingleRotateLeft(AVLnode X) {
		AVLnode W = X.left;
		X.left=W.right;
		W.right=X;
		X.height=Math.max(Height(X.left), Height(X.right)+1);
		W.height=Math.max(Height(W.left), Height(W.right)+1);
		return W;
	}
	
	private AVLnode SingleRotateRight(AVLnode X) {
		AVLnode W = X.right;
		X.right=W.left;
		W.left=X;
		X.height=Math.max(Height(X.left), Height(X.right)+1);
		W.height=Math.max(Height(W.left), Height(W.right)+1);
		return W;
	}
	
	public void traverseInOrder(AVLnode root) {
		if(root!=null) {
		traverseInOrder(root.left);
		System.out.println(root.data);
		traverseInOrder(root.right);
		}
	}


	public void traversePreOrder(AVLnode root) {
		if(root!=null) {
			System.out.println(root.data);
			traversePreOrder(root.left);
			
			traversePreOrder(root.right);
			}
	
	}
	
	public AVLnode findvalue(AVLnode root,int data) {
		if(root!=null) {
			if(root.data>data)
				root=findvalue(root.left,data);
			else if(root.data<data) 
				root = findvalue(root.right, data);
			return root;		
		}
		return null;
	}
	
}
