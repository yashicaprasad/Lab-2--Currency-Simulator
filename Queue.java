/*
Lab 3
Yashica Prasad and Lois Wong
Purpose of the assignment: Demonstrate use of stacks, queues, and linked lists
 */

public class Queue extends SinglyLinkedList{
    public Queue()
    {
        super();
    }

    /* 
    enqueue Purpose
    Pre: Takes a Currency object as input
    Post: Adds input object to the end of the queue
    Return: N/A

    pseudocode

    LinkNode newNode = new LinkNode(currencyObj);
    LinkNode currentNode = this.start;

    if (currentNode == null)
       setStart(newNode);
       setEnd(newNode);
    else
        while(currentNode.getNext() != null)
            currentNode = currentNode.getNext();
        if (currentNode.getNext() == null)
                currentNode.setNext(newNode);
                setEnd(newNode);
     */
    public void enQueue(Currency currencyObj)
    {
        LinkNode newNode = new LinkNode(currencyObj);
        LinkNode currentNode = this.getStart();
        
        if (currentNode == null)
        {
            setStart(newNode);
            setEnd(newNode);
        }
        else
        {
            while(currentNode.getNext() != null)
            {
                currentNode = currentNode.getNext();
            }
            if (currentNode.getNext() == null)
            {
                currentNode.setNext(newNode);
                setEnd(newNode);
            }
        }
    }

    /*
    dequeue purpose: remove and return the Currency object from the front of the queue
    pre: N/A
    post: Currency object at front of queue is removed
    return: Currency object at front of queue is returned

    pseudocode

    if(this.getStart() == null)
        return null;
    else
        Currency temp = this.getStart().getData();
        removeCurrency(0);
        return temp;
     */
    public Currency dequeue()
    {
        if(this.getStart() == null)
        {
//            System.out.println("Queue is empty");
            return null;
        }
        else
        {
            Currency temp = this.getStart().getData();
            removeCurrency(0);
//            System.out.println("removing object at front");
//            this.printList();
//            System.out.println("\nreturning temp");
            return temp;
        }
    }

    /*
    peekFront purpose: return copy of Currency object at front of queue
    pre: N/A
    post: N/A
    return: Currency object at front of queue

    pseudocode

    if(this.getStart() == null)
         print("Queue is empty")
        return null;
    else
        return this.getStart().data;
     */

    public Currency peekFront()
    {
        if(this.getStart() == null)
        {
//            System.out.println("Queue is empty");
            return null;
        }
        else
        {
//            System.out.println("returning object at front");
            return this.getStart().getData();
        }
    }

    /*
    peekRear purpose: return copy of Currency object at end of queue
    pre: N/A
    post: N/A
    return: Currency object at end of queue

    pseudocode

    if (this.getStart() == null)
        return null;
    else
        return this.getEnd().getData();
     */
    public Currency peekRear()
    {
        if (this.getStart() == null)
        {
//            System.out.println("Queue is empty");
            return null;
        }
        else
        {
//            System.out.println("returning object at rear");
            return this.getEnd().getData();
        }
    }

    /*
    printQueue purpose: return a string signifying the contents of the que
    pre: N/A
    post: N/A
    return: a string signifying the contents of the que from front to end, tab spaced

    pseudocode

    String queueItems = "";
    if(this.getStart() == null)
        return null;
    else
        LinkNode currentNode = this.getStart();
        while (currentNode != null)
            queueItems = queueItems.concat(currentNode.getData().print() + "\t");
            currentNode = currentNode.getNext();
    return queueItems;

     */

    public String printQueue()
        {
            String queueItems = "";
            if(this.getStart() == null)
            {
//                System.out.println("Queue is empty");
                return null;
            }
            else
            {
                LinkNode currentNode = this.getStart();
                while (currentNode != null)
                {
                    queueItems = queueItems.concat(currentNode.getData().print() + "\t");
                    currentNode = currentNode.getNext();
                }
            }
            return queueItems;
        }
}
