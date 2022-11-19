
public class Lab4Main {
	public static void main(String[] args) {
		BST test = new BST(14.47);
		test.insert(test.getRoot(), new Dollar(23.50));
		test.insert(test.getRoot(), new Dollar(13.33));
		test.insert(test.getRoot(), new Dollar(4.57));
		test.insert(test.getRoot(), new Dollar(57.00));
		test.insert(test.getRoot(), new Dollar(18.21));
		System.out.println("inOrder traversal");		
		test.inOrder();
		System.out.println("preOrder traversal");
		test.preOrder();
		System.out.println("postOrder traversal");
		test.postOrder();
		//System.out.println("breadthFirst traversal");
		//test.breadthFirst();
		System.out.println("search for 4.57");
		System.out.println(test.search(4.8));
	}
}
