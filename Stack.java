/*
Lab 3
Yashica Prasad and Lois Wong
Purpose of the assignment: Demonstrate use of stacks, queues, and linked lists
 */

public class Stack extends SinglyLinkedList {
	// Utility function to add an element x in the stack
	public void push(Currency x) // insert at the beginning
	{
		// create new node temp and allocate memory
		//LinkNode temp = new LinkNode(x);
		
		this.addCurrency(0, x);

	}
	
	public String printStack() {
		String stackItems = "";
		if (this.getStart() == null) {
//                System.out.println("Queue is empty");
			return null;
		} else {
			LinkNode currentNode = this.getStart();
			while (currentNode != null) {
				stackItems = stackItems.concat(currentNode.getData().print() + "\t");
				currentNode = currentNode.getNext();
			}
		}
		return stackItems;
}


	// Utility function to check if the stack is empty or
	// not
	public boolean isEmpty() {
		if(this.countCurrency()==0) {
			return true;
		}
		else {
			return false;
		}
	}

	// Utility function to return top element in a stack
	public Currency peek() {
		// check for empty stack
		if (!isEmpty()) {
			return this.getStart().getData();
		} else {
			System.out.println("Stack is empty");
			return null;
		}
	}

	// Utility function to pop top element from the stack
	public void pop() // remove at the beginning
	{
		// check for stack underflow
		if (this.getStart() == null) {
			System.out.print("\nStack Underflow");
			return;
		}

		// Remove the top element from Singly LinkedList
		this.removeCurrency(0);
		// Alternate way to move the Start/Top element to next and reduce the count
//		this.setStart(this.getStart().getNext());
//		this.setCount(this.getCount()-1);
		
	}

	public void display() {
		// check for stack underflow
		if (this.getStart() == null) {
			System.out.printf("\nStack Underflow");
			return;
		} else {
			this.printList();
		}
	}
}
