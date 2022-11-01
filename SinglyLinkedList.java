
public class SinglyLinkedList {
	LinkNode start;
	LinkNode end;
	int count;

	// Method to insert a new node
	public static SinglyLinkedList insertCurrency(SinglyLinkedList list, Currency data) {
		// Create a new node with given data
		LinkNode new_node = new LinkNode(data);
		new_node.next = null;

		// If the Linked List is empty,
		// then make the new node as head
		if (list.start == null) {
			list.start = new_node;
		} else {
			// Else traverse till the last node
			// and insert the new_node there
			LinkNode last = list.start;
			while (last.next != null) {
				last = last.next;
			}

			// Insert the new_node at last node
			last.next = new_node;
		}

		// Return the list by head
		return list;
	}
	
    // Method to print the LinkedList.
    public static void printList(SinglyLinkedList list)
    {
        LinkNode currNode = list.start;
    
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
