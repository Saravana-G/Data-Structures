package ds_queue;

public class Queue {
	int max_size;
	long [] quearray;
	int rear = 0;
	int front =0;
	int nitems=0;
	Queue(int size){
		this.max_size= size;
		quearray = new long[max_size];
	}
	void insert(long value) {
		if(!(nitems==max_size)) {
		 
		 quearray[rear]= value;
		 rear=(rear+1)%max_size;
		 nitems++;
		}else
			System.out.println("Queue is full");
			
	}
	long remove() {
		if(nitems!=0) {
			int old_top=front;
			front = (++front) % max_size;
			nitems--;
			return quearray[old_top];
			
		}
		System.out.println("Queue is empty");
		return 0;
	}
	
	void view() {
		for(int i=0;i<max_size;i++) {
			System.out.println(quearray[i]);
		}
	}
}
