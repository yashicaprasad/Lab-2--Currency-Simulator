/*
Lab 3
Yashica Prasad and Lois Wong
Purpose of the assignment: Demonstrate use of stacks, queues, and linked lists
 */

public class Stack extends SinglyLinkedList {
	/*
	push purpose: adds Currency object to top of stack
	pre: Currency object
	post: added Currency object to top of stack
	return: N/A
	
	pseudocode 
	
	this.addCurrency(0, x);
	
	*/
	
	
	public void push(Currency x) // insert at the beginning
	{
		// create new node temp and allocate memory
		//LinkNode temp = new LinkNode(x);
		
		this.addCurrency(0, x);

	}
	
	/*
	printStack purpose: returns a string signifying contents of the stack from top to bottom
	pre: N/A
	post: N/A
	return: a string signifying contents of the stack from top to bottom
	
	pseudocode
	
	String stackItems = "";
		if (this.getStart() == null) 
			return null;
		else 
			LinkNode currentNode = this.getStart();
			while (currentNode != null) 
				stackItems = stackItems.concat(currentNode.getData().print() + "\t");
				currentNode = currentNode.getNext();
		return stackItems;
	*/
	
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


	/*
	isEmpty purpose: check if stack is empty or not
	pre: N/A
	post: N/A
	return: boolean indicating whether stack is empty or not
	
	pseudocode
	
	if(this.countCurrency()==0) 
			return true;
	else 
		return false;

	*/
	
	public boolean isEmpty() {
		if(this.countCurrency()==0) {
			return true;
		}
		else {
			return false;
		}
	}

	/*
	peek purpose: returns copy of Currency object at top of stack
	pre: N/A
	post: N/A
	return: copy of Currency object at top of stack
	
	pseudocode
	
	if (!isEmpty()) 
			return this.getStart().getData();
		else 
			System.out.println("Stack is empty");
			return null;
	*/
	
	public Currency peek() {
		// check for empty stack
		if (!isEmpty()) {
			return this.getStart().getData();
		} else {
			System.out.println("Stack is empty");
			return null;
		}
	}
	
	/*
	pop purpose: removes and returns Currency object from top of the stack
	pre: N/A
	post: removes Currency object at top of the stack
	return: Currency object at top of the stack
	
	pseudocode 
	
	if (this.getStart() == null) {
			System.out.print("\nStack Underflow");
			return;
		this.removeCurrency(0);
	*/ 
	
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
	
	/*
	display purpose: check for stack underflow
	pre: N/A
	post: N/A
	return: N/A
	
	pseudocode
	
	if (this.getStart() == null) 
			System.out.printf("\nStack Underflow");
			return;
		else 
			this.printList();
	*/ 

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
