/*
Lab 3
Yashica Prasad and Lois Wong
Purpose of the assignment: Demonstrate use of stacks, queues, and linked lists
 */

public class SinglyLinkedList {
	private LinkNode start;
	private LinkNode end;
	private int count = 0;
	
	/*
	setter purpose: Sets the data to input data  
	pre: takes in a LinkNode or int object 
	post: sets this.data = input data 
	return: N/A 
	
	pseudocode
	this.data = data;
	*/ 
	
	/*
	getter purpose: retrieves desired data
	pre: N/A
	post: N/A 
	return: the data requested 
	
	pseudocode
	return data; 
	*/ 

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
	
	/*
	removeCurrency purpose: removes the specified Currency object from the list
	pre: int index value 
	post: removes specified Currency object from the list 
	return: true or false 
	
	pseudocode for integer input 
	
	int size = this.countCurrency();
		if (key >= size || key < 0) 
			return false
		else if (key == 0)
			this.start = this.start.getNext()
			return true
		
		LinkNode crunchifyCurrent = this.start;
		if (this.start != null & key > 0) 
			for (int i = 0; i < key - 1; i++) 
				crunchifyCurrent = crunchifyCurrent.getNext();
			if (crunchifyCurrent.getNext() == null) 
			else 
				crunchifyCurrent.setNext(crunchifyCurrent.getNext().getNext());
				this.countCurrency();			
			this.count--;
			return true;
		return false;
	*/ 

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
	getCurrency purpose: return the node data at the designated index
	pre: integer index value 
	post: N/A
	return: data for desired LinkNode object
	
	pseudocode
	
	if (index < 0 || index >= this.getCount())
		System.out.println("Invalid index value");
		return null;
	LinkNode currentNode = start;
		int i = 0;
		while (i < index) 
			currentNode = currentNode.getNext();
			i++;
		return currentNode.getData();
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
	findCurrency purpose: return the node index of the given Currency object 
	pre: takes in Currency object as input 
	post: N/A
	return: an integer denoting the node index of the given Currency object
	
	pseudocode 
	
	int index = 0;
		LinkNode currentNode = this.start;
		while (currentNode != null) 
			if (currentNode.getData().getCurrencyFrac() == currencyObj.getCurrencyFrac() & currentNode.getData().getCurrencyWhole() == currencyObj.getCurrencyWhole()) 
				return index;
			else 
				index++;
				currentNode = currentNode.getNext();
		return -1;
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
		return -1;
	}

	/*
	countCurrency purpose: get the count of Currency nodes in the list
	pre: N/A
	post: N/A 
	return: integer indicating the count of Currency nodes in the list
	 
	 pseudocode
	 int i = 0;
		LinkNode currentNode = this.start;
		while (currentNode != null) 
			i++;
			currentNode = currentNode.getNext();
		return i;
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
	 isListEmpty purpose: tell whether a list is empty or not 
	 pre: N/A 
	 post: N/A
	 return: a bool indicating whether a list is empty or not
	 
	 pseudocode 
	 
	 LinkNode currentNode = this.start; 
	 if(currentNode == null) 
	 	return true;
	 return false
	 */

	public boolean isListEmpty() {
		LinkNode currentNode = this.start;
		if (currentNode == null) {
			return true;
		}
		return false;
	}
	
	/*
	removeCurrency purpose: removes the specified Currency object from the list
	pre: Currency object 
	post: removes specified Currency object from the list 
	return: true or false 
	
	pseudocode for Currency object input 
	
	LinkNode currNode = this.start, prev = null;
	if (currNode != null & currNode.getData().getCurrencyFrac() == key.getCurrencyFrac() & currNode.getData().getCurrencyWhole() == key.getCurrencyWhole()) 
			this.start = currNode.getNext(); 
			this.count--;
			this.count--;
			return true;
			
	if (currNode != null) 
			while (currNode.getData().getCurrencyFrac() != key.getCurrencyFrac() || currNode.getData().getCurrencyWhole() != key.getCurrencyWhole()) 
				prev = currNode;
				if (currNode.getNext() != null) 
					currNode = currNode.getNext();
				else 
					currNode = null;
					break;
	if (currNode != null) 
			prev.setNext(currNode.getNext());
			this.count--;
 			System.out.println(key + " found and deleted");
			return true;
	if (currNode == null) {
			System.out.println(key + " not found");
			return false;
		return false;
	*/ 

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

	/*
	addCurrency purpose: Add a Currency object to the list at desired index
	pre: integer position and Currency object
	post: adds Currency object to the list at desired index
	return: N/A 
	
	pseudocode 
	
	LinkNode node = new LinkNode();
		node.setData(data);
		node.setNext(null);
	if (this.start == null) 
			if (position != 0) 
				return;
			else 
				this.start = node;
				this.end = node;
				this.count++;
				return;
	if (start != null && position == 0) 
			node.setNext(this.start);
			this.start = node;
			this.end = node;
			this.count++;
			return;

		if (start != null && position == this.getCount() ) 
			this.end.setNext(node);
			this.end = node;
			this.count++;
			return;

		if (start != null && position > this.getCount() ) 
			return;

		LinkNode current = this.getStart();

		if (start != null && position < this.getCount() ) 
			for (int i = 0; i < position -1 ; i++) 
				current = current.getNext();
			
			node.setNext(current.getNext());
			current.setNext(node);
			this.count++;
			return;
	*/
	
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

	/*
	printList purpose: display all the Currency objects in the list 
	pre: N/A
	post: N/A
	return: a string of all the Currency objects in the list 
	
	pseudocode
	
	String listItems = "";
	if(this.getStart() == null)
		return null
	else 
	LinkNode currentNode = this.getStart();
             while (currentNode != null)
            	 listItems = listItems.concat(currentNode.getData().print() + "\t");
                 currentNode = currentNode.getNext();
         return listItems;
	*/
	
	public String printList() {
		 String listItems = "";
         if(this.getStart() == null)
         {
//             System.out.println("Queue is empty");
             return null;
         }
         else
         {
             LinkNode currentNode = this.getStart();
             while (currentNode != null)
             {
            	 listItems = listItems.concat(currentNode.getData().print() + "\t");
                 currentNode = currentNode.getNext();
             }
         }
         return listItems;
	}
}
