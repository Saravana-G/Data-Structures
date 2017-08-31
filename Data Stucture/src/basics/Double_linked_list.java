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
	public Double_node(int data){
		data=this.data;
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
	public synchronized void insert(int value) {
			Double_node p = new Double_node(value);
			for()
			p.next=head.next;
			head.next=p;
			p.prev=head;
			p.next.prev=p;	
			length++;
	}
	public synchronized void insert(int value,int position) {
		Double_node p = new Double_node(value),q;
		if(position<0)
			position=0;
		else
		if(position>length) 
			position=length;
		else {
			for(q=head;position!=0;q=q.next,position--);
			p.next=q.next;
			q.next=p;
			p.prev=q;
			p.next.prev=p;	
			length++;	
		}
		
			
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
