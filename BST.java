public class BST {

	private BSTNode root;
	 
    // Constructor
    BST() { this.root = null; }
 
    BST(double value) { this.root = new BSTNode(new Dollar(value)); }
 
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
