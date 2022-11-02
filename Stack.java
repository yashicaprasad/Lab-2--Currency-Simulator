
public class Stack extends SinglyLinkedList {
	// Utility function to add an element x in the stack
	public void push(Currency x) // insert at the beginning
	{
		// create new node temp and allocate memory
		//LinkNode temp = new LinkNode(x);
		
		this.addCurrency(1, x);

	}

	// Utility function to check if the stack is empty or
	// not
	public boolean isEmpty() {
	//	return top == null;
	}

	// Utility function to return top element in a stack
	public int peek() {
		// check for empty stack
		if (!isEmpty()) {
			return top.data;
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	// Utility function to pop top element from the stack
	public void pop() // remove at the beginning
	{
		// check for stack underflow
		if (top == null) {
			System.out.print("\nStack Underflow");
			return;
		}

		// update the top pointer to point to the next node
		top = (top).link;
	}

	public void display() {
		// check for stack underflow
		if (top == null) {
			System.out.printf("\nStack Underflow");
			exit(1);
		} else {
			Node temp = top;
			while (temp != null) {

				// print node data
				System.out.print(temp.data);

				// assign temp link to temp
				temp = temp.link;
				if (temp != null)
					System.out.print(" -> ");
			}
		}
	}
}
