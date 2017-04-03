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


	public static void main(String[] args) {

		Stack s = new Stack();
		s.push(1);
		System.out.println(s.head.val);
		s.push(2);
		System.out.println(s.head.val);
		System.out.println(s.head.next.val);
	
	}

}
