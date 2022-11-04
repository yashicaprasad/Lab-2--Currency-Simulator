
public class Lab3Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Currency Simulator by Yashica Prasad and Lois Wong ");
		Lab3Main testinstance= new Lab3Main();

		testinstance.testStack();
		testinstance.testQueue();


		Currency[] dollarArray = new Dollar[20];
		dollarArray = new Currency[]{new Dollar(57.12), new Dollar(23.44),
		new Dollar(87.43), new Dollar(68.99), new Dollar(111.22),
				new Dollar(44.55), new Dollar(77.77), new Dollar(18.36),
				new Dollar(543.21), new Dollar(20.21), new Dollar(345.67),
				new Dollar(36.18), new Dollar(48.48), new Dollar(101.00),
				new Dollar(11.00), new Dollar(21.00), new Dollar(51.00),
				new Dollar(1.00), new Dollar(251.00), new Dollar(151.00)};

		SinglyLinkedList singlyLinkedListObj = new SinglyLinkedList();
		Stack stackObj = new Stack();
		Queue queueObj = new Queue();

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
