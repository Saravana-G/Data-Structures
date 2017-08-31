package ds_stack;

public class Stack {
	int max_size;
	long [] stack;
	int top;
	Stack(int max_size){
		this.max_size = max_size;
		stack = new long[max_size];
		top=-1;
	}
	
	public void push(long value) {
		if(!isFull()) {
			stack[++top] = value;
		}else 
			System.out.println("Stack full");
	}
	
	public boolean isFull() {
		return (max_size-1 == top);
			
	}

	public long pull() {
		if(!isEmpty()) {
			return stack[top--];
		}else 
			System.out.println("Stack empty");
		return -1;
	}
	public boolean isEmpty() {
		return (top == -1);
	}

	public long peek() {
		if(!isEmpty()) 
			return stack[top];
		return 0;
	}
}
