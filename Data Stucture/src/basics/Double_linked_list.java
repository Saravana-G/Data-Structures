package basics;

import java.awt.HeadlessException;

public class Double_linked_list {

	public static void main(String[] args) {
		Double_list o = new Double_list();
		o.insert(2);
		o.display();

	}

}

class Double_node{
	int data;
	Double_node prev;
	Double_node next;
	public Double_node(){
		
		this.prev=null;
		this.next=null;
	}
}

class Double_list{
	Double_node head = new Double_node(Integer.MIN_VALUE),tail = new Double_node(Integer.MIN_VALUE);
	int length;
	public Double_list() {
		head.next=tail;
		tail.prev=head;
		length=0;
		
	}
	private boolean isEmpty() {
		return (head.next==tail)
	}
	public void insertAtFirst(int value) {
			Double_node newnode = new Double_node();
			newnode.data=value;
			if(isEmpty()) {
				tail.prev=newnode;
			}
			newnode.next=head;
			head=newnode;
			
	}
	
	
	public void insertAtLast(int value) {
		Double_node newnode = new Double_node();
		newnode.data = value;
		if(isEmpty()) {
			
		}
		newnode.next=tail;
		tail=newnode;
		newnode.prev=tail.prev;
		tail.prev=newnode;
		newnode.prev.next=newnode;
		
			
	}
	public synchronized void display() {
		Double_node q;
		if(length==0)
			System.out.println("List is empty");
		else
			for(q=head.next;q.next.next!=tail;q=q.next)	
				System.out.println("Value" + q.data);
	}
}
