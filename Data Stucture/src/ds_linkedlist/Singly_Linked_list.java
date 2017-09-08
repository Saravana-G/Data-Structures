package ds_linkedlist;

class Node{
	int data;
	Node next=null;
	
}

public class Singly_Linked_list {
	Node head=new Node();
	void insertAtFirst(int data){
		Node newnode = new Node();
		newnode.data = data;
		newnode.next=head.next;
		head.next=newnode;
	}
	void insertAtlast(int data) {
		Node newnode = new Node();
		newnode.data = data;
		Node current;
		for(current = head;current.next!=null;current=current.next);
		current.next=newnode;
	}
	int removeAtfirst() {
		if(head.next!=null) {
		Node temp = head.next;
		head.next=temp.next;
		return temp.data;
		}
		return -1;
	}
	int removeAtlast() {
		Node current,temp;
		if(head.next!=null) {
		for(current = head;current.next.next!=null;current=current.next);
		temp=current.next;
		current.next=null;
		return temp.data;
		}
		return -1;
	}
	void view_list() {
		Node current;
		for(current = head.next;current!=null;current=current.next)
			System.out.println(current.data);
	}
}
