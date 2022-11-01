
public class SinglyLinkedList {
	LinkNode start;
	LinkNode end;
	int count;

	public LinkNode getStart() {
		return start;
	}

	public void setStart(LinkNode start) {
		this.start = start;
	}

	public LinkNode getEnd() {
		return end;
	}

	public void setEnd(LinkNode end) {
		this.end = end;
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
	public void removeCurrency(int key) {
		// if the index is out of range, exit
		if (key > size || key <= 0) {
		}
		if (key == 1) {
			this.start = this.start.next;
		}

		LinkNode crunchifyCurrent = this.start;
		if (this.start != null) {
			for (int i = 0; i < key - 2; i++) {
				crunchifyCurrent = crunchifyCurrent.next;
			}
			if (crunchifyCurrent.next == null) {
			} else {

				crunchifyCurrent.next = crunchifyCurrent.next.next;
			}
			// decrement the number of elements variable
			size--;

		}
	}
	
	*/
	
	/*
    Purpose: Return the Currency object at desired index
    Pre: Takes an index value as input
    Post: N/A
    Returns: The currency object at the given value

    pseudocode
    if (index < 0 || index >= count)
        print invalid index value and return null
    LinkNode currentNode = start
    int i = 0
    while(i < index)
        currentNode = currentNode.getNext()
        i ++
    return currentNode.getData()
     */

    public Currency getCurrency(int index)
    {
        if (index < 0 /*|| index >= count*/)
        {
            System.out.println("Invalid index value");
            return null;
        }

        LinkNode currentNode = start;
        int i = 0;
        while (i < index)
        {
            currentNode = currentNode.next;
            i++;
        }
        return currentNode.data;
    }
    
	/*
    Purpose: Returns the node index of the designated currency object
    Pre: takes in a Currency object as a parameter
    Post: N/A
    Return: The node index of the input Currency object

    pseudocode:
    int index = 0
    Node current = head;
    while(current != null)
        if(current.equals(currencyObj)
            return index
    return SinglyLinkedList.indexOf(currencyObj);
     */
	
    public int findCurrency(Currency currencyObj)
    {
        int index = 0;
        LinkNode currentNode = this.start;

        while(currentNode != null)
        {
            if(currentNode.data.equals(currencyObj))
            {
                return index;
            }else {
            	index++;
                currentNode = currentNode.next;
            }
            
        }
        System.out.println("Object is not found");
        return -1;
    }

	public void removeCurrency(Currency key) {
		// Store head node
		LinkNode currNode = this.start, prev = null;

		// CASE 1:
		// If head node itself holds the key to be deleted

		if (currNode != null && currNode.data == key) {
			this.start = currNode.next; // Changed head

			// Display the message
			System.out.println(key + " found and deleted");

		}

		// CASE 2:
		// If the key is somewhere other than at head

		// Search for the key to be deleted,
		// keep track of the previous node
		// as it is needed to change currNode.next
		while (currNode != null && currNode.data != key) {
			// If currNode does not hold key
			// continue to next node
			prev = currNode;
			currNode = currNode.next;
		}

		// If the key was present, it should be at currNode
		// Therefore the currNode shall not be null
		if (currNode != null) {
			// Since the key is at currNode
			// Unlink currNode from linked list
			prev.next = currNode.next;

			// Display the message
			System.out.println(key + " found and deleted");
		}

		// CASE 3: The key is not present

		// If key was not present in linked list
		// currNode should be null
		if (currNode == null) {
			// Display the message
			System.out.println(key + " not found");
		}
	}

	// Method to insert a new node at a given index value
	public LinkNode addCurrency(int position, Currency data) {
		LinkNode head = this.start;
		if (position < 1)
			System.out.print("Invalid position");

		// if position is 1 then new node is
		// set infornt of head node
		// head node is changing.
		LinkNode newNode = new LinkNode(data);
		if (position == 1) {

			newNode.next = this.start;
			head = newNode;
		} else {
			while (position-- != 0) {
				if (position == 1) {
					// adding Node at required position

					// Making the new Node to point to
					// the old Node at the same position
					newNode.next = this.start.next;

					// Replacing current with new Node
					// to the old Node to point to the new Node
					this.start.next = newNode;
					break;
				}
				this.start = this.start.next;
			}
			if (position != 1)
				System.out.print("Position out of range");
		}
		return head;
	}

	// Method to print the LinkedList.
	public void printList() {
		LinkNode currNode = this.start;

		System.out.print("LinkedList: ");

		// Traverse through the LinkedList
		while (currNode != null) {
			// Print the data at current node
			System.out.print(currNode.data + " ");

			// Go to next node
			currNode = currNode.next;
		}
	}

}
