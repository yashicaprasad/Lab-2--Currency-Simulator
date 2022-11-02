public class Queue extends SinglyLinkedList{

    public Queue()
    {
        super();
    }

    public void createQueue() {} //optional

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
        LinkNode currentNode = this.start;


        if (start == null)
        {
            setStart(newNode);
            setEnd(newNode);
            System.out.println(getStart() + " = start");
            System.out.println(getEnd() + " = end");
        }
        else
        {
            while(currentNode != null)
            {
                currentNode = currentNode.next;
                if (currentNode == null)
                {
                    setEnd(newNode);
                    System.out.println(getStart() + " = start");
                    System.out.println(getEnd() + " = end");
                }
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
        if(start == null)
        {
            System.out.println("Queue is empty");
            return null;
        }
        else
        {
            Currency temp = getStart().data;
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
        if(start == null)
        {
            System.out.println("Queue is empty");
            return null;
        }
        else
        {
            System.out.println("returning object at front");
            return getStart().data;
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
    public Currency peekRear() {
        if (start == null) {
            System.out.println("Queue is empty");
            return null;
        } else {
            System.out.println("returning object at rear");
            return getEnd().data;
        }
    }


    /*
    purpose: return a string signifying the contents of the que
    pre: N/A
    post: N/A
    return: a string signifying the contents of the que from front to end, tab spaced

    pseudocode

    Currency currentObj = start;
    while currentObj != null
        System.out.printf(\tcurrentObj.data);
     */

    public void printQueue()
        {
            LinkNode currentNode = this.start;

            while(currentNode != null)
            {
                System.out.printf("%-20s", currentNode.data);
                currentNode = currentNode.next;

            }

        }

}
