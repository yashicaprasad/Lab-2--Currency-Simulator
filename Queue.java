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
    LinkNode head = this.start;
    LinkNode tail = this.end;
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
        LinkNode head = this.start;
        LinkNode tail = this.end;
        LinkNode currentNode = this.start;


        if (head == null)
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
    
     */

}
