/*
Lab 3
Yashica Prasad and Lois Wong
Purpose of the assignment: Demonstrate use of stacks, queues, and linked lists
 */

public class Lab3Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Currency Simulator by Yashica Prasad and Lois Wong: ");

		// 20 Dollar objects in a currency array
		Currency[] dollarArray = new Dollar[20];
		dollarArray = new Currency[] { new Dollar(57.12), new Dollar(23.44), new Dollar(87.43), new Dollar(68.99),
				new Dollar(111.22), new Dollar(44.55), new Dollar(77.77), new Dollar(18.36), new Dollar(543.21),
				new Dollar(20.21), new Dollar(345.67), new Dollar(36.18), new Dollar(48.48), new Dollar(101.00),
				new Dollar(11.00), new Dollar(21.00), new Dollar(51.00), new Dollar(1.00), new Dollar(251.00),
				new Dollar(151.00) };

		// SinglyLinkedList, Stack, Queue objects
		SinglyLinkedList singlyLinkedListObj = new SinglyLinkedList();
		Stack stackObj = new Stack();
		Queue queueObj = new Queue();

		// add first 7 objects of dollarArray into linked list in reverse order
		int j = 0;
		for (int i = 6; i >= 0; i--) {
			singlyLinkedListObj.addCurrency(j, dollarArray[i]);
			j += 1;
		}

		// search for $87.43

		if (singlyLinkedListObj.findCurrency(new Dollar(87.43)) != -1) {
			System.out.println("$87.43 is found at index " + singlyLinkedListObj.findCurrency(new Dollar(87.43)));
		} else {
			System.out.println("$87.43 is not found in Singlylinkedlist ");
		}

		// search for $44.56

		if (singlyLinkedListObj.findCurrency(new Dollar(44.56)) != -1) {
			System.out.println("$44.56 is found at index " + singlyLinkedListObj.findCurrency(new Dollar(44.56)));
		} else {
			System.out.println("$44.56 is not found in Singlylinkedlist ");
		}

		// remove node containing $111.22
		// traversing dollarArray to find currency = $111.22
		if (singlyLinkedListObj.removeCurrency(new Dollar(111.22))) {
			System.out.println("$111.22 is removed ");
		} else {
			System.out.println("$111.22 is not found in Singlylinkedlist ");
		}

		// remove node at index 2
		// singlyLinkedListObj.removeCurrency(2);
		if (singlyLinkedListObj.removeCurrency(2))
			System.out.println("Node at index 2 is removed");
		else
			System.out.println("Node at index 2 is not found in Singlylinkedlist");

		// print list contents
		System.out.println(singlyLinkedListObj.printList());

		// add next 4 objects (#9-12) such that their index in linked list is
		// indexInArray % 5
		for (int i = 8; i <= 11; i++) {
			int llIndex = i % 5;
			//			System.out.println("llIndex:"+llIndex);
			singlyLinkedListObj.addCurrency(llIndex, dollarArray[i]);
		}

		int removeindex = singlyLinkedListObj.countCurrency() % 6;
		if (singlyLinkedListObj.removeCurrency(removeindex))
			System.out.println("Node at index " + removeindex + " is removed");
		else
			System.out.println("Node at index " + removeindex + " is not found in Singlylinkedlist");

		removeindex = singlyLinkedListObj.countCurrency() / 7;
		if (singlyLinkedListObj.removeCurrency(removeindex))
			System.out.println("Node at index " + removeindex + " is removed");
		else
			System.out.println("Node at index " + removeindex + " is not found in Singlylinkedlist");

		System.out.println(singlyLinkedListObj.printList());

		System.out.println("**************");
		System.out.println("Pushed 7 objects with indexes after 13");
		for (int i = 13; i < 20; i += 1) {
			stackObj.push(dollarArray[i]);
		}
		
//		System.out.println(stackObj.printStack());

		System.out.println("peekFront " + stackObj.peek().print());
		
		System.out.println("Popped 3 objects");
		stackObj.pop();
		stackObj.pop();
		stackObj.pop();

		System.out.println(stackObj.printStack());
		
		System.out.println("Pushed 5 more objects with indexes from 0");
		for (int i = 0; i < 5; i += 1) {
			stackObj.push(dollarArray[i]);
		}
		System.out.println("Popped 2 objects");
		stackObj.pop();
		stackObj.pop();
		
		System.out.println(stackObj.printStack());
		
		System.out.println("**************");

		System.out.println("Enqueued 7 objects with odd indexes starting at 5");
		for (int i = 5; i < 18; i += 2) {
			queueObj.enQueue(dollarArray[i]);
		}

//		System.out.println(queueObj.printQueue());

		System.out.println("peekFront " + queueObj.peekFront().print());
		System.out.println("peekRear " + queueObj.peekRear().print());

		System.out.println("Dequeued twice");
		queueObj.dequeue();
		queueObj.dequeue();
		System.out.println(queueObj.printQueue());

		System.out.println("Enqueued 5 objects from index 10");
		for (int i = 10; i < 15; i++) {
			queueObj.enQueue(dollarArray[i]);			
		}

		System.out.println("Dequeued thrice");
		queueObj.dequeue();
		queueObj.dequeue();
		queueObj.dequeue();

		System.out.println(queueObj.printQueue());
	}

}