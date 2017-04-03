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


	public static void main(String[] args) {

		Stack s = new Stack();
		s.push(1);
		System.out.println(s.head.val);
		s.push(2);
		System.out.println(s.head.val);
		System.out.println(s.head.next.val);
	
	}

}
