import java.util.EmptyStackException;

public class Stack {

	Node head;

	
	public Stack() {

		this.head = null;

	}

	
	public void push(int number){
		
		if (this.head == null) {
			this.head = new Node(number);
		
		} else {
			Node newNode = new Node(number);
			newNode.next = this.head;
			this.head = newNode;
		}
	}
	
	
	public int pop() {

		if (this.head != null) {
			Node tmp = this.head;
			this.head = this.head.next;
			return tmp.val;
		
		} else {
			throw new EmptyStackException();
		}
	}
	

	public Integer peek() {

		if (this.head != null) {
			return this.head.val;
		} else {
			return null;
		}
	}

	public static void main(String[] args) {

		// example usage:
		Stack s = new Stack();
		s.push(1);
		System.out.println(s.head.val);		// 1
		s.push(2);
		System.out.println(s.head.val);		// 2
		System.out.println(s.head.next.val);	// 1
		System.out.println(s.peek());	// 2
		s.pop();
		s.pop();
		System.out.println(s.peek());	// null
	
	}

}
