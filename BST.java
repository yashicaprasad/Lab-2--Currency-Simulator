public class BST {

	private static BSTNode root;

	public BSTNode getRoot() {
		return root;
	}

	public void setRoot(BSTNode root) {
		this.root = root;
	}

	/**
	 * BST constructors
	 */
	BST() {
		this.root = null;
	}

	BST(double value) {
		this.root = new BSTNode(new Dollar(value));
	}

	/**
	 * breadth-first traversal
	 * 
	 * @purpose process tree using breadth-first traversal
	 * @pre root is node to be processed
	 * @post tree is processed
	 * @return N/A
	 * @pseudocode BSTNode currentNode = root queueObj = new Queue() while
	 *             (currentNode != null) queueObj.enQueue(currentNode.getData());
	 *             if(currentNode.getLeft() != null)
	 *             queueObj.enQueue(currentNode.getLeft().getData());
	 *             if(currentNode.getRight() != null)
	 *             queueObj.enQueue((currentNode.getRight().getData())); while
	 *             (!queueObj.isListEmpty()) Currency tempNode = queueObj.dequeue();
	 *             currentNode = null;
	 */
	public void breadthFirst() {
		breadthFirst(root);
	}

	public void breadthFirst(BSTNode root) {
		// fill the queue
		BSTNode currentNode = root;
		Queue queueObj = new Queue();
		while (currentNode != null) {
			queueObj.enQueue(currentNode.getData());
			while (currentNode.getLeft() != null) {
				queueObj.enQueue(currentNode.getLeft().getData());
			}
			while (currentNode.getRight() != null) {
				queueObj.enQueue((currentNode.getRight().getData()));
			}
		}

		// process by dequeue
		while (!queueObj.isListEmpty()) {
			Currency tempNode = queueObj.dequeue();
			tempNode.print();
		}
		currentNode = null; // may be unnecessary
		// destroy queue
	}

	/**
	 * pre order traversal
	 * 
	 * @purpose process tree in node-left-right sequence
	 * @pre root is the entry node of a tree/subtree
	 * @post each node is processed in order
	 * @return N/A
	 * @pseudocode while(root != null) root.getData().print();
	 *             preOrder(root.getLeft()); preOrder(root.getRight());
	 */
	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(BSTNode node) {
		if (node == null)
			return;
		node.getData().print();
		preOrder(node.getLeft());
		preOrder(node.getRight());
	}

	/**
	 * in order traversal
	 * 
	 * @purpose traverse a binary tree in left-node-right sequence
	 * @pre root is entry node of a tree/subtree
	 * @post each node is prcoessed in order
	 * @return N/A
	 * @pseudocode if(root != null) inOrder(root.getLeft()); root.getData().print();
	 *             inOrder(root.getRight());
	 */
	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(BSTNode node) {
		if (node == null)
			return;

		inOrder(node.getLeft());
		node.getData().print();
		inOrder(node.getRight());
	}

	/**
	 * post order traversal
	 * 
	 * @purpose traverse a binary tree in left-right-node sequence
	 * @pre root is entry node of a tree/subtree
	 * @post each node is processed in order
	 * @return N/A
	 * @pseudocode if(root != null) postOrder(root.getLeft());
	 *             postOrder(root.getRight()); root.getData().print();
	 */
	public void postOrder() {
		postOrder(root);
	}

	private void postOrder(BSTNode node) {
		if (node == null)
			return;

		postOrder(node.getLeft());
		postOrder(node.getRight());
		node.getData().print();
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
     * @return number of nodes in the BST
     pseudocode
     if root == null
        return 0
     else
        return 1 + countNode(root.getRight()) + countNode(rootgetLeft())
     */
    public int countNode(BSTNode root)
    {
        if(root == null)
        {
            return 0;
        }
        else
        {
            return 1 + countNode(root.getRight()) + countNode(root.getLeft());
        }
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
