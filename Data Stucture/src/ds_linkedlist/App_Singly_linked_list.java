package ds_linkedlist;

public class App_Singly_linked_list {

	public static void main(String[] args) {
		Singly_Linked_list newlist = new Singly_Linked_list();
		newlist.insertAtFirst(3);
		newlist.insertAtlast(4);
		newlist.insertAtFirst(5);
		newlist.view_list();
		System.out.println(newlist.removeAtlast());
		System.out.println(newlist.removeAtfirst());
		System.out.println(newlist.removeAtlast());
		System.out.println(newlist.removeAtlast());
		newlist.view_list();

	}

}
