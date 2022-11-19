public class BST {
	private static BSTNode root;
	 
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
    public void breadthFirst(BSTNode node)
    {
        //fill the queue
        BSTNode currentNode = node;
        Queue queueObj = new Queue();
		if(currentNode == null)
		{
			return;
		}

		queueObj.enQueue(currentNode.getData());
		if(currentNode.getLeft() != null)
		{
			queueObj.enQueue(currentNode.getLeft().getData());
		}
		if(currentNode.getRight() != null)
		{
			queueObj.enQueue((currentNode.getRight().getData()));
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
     * @pre root node is the entry node of a tree/subtree
     * @post each node is processed in order
     * @return N/A

     * @pseudocode
    if(node == null)
		return
	node.getData().print();
	preOrder(node.getLeft());
	preOrder(node.getRight());
     */

	public void preOrder() {
		preOrder(root);
	}
    public void preOrder(BSTNode node)
    {
        if(node == null)
        {
			return;
        }
		node.getData().print();
		preOrder(node.getLeft());
		preOrder(node.getRight());
    }

    /** in order traversal
     * @purpose traverse a binary tree in left-node-right sequence
     * @pre root node is entry node of a tree/subtree
     * @post each node is prcoessed in order
     * @return N/A
     * @pseudocode
        if(node != null)
            inOrder(node.getLeft());
            ronodeot.getData().print();
            inOrder(node.getRight());
     */

	public void inOrder() {
		inOrder(root);
	}
    public void inOrder(BSTNode node)
    {
		if (node == null)
		{
			return;
		}
		inOrder(node.getLeft());
		node.getData().print();
		inOrder(node.getRight());
    }

    /** post order traversal
     * @purpose traverse a binary tree in left-right-node sequence
     * @pre root node is entry node of a tree/subtree
     * @post each node is processed in order
     * @return N/A
     * @pseudocode
        if(node = null)
			return
		postOrder(node.getLeft());
        postOrder(node.getRight());
		node.getData().print();
     */

	public void postOrder()
	{
		postOrder(root);
	}
	public void postOrder(BSTNode node)
    {
        if(node == null) {
			return;
		}
		postOrder(node.getLeft());
		postOrder(node.getRight());
		node.getData().print();
    }

    /** printTree
     * @purpose print the contents of the BST
     * @pre takes BST node as input
     * @post contents of BST is printed
     * @return N/A

     pseudocode
     if(node != null)
        print(node.getData())
        printTree(node.getLeft())
        printTree(node.getRight())
     */
    public void printTree(BSTNode node)
    {
        if(node != null)
        {
            System.out.println(node.getData());
            printTree(node.getLeft());
            printTree(node.getRight());
        }

    }
	/**
	 * search for a Dollar object
	 * 
	 * @purpose recursively search for a Dollar object in a binary tree
	 * @pre root is entry node of a tree/subtree and key is the Dollar object being
	 *      searched for
	 * @post search is called until root == null or root.getData() == key
	 * @return true/false
	 * @pseudocode if (root == null || root.getData() == key) return root; if
	 *             (root.getData().isGreater(key)) return search(root.getRight(),
	 *             key); if (!root.getData().isGreater(key)) return
	 *             search(root.getLeft(), key);
	 */
	public static boolean search(Double value) {
		return search(root, new Dollar(value));
	}
	
	public static boolean search(BSTNode root, Dollar value) {

		if (root == null)
			return false;

		if (root.getData().isEqual(value))
			return true;

		if (root.getData().isGreater(value))
			return search(root.getLeft(), value);

		else if (!root.getData().isGreater(value))
			return search(root.getRight(), value);

		return false;
	}
	/** countNode
     * @purpose count the number of nodes in the BST
     * @pre
     * @post number of nodes is counted

     pseudocode
     if node == null
        return 0
     else
        return 1 + countNode(node.getRight()) + countNode(node.getLeft())
     */
    public int countNode(BSTNode node)
    {
        if(node == null)
        {
            return 0;
        }
        else
        {
            return 1 + countNode(node.getRight()) + countNode(node.getLeft());
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


	/**
	 * insert a Dollar object
	 * 
	 * @purpose recursively go through the BST to insert the Dollar obj in the
	 *          correct location
	 * @pre root is entry node of a tree/subtree and key is the Dollar object to be
	 *      inserted
	 * @post search is called until root == null or root.getData() == key
	 * @return root
	 * @pseudocode If the tree is empty, return a new node Otherwise, recur down the
	 *             tree
	 */
	BSTNode insert(BSTNode root, Dollar key) {

		if (root == null) {
			root = new BSTNode(key);
			return root;
		}

		else if (root.getData().isGreater(key)) {
			System.out.println("Setting left : " + key.print());
			root.setLeft(insert(root.getLeft(), key));
		} else if (!root.getData().isGreater(key)) {
			System.out.println("Setting right : " + key.print());
			root.setRight(insert(root.getRight(), key));
		}

		return root;
	}

	/**
	 * check if the BST is empty
	 * 
	 * @purpose check if the BST is empty
	 * @pre
	 * @post search is called until root == null or root.getData() == key
	 * @return true/false
	 * @pseudocode If this.root == null return true Else return false;
	 */

	Boolean isEmpty() {
		if (this.root == null)
			return true;
		return false;
	}
}
