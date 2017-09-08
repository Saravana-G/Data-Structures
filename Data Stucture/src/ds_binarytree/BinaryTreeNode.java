package ds_binarytree;

import java.util.*;

import ds_queue.Queue;

public class BinaryTreeNode {
	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;
	public BinaryTreeNode(int data) {
		this.data=data;
		left=null;
		right=null;
	}
}


class BinaryTree{
	
	BinaryTreeNode root;
	public void insert(int data) {
		if(root==null) {
			root = new BinaryTreeNode(data);
			return;
		}
		insert(root,data);
	}
	public void insert(BinaryTreeNode root,int data) {
	 
			if(root.data>=data) {
				if(root.left==null) {
					root.left = new BinaryTreeNode(data);
		
				}else
					insert(root.left,data);
			}else {
				if(root.right==null) {
					root.right = new BinaryTreeNode(data);
					
				}else
					insert(root.right,data);
			}
			
		}
			
	public void traverseInOrder() {
		traverseInOrder(root);
	}
	public void traverseInOrder(BinaryTreeNode root) {
		if(root!=null) {
			System.out.println(root.data);
			traverseInOrder(root.left);
			traverseInOrder(root.right);
			
		}
	}
	public void traversePreOrder() {
		traversePreOrder(root);
	}
	public void traversePreOrder(BinaryTreeNode root) {
		if(root!=null) {
			traversePreOrder(root.left);
			System.out.println(root.data);
			traversePreOrder(root.right);
			
		}
	}
	public void traversePostOrder() {
		traversePostOrder(root);
	}
	public void traversePostOrder(BinaryTreeNode root) {
		if(root!=null) {
			traversePostOrder(root.left);
			traversePostOrder(root.right);
			System.out.println(root.data);
			
			
		}
	}
	
	public int findmax(BinaryTreeNode root) {
		int Max_value=Integer.MIN_VALUE;
		if(root!=null) {
			int leftmax = findmax(root.left);
			int  rightmax = findmax(root.right);
			if(leftmax>rightmax) {
				Max_value=leftmax;
			}else {
				Max_value=rightmax;
			}
			if(root.data>Max_value)
				Max_value=root.data;
		}
		return Max_value;
	}
	
	public int size(BinaryTreeNode root) {
		int leftCount = root.left==null ? 0 : size(root.left);
		int rightCount = root.right==null ? 0 : size(root.right);
		return 1+leftCount+rightCount;
	}
	
	public int treeheight(BinaryTreeNode root) {
		if(root==null) 
			return 0;
			int leftCount = root.left==null ? 0 : size(root.left);
			int rightCount = root.right==null ? 0 : size(root.right);
			return leftCount>rightCount?leftCount+1 : rightCount+1;
		
	}
	
	public BinaryTreeNode finddeep(BinaryTreeNode root) {
		BinaryTreeNode tmp =null;
		if(root ==null)
			return null;
		java.util.Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		while(!q.isEmpty()) {
			tmp =q.poll();
			if(tmp.left!=null)
				q.offer(tmp.left);
			if(tmp.right!=null)
				q.offer(tmp.right);
		}
		return tmp;
	}
	
	public void deleteNode(int value) {
		BinaryTreeNode deletenode=findvalue(root,value);
		BinaryTreeNode deepnode=finddeep(root);
		deletenode.data=deepnode.data;
		deepnode=null;
	}
	private BinaryTreeNode findvalue(BinaryTreeNode root,int value) {
		if(root !=null) {
			if(root.data==value)
				 return root;
			else {
				BinaryTreeNode node=findvalue(root.left,value);
				if(node==null)
					node=findvalue(root.right,value);
				return node;
			}
		}
		else
			return null;


			
			
	
	}
}
