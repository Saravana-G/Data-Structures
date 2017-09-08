package ds_queue;

public class App {

	public static void main(String[] args) {
		Queue myQueue = new Queue(5);
		myQueue.insert(1);
		myQueue.insert(2);
		myQueue.insert(3);
		myQueue.insert(4);
		myQueue.insert(5);
		System.out.println(myQueue.remove());
		System.out.println(myQueue.remove());
		myQueue.insert(6);
		myQueue.insert(7);
		myQueue.insert(8);
		myQueue.view();
		System.out.println(myQueue.remove());
	}

}
