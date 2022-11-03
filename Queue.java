public class Queue extends SinglyLinkedList{
    public Queue()
    {
        super();
    }

    /* enqueue
    Purpose
    Pre: Takes a Currency object as input
    Post: Adds input object to the end of the queue
    Return: N/A

    pseudocode

    LinkNode newNode = new LinkNode(currencyObj);
    LinkNode currentNode = this.start;

    if (head == null)
       setStart(newNode);
       setEnd(newNode);

    else
        while(currentNode != null)
            currentNode = currentNode.next;
            if (currentNode == null)
                setEnd(newNode);
     */
    public void enQueue(Currency currencyObj)
    {
        LinkNode newNode = new LinkNode(currencyObj);
        LinkNode currentNode = this.getStart();
        
        if (this.getStart() == null)
        {
            setStart(newNode);
            setEnd(newNode);
            this.getStart().getData().print();
            this.getEnd().getData().print();
        }
        else
        {
            while(currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            if (currentNode.getNext() == null)
            {
                currentNode.setNext(newNode);
                setEnd(newNode);
                this.getStart().getData().print();
                this.getEnd().getData().print();
                this.printList();
            }
        }
    }

    /*
    purpose: remove and return the Currency object from the front of the queue
    pre: N/A
    post: Currency object at front of queue is removed
    return: Currency object at front of queue is returned

    pseudocode

    if(start == null)
        System.out.println("Queue is empty");
        return null;
    else
        Currency temp = getStart().data;
        removeCurrency(1);
]       return temp;

     */
    public Currency dequeue()
    {
        if(this.getStart() == null)
        {
            System.out.println("Queue is empty");
            return null;
        }
        else
        {
            Currency temp = getStart().getData();
            removeCurrency(1);
            System.out.println("returning temp");
            return temp;
        }
    }

    /*
    purpose: return copy of Currency object at front of queue
    pre: N/A
    post: N/A
    return: Currency object at front of queue

    pseudocode

    if(start == null)
        System.out.println("Queue is empty");
        return null;
    else
        return getStart().data;
     */

    public Currency peekFront()
    {
        if(this.getStart() == null)
        {
            System.out.println("Queue is empty");
            return null;
        }
        else
        {
            System.out.println("returning object at front");
            return getStart().getData();
        }
    }

    /*
    purpose: return copy of Currency object at end of queue
    pre: N/A
    post: N/A
    return: Currency object at end of queue

    pseudocode

    if(start == null)
        System.out.println("Queue is empty");
        return null;
    else
        return getEnd().data;
     */
    public Currency peekRear()
    {
        if (this.getStart() == null)
        {
            System.out.println("Queue is empty");
            return null;
        }
        else
        {
            System.out.println("returning object at rear");
            return getEnd().getData();
        }
    }

    /*
    purpose: return a string signifying the contents of the que
    pre: N/A
    post: N/A
    return: a string signifying the contents of the que from front to end, tab spaced

    pseudocode

    LinkNode currentNode = this.start;
    while(currentNode != null)
        System.out.printf("%-20s", currentNode.data);
        currentNode = currentNode.next;
     */

    public void printQueue()
        {
            LinkNode currentNode = this.getStart();

            while(currentNode != null)
            {
                System.out.printf("%-20s", currentNode.getData());
                currentNode = currentNode.getNext();
            }

        }

}
