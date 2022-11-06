/*
Lab 3
Yashica Prasad and Lois Wong
Purpose of the assignment: Demonstrate use of stacks, queues, and linked lists
 */

public class SinglyLinkedList {
	private LinkNode start;
	private LinkNode end;
	private int count = 0;

	public LinkNode getStart() {
		return start;
	}

	public void setStart(LinkNode start) {
		this.start = start;
		this.count++;
	}

	public LinkNode getEnd() {
		return end;
	}

	public void setEnd(LinkNode end) {
		this.end = end;
		this.count++;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public SinglyLinkedList() {

	}

	public boolean removeCurrency(int key) {
		// if the index is out of range, exit
		int size = this.countCurrency();
		if (key >= size || key < 0) {
//			System.out.println("Index out of bounds");
			return false;
		} else if (key == 0) {
			this.start = this.start.getNext();
			return true;
		}

		LinkNode crunchifyCurrent = this.start;
		if (this.start != null & key > 0) {
			for (int i = 0; i < key - 1; i++) {
				
				crunchifyCurrent = crunchifyCurrent.getNext();
			}
			if (crunchifyCurrent.getNext() == null) {
			} else {
				crunchifyCurrent.setNext(crunchifyCurrent.getNext().getNext());
				this.countCurrency();
			}			
			// decrement the number of elements variable
			this.count--;
			return true;
		}
		return false;
	}

	/*
	 * Purpose: Return the Currency object at desired index Pre: Takes an index
	 * value as input Post: N/A Returns: The currency object at the given value
	 * 
	 * pseudocode if (index < 0 || index >= count) print invalid index value and
	 * return null LinkNode currentNode = start int i = 0 while(i < index)
	 * currentNode = currentNode.getNext() i++ return currentNode.data()
	 */

	public Currency getCurrency(int index) {
		if (index < 0 || index >= this.getCount()) {
			System.out.println("Invalid index value");
			return null;
		}

		LinkNode currentNode = start;
		int i = 0;
		while (i < index) {
			currentNode = currentNode.getNext();
			i++;
		}
		return currentNode.getData();
	}

	/*
	 * Purpose: Returns the node index of the designated currency object Pre: takes
	 * in a Currency object as a parameter Post: N/A Return: The node index of the
	 * input Currency object
	 * 
	 * pseudocode: int index = 0 LinkNode currentNode = this.start; while(current !=
	 * null) if(current.data.equals(currencyObj) return index else index++
	 * currentNode = currentNode.next print "Object is not found" return -1
	 */

	public int findCurrency(Currency currencyObj) {
		int index = 0;
		LinkNode currentNode = this.start;

		while (currentNode != null) {
			if (currentNode.getData().getCurrencyFrac() == currencyObj.getCurrencyFrac()
					& currentNode.getData().getCurrencyWhole() == currencyObj.getCurrencyWhole()) {
				return index;
			} else {
				index++;
				currentNode = currentNode.getNext();
			}
		}
//        System.out.println("Object is not found");
		return -1;
	}

	/*
	 * Purpose: Get the count of Currency nodes in the list Pre: N/A Post: N/A
	 * Returns: Integer count of Currency nodes in the list
	 * 
	 * pseudocode
	 * 
	 * int i = 0; LinkNode currentNode = this.start; while(currentNode != null) i++
	 * currentNode = currentNode.next return i;
	 */

	public int countCurrency() {
		int i = 0;
		LinkNode currentNode = this.start;

		while (currentNode != null) {
			i++;
			currentNode = currentNode.getNext();
		}
		return i;
	}

	/*
	 * isListEmpty purpose: tell whether a list is empty or not pre: N/A post: N/A
	 * return: a bool indicating whether a list is empty or not
	 * 
	 * pseudocode LinkNode currentNode = this.start; if(currentNode == null) return
	 * true return false
	 */

	public boolean isListEmpty() {
		LinkNode currentNode = this.start;
		if (currentNode == null) {
			return true;
		}
		return false;
	}

	public boolean removeCurrency(Currency key) {
		// Store head node
		LinkNode currNode = this.start, prev = null;

		// CASE 1:
		// If head node itself holds the key to be deleted

		if (currNode != null & currNode.getData().getCurrencyFrac() == key.getCurrencyFrac() & currNode.getData().getCurrencyWhole() == key.getCurrencyWhole()) {
			this.start = currNode.getNext(); // Changed head
			this.count--;
			// Display the message
			this.count--;
			return true;

		}

		// CASE 2:
		// If the key is somewhere other than at head

		// Search for the key to be deleted,
		// keep track of the previous node
		// as it is needed to change currNode.next
		if (currNode != null) {

			while (currNode.getData().getCurrencyFrac() != key.getCurrencyFrac() || currNode.getData().getCurrencyWhole() != key.getCurrencyWhole()) {
				// If currNode does not hold key
				// continue to next node
				prev = currNode;
				if (currNode.getNext() != null) {
					currNode = currNode.getNext();
				}
				else {
					currNode = null;
					break;
				}
			}
		}

		// If the key was present, it should be at currNode
		// Therefore the currNode shall not be null
		if (currNode != null) {
			// Since the key is at currNode
			// Unlink currNode from linked list
			prev.setNext(currNode.getNext());
			this.count--;
			// Display the message
//			System.out.println(key + " found and deleted");
			return true;

		}

		// CASE 3: The key is not present

		// If key was not present in linked list
		// currNode should be null
		if (currNode == null) {
			// Display the message
//			System.out.println(key + " not found");
			return false;

		}
		return false;

	}

	// Method to insert a new node at a given index value
	public void addCurrency(int position, Currency data) {
		// create new node.
		LinkNode node = new LinkNode();
		node.setData(data);
		node.setNext(null);

		if (this.start == null) {
			// if head is null and position is zero then exit.
			if (position != 0) {
//	       System.out.println("Out of bound exception: List is empty");
				return;
			} else { // node set to the head.
				this.start = node;
				this.end = node;
				this.count++;
				return;
			}
		}

		if (start != null && position == 0) {
			node.setNext(this.start);
			this.start = node;
			this.end = node;
			this.count++;
			return;
		}

		if (start != null && position == this.getCount() ) {
			this.end.setNext(node);
			this.end = node;
			this.count++;
			return;
		}

		if (start != null && position > this.getCount() ) {
//		   System.out.println("Out of bound exception : Index is more then current element " + this.countCurrency());
			return;
		}

		LinkNode current = this.getStart();

		if (start != null && position < this.getCount() ) {
			for (int i = 0; i < position -1 ; i++) {
				current = current.getNext();
//				System.out.println("printing for check");
//				current.getData().print();
			}
			node.setNext(current.getNext());
			current.setNext(node);
//			System.out.println("printing for added element check");
//			current.getData().print();
//			this.getEnd().setNext(null);
			this.count++;
			return;
		}

	}

	// Method to print the LinkedList.
	public String printList() {
		LinkNode currNode = this.start;

		// Traverse through the LinkedList
		while (currNode != null) {
			// Print the data at current node
			currNode.getData().print();

			// Go to next node
			currNode = currNode.getNext();
		}
		return null;
	}

}
