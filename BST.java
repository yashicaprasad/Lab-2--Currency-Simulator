public class BST {

	private BSTNode root;
	 
    // Constructor
    BST() { this.root = null; }
 
    BST(double value) { this.root = new BSTNode(new Dollar(value)); }

    /** breadth-first traversal
     * @purpose process tree using breadth-first traversal
     * @pre root is node to be processed
     * @post tree is processed
     * @return N/A

     * @pseudocode
     if(root == null)
        print("root is null")
        return

     BSTNode currentNode = root
     queueObj = new Queue()
     while (currentNode != null)
        queueObj.enQueue(currentNode.getData());
        if(currentNode.getLeft() != null)
            queueObj.enQueue(currentNode.getLeft().getData());
        if(currentNode.getRight() != null)
            queueObj.enQueue((currentNode.getRight().getData()));

    while (!queueObj.isListEmpty())
        Currency tempNode = queueObj.dequeue();
    currentNode = null;
     */
    public void breadthFirstTraversal(BSTNode root)
    {
        //check if root is null
        if(root == null)
        {
            System.out.println("Root is null");
            return;
        }

        //fill the queue
        BSTNode currentNode = root;
        Queue queueObj = new Queue();
        while(currentNode != null)
        {
            queueObj.enQueue(currentNode.getData());
            if(currentNode.getLeft() != null)
            {
                queueObj.enQueue(currentNode.getLeft().getData());
            }
            if(currentNode.getRight() != null)
            {
                queueObj.enQueue((currentNode.getRight().getData()));
            }
        }

        //process by dequeue
        while (!queueObj.isListEmpty())
        {
            Currency tempNode = queueObj.dequeue();
            tempNode.print(); // check
        }
        currentNode = null; //may be unnecessary

        //destroy queue

    }

    /* A recursive function to
       insert a new key in BST */
    BSTNode insertRec(BSTNode insert)
    { 
        /* If the tree is empty,
           return a new BSTNode */
        if (this.root == null) {
            this.root = insert;
            return this.root;
        }
 
        /* Otherwise, recur down the tree */
        else if (insert.getData().isGreater())
            root.setLeft(insertRec(root.getLeft()));
        else if (!insert.getData().isGreater())
            root.setRight(insertRec(root.getRight()));
 
        /* return the (unchanged) BSTNode pointer */
        return root;
    }
}
