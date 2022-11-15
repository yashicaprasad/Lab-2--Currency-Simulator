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
    public void breadthFirst(BSTNode root)
    {
        //fill the queue
        BSTNode currentNode = root;
        Queue queueObj = new Queue();
        while(currentNode != null)
        {
            queueObj.enQueue(currentNode.getData());
            while(currentNode.getLeft() != null)
            {
                queueObj.enQueue(currentNode.getLeft().getData());
            }
            while(currentNode.getRight() != null)
            {
                queueObj.enQueue((currentNode.getRight().getData()));
            }
        }

        //process by dequeue
        while (!queueObj.isListEmpty())
        {
            Currency tempNode = queueObj.dequeue();
            tempNode.print();
        }
        currentNode = null; //may be unnecessary
        //destroy queue
    }

    /** pre order traversal
     * @purpose process tree in node-left-right sequence
     * @pre root is the entry node of a tree/subtree
     * @post each node is processed in order
     * @return N/A

     * @pseudocode
    while(root != null)
        root.getData().print();
        preOrder(root.getLeft());
        preOrder(root.getRight());
     */
    public void preOrder(BSTNode root)
    {
        while(root != null)
        {
            root.getData().print();
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    /** in order traversal
     * @purpose traverse a binary tree in left-node-right sequence
     * @pre root is entry node of a tree/subtree
     * @post each node is prcoessed in order
     * @return N/A
     * @pseudocode
        if(root != null)
            inOrder(root.getLeft());
            root.getData().print();
            inOrder(root.getRight());
     */

    public void inOrder(BSTNode root)
    {
        while(root!= null)
        {
            inOrder(root.getLeft());
            root.getData().print();
            inOrder(root.getRight());
        }
    }

    /** post order traversal
     * @purpose traverse a binary tree in left-right-node sequence
     * @pre root is entry node of a tree/subtree
     * @post each node is processed in order
     * @return N/A
     * @pseudocode
        if(root != null)
            postOrder(root.getLeft());
            postOrder(root.getRight());
            root.getData().print();
     */

    public void postOrder(BSTNode root)
    {
        while(root!= null)
        {
            postOrder(root.getLeft());
            postOrder(root.getRight());
            root.getData().print();
        }
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
