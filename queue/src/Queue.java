public class Queue {

    Node head;
    Node tail;
    Integer size;

	public Queue() {
		
        this.head = null;
        this.tail = null;
        this.size = 0;

	}

    public void enqueue(int val) {

        if (this.head == null) {
            this.head = new Node(val);
            this.tail = this.head;
        } else {
            Node newNode = new Node(val);
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.size += 1;

    }

    public int dequeue() {

        if (this.head == null) {

            throw new EmptyQueueException("Cannot dequeue an empty queue.");

        } else if (this.head == this.tail) {

            int returnVal = this.head.val;
            this.head = null;
            this.tail = null;
            this.size = 0;
            return returnVal;

        } else {

            int returnVal = this.head.val;
            this.head = this.head.next;
            this.size -= 1;
            return returnVal;

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
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.size);     // 3
        System.out.println(q.peek());       // 1
        System.out.println(q.dequeue());    // 1
        System.out.println(q.peek());   // 2
        System.out.println(q.size);     // 2
        q.dequeue();    // bye 2
        q.dequeue();    // bye 3
        System.out.println(q.peek());   // null
        System.out.println(q.size);     // 0
        q.dequeue();    // error

	}

}
