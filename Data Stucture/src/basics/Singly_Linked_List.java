package basics;

public class Singly_Linked_List {

	public static void main(String[] args) {
		Linkedlist o1= new Linkedlist();
		o1.insert(new Listnode(1));
		o1.insert(new Listnode(2));
		o1.insert(new Listnode(3));
		o1.insert(new Listnode(4));
		o1.insert(new Listnode(5));
		o1.insert_position(new Listnode(10), 2);
		o1.display();

	}
}
class Listnode{
	 int data;
	 Listnode next;
	public Listnode(int data) {
		this.data=data;
	}
}
 class Linkedlist{
	Listnode head;
	public synchronized void insert(Listnode node) {
		if(head==null)
			head=node;
		else {
			Listnode p,q;
			for(p=head;p.next!= null;p=p.next);
			p.next=node;
		}
	}
	public synchronized void insert_position(Listnode node,int position) {
		if(head==null)
			head=node;
		else {
			Listnode p,q = null;
			int i;
			for(p=head,i=1;p.next!= null &&i<position-1 ;p=p.next,i++);
			q=p.next;
			p.next=node;
			node.next=q;
		}
	}
	public synchronized void display() {
		Listnode p;
		for(p=head;p.next!= null;p=p.next) {
			System.out.println("Value : "+p.data);
		}
		System.out.println("Value : "+p.data);
	}
}

