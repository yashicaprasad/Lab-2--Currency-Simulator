
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

	public void removeCurrency(int key) {
		// if the index is out of range, exit
		int size = this.countCurrency();
		if (key > size || key <= 0) {
			System.out.println("Index out of bounds");
		}
		else if (key == 1) {
			this.start = this.start.next;
		}

		LinkNode crunchifyCurrent = this.start;
		if (this.start != null & key > 1) {
			for (int i = 0; i < key - 2; i++) {
				crunchifyCurrent = crunchifyCurrent.next;
			}
			if (crunchifyCurrent.next == null) {
			} else {
				crunchifyCurrent.next = crunchifyCurrent.next.next;
			}
			// decrement the number of elements variable
			count--;

		}
	}
	
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
        i++
    return currentNode.data()
     */

    public Currency getCurrency(int index)
    {
        if (index < 1 /*|| index >= count*/)
        {
            System.out.println("Invalid index value");
            return null;
        }

        LinkNode currentNode = start;
        int i = 1;
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
    LinkNode currentNode = this.start;
    while(current != null)
        if(current.data.equals(currencyObj)
            return index
        else
        	index++
        	currentNode = currentNode.next
   	print "Object is not found"
   	return -1
     */
	
    public int findCurrency(Currency currencyObj)
    {
        int index = 1;
        LinkNode currentNode = this.start;

        while(currentNode != null)
        {
            if(currentNode.data.equals(currencyObj))
            {
                return index;
            }
			else
			{
            	index++;
                currentNode = currentNode.next;
            }
        }
        System.out.println("Object is not found");
        return -1;
    }

	/*
	Purpose: Get the count of Currency nodes in the list
	Pre: N/A
	Post: N/A
	Returns: Integer count of Currency nodes in the list

	pseudocode

	int i = 0;
	LinkNode currentNode = this.start;
	while(currentNode != null)
		i++
		currentNode = currentNode.next
	return i;
*/

	public int countCurrency() {
		int i = 0;
		LinkNode currentNode = this.start;

		while (currentNode != null) {
			i++;
			currentNode = currentNode.next;
		}
		return i;
	}

	/*
	isListEmpty
	purpose: tell whether a list is empty or not
	pre: N/A
	post: N/A
	return: a bool indicating whether a list is empty or not

	pseudocode
	LinkNode currentNode = this.start;
	if(currentNode == null)
		return true
	return false
	 */

	public boolean isListEmpty()
	{
		LinkNode currentNode = this.start;
		if(currentNode == null)
		{
			return true;
		}
		return false;
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
	public void addCurrency(int position, Currency data) {
		//create new node.
	    LinkNode node = new LinkNode();
	    node.data = data;
	    node.next = null;

	    if (this.start == null) {
	      //if head is null and position is zero then exit.
	      if (position != 0) {
	       return;
	      } else { //node set to the head.
	       this.start = node;
	      }
	    }

	    if (start != null && position == 0) {
	      node.next = this.start;
	      this.start = node;
	      return;
	    }

	    LinkNode current = this.start;
	    LinkNode previous = null;

	    int i = 0;

	    while (i < position) {
	      previous = current;
	      current = current.next;

	      if (current == null) {
	        break;
	      }

	       i++;
	      }

	      node.next = current;
	      previous.next = node;
	}

	// Method to print the LinkedList.
	public void printList() {
		LinkNode currNode = this.start;

		System.out.print("\nLinkedList: " + "\n");

		// Traverse through the LinkedList
		while (currNode != null) {
			// Print the data at current node
			currNode.data.print();

			// Go to next node
			currNode = currNode.next;
		}
	}

}
