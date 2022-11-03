
public class Lab3Main {
	public static void main(String[] args) {
		Lab3Main testinstance= new Lab3Main();
//		testinstance.testLinkedList();
		
		testinstance.testStack();
		testinstance.testQueue();


	}
	
	public void testStack() {
		Currency b = new Dollar(11.75);
		Currency c = new Dollar(12.50);
		Currency d = new Dollar(10.50);
		Currency e = new Dollar(13.47);
		Currency f = new Dollar(9.33);
		Currency g = new Dollar(7.12);		
		
		//Testing SinglyLinkedList methods
		//Initialize a list
		Stack a = new Stack();
		a.addCurrency(1, c);
		a.printList();
		a.addCurrency(2, d);
		a.printList();

		//add more stuff to 'a'
		a.addCurrency(1, b);
		a.printList();

		a.addCurrency(2, e);
		a.printList();

		a.addCurrency(3, f);
		a.addCurrency(4, g);
		System.out.println("Print a with all elements: ");
		a.printList();
		//findCurrency(c)
		System.out.println("FindCurrency(e)" + a.findCurrency(e));
		a.printList();
		//removeCurrency(e)
		a.removeCurrency(e);
		a.printList();
		a.removeCurrency(2);
		a.printList();
		//a.countCurrency()
		System.out.println("\ncountCurrency: " + a.countCurrency());
	}
	
	public void testQueue() {
	}
	
	
	public void testLinkedList() {
		//Testing LinkNode
		Currency b = new Dollar(11.75);
		Currency c = new Dollar(12.50);
		Currency d = new Dollar(10.50);
		Currency e = new Dollar(13.47);
		Currency f = new Dollar(9.33);
		Currency g = new Dollar(7.12);		
		
		//Testing SinglyLinkedList methods
		//Initialize a list
		SinglyLinkedList a = new SinglyLinkedList();
		a.addCurrency(1, c);
		a.printList();
		a.addCurrency(2, d);
		a.printList();

		//add more stuff to 'a'
		a.addCurrency(1, b);
		a.printList();

		a.addCurrency(2, e);
		a.printList();

		a.addCurrency(3, f);
		a.addCurrency(4, g);
		System.out.println("Print a with all elements: ");
		a.printList();
		//findCurrency(c)
		System.out.println("FindCurrency(e)" + a.findCurrency(e));
		a.printList();
		//removeCurrency(e)
		a.removeCurrency(e);
		a.printList();
		a.removeCurrency(2);
		a.printList();
		//a.countCurrency()
		System.out.println("\ncountCurrency: " + a.countCurrency());
	}
}
