package ds_stack;

public class Word_reverse {
	int max_size;
	char [] stack;
	int top;
	Word_reverse(String name){
		max_size = name.length();
		stack = new char[max_size];
		top=-1;
		for(int i=0;i<max_size;i++) {
			push(name.charAt(i));
		}
		for(int i=0;i<max_size;i++) {
			System.out.println(pull());
		}
	}
	
	public void push(char value) {
		if(!isFull()) {
			stack[++top] = value;
		}else 
			System.out.println("Stack full");
	}
	
	public boolean isFull() {
		return (max_size-1 == top);
			
	}

	public char pull() {
		if(!isEmpty()) {
			return stack[top--];
		}else 
			System.out.println("Stack empty");
		return 0 ;
	}
	public boolean isEmpty() {
		return (top == -1);
	}

	
}
