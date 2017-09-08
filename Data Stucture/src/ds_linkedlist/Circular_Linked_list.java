package ds_linkedlist;

class Node_Circular{
	int data;
	Node_Circular next=null;
	Node_Circular last=null;
}
public class Circular_Linked_list {
	Node_Circular head,tail;
	public Circular_Linked_list() {
		head=null;
		tail=null;
	}
	boolean isEmpty() {
		return head==null;
	}
	
	void insertAtFirst(int data) {
		Node_Circular newnode = new Node_Circular();
		newnode.data = data;
		if(isEmpty()) {
			tail=newnode;
		}
		newnode.next = head;
		head=newnode;
	}
	void insertAtLast(int data){
		Node_Circular newnode = new Node_Circular();
		newnode.data = data;
		if(isEmpty()) {
			head=newnode;
			tail=newnode;
		}else {
		tail.next=newnode;
		tail=newnode;
		}
		
	}
	
	void removeAtFirst() {
		Node_Circular temp=head;
		head=head.next;
		if(head==null) {
			tail=null;
			
		}
		System.out.println(temp.data);
	}
	
	void removeAtLast() {
		Node_Circular temp=tail;
		
	}
	void view_list() {
		Node_Circular current;
		for(current = head;current!=null;current=current.next)
			System.out.println(current.data);
	}
}
