package ds_linkedlist;

public class App_Circular_linked_list {

	public static void main(String[] args) {
		Circular_Linked_list newlist=new Circular_Linked_list();
		newlist.insertAtLast(2);
		newlist.insertAtLast(3);
		newlist.insertAtFirst(1);
		newlist.view_list();
		newlist.removeAtFirst();
		newlist.removeAtFirst();
		newlist.removeAtFirst();
		
		newlist.view_list();
	}

}
