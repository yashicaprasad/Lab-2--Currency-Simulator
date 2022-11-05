
public class Lab3Main {


	public static void main(String[] args) {
		System.out.println("Welcome to Currency Simulator by Yashica Prasad and Lois Wong: ");

		//20 Dollar objects in a currency array
		Currency[] dollarArray = new Dollar[20];
		dollarArray = new Currency[]{new Dollar(57.12), new Dollar(23.44),
				new Dollar(87.43), new Dollar(68.99), new Dollar(111.22),
				new Dollar(44.55), new Dollar(77.77), new Dollar(18.36),
				new Dollar(543.21), new Dollar(20.21), new Dollar(345.67),
				new Dollar(36.18), new Dollar(48.48), new Dollar(101.00),
				new Dollar(11.00), new Dollar(21.00), new Dollar(51.00),
				new Dollar(1.00), new Dollar(251.00), new Dollar(151.00)};

		//SinglyLinkedList, Stack, Queue objects
		SinglyLinkedList singlyLinkedListObj = new SinglyLinkedList();
		//Stack stackObj = new Stack();
		Queue queueObj = new Queue();

		//add first 7 objects of dollarArray into linked list in reverse order
		int j = 1;
		for (int i = 6; i != -1; i--) {
			singlyLinkedListObj.addCurrency(j, dollarArray[i]);
			j += 1;
		}

		//search for $87.43

		int index87 = 0;
		boolean index87Exists = false;

		//traversing dollarArray to find currency = 87.43
		for (int i = 0; i < dollarArray.length; i++) {
			if (dollarArray[i].currencyWhole == 87 && dollarArray[i].currencyFrac == 43) {
				index87 = i;
				index87Exists = true;
			}
		}
		try {
			if (index87Exists == false) {
				throw new Exception();
			} else {
				System.out.println("$87.43 is found at index " + singlyLinkedListObj.findCurrency(dollarArray[index87]));
			}
		} catch (Exception e) {
			System.out.println("Record for $87.43 is not found");
		}

		//search for $44.56
		//traversing dollarArray to find currency = 44.56
		int index44 = 0;
		boolean index44Exists = false;
		for (int i = 0; i < dollarArray.length; i++) {
			if (dollarArray[i].currencyWhole == 44 && dollarArray[i].currencyFrac == 56) {
				index44 = i;
				index44Exists = true;
			}
		}

		try {
			if (index44Exists == false) {
				throw new Exception();
			} else {
				System.out.println("$44.56 is found at index " + singlyLinkedListObj.findCurrency(dollarArray[index44]));
			}
		} catch (Exception ex) {
			System.out.println("Record for $44.56 is not found");
		}

		//remove node containing $111.22
		//traversing dollarArray to find currency = $111.22
		int index111 = 0;
		boolean index111Exists = false;
		for (int i = 0; i < dollarArray.length; i++) {
			if (dollarArray[i].currencyWhole == 111 && dollarArray[i].currencyFrac == 22) {
				index111 = i;
				index111Exists = true;
			}
		}

		try {
			if (index111Exists == false) {
				throw new Exception();
			} else {
				System.out.println("Removing the node containing $111.22");
				singlyLinkedListObj.removeCurrency(dollarArray[index111]);
			}
		} catch (Exception exc) {
			System.out.println("Record for $111.22 is not found");
		}

		//remove node at index 2
		System.out.println("Removing the node at index 2");
		singlyLinkedListObj.removeCurrency(2);

		//print list contents
		singlyLinkedListObj.printList();

		//add next 4 objects (#9-12) such that their index in linked list is indexInArray % 5
		for (int i = 8; i <= 11; i++) {
			int llIndex = i % 5;
			singlyLinkedListObj.addCurrency(llIndex, dollarArray[i]);
		}

		//remove 2 objects at indices (countCurrency % 6) and (countCurrency / 7)
		int countC = singlyLinkedListObj.countCurrency();
		singlyLinkedListObj.removeCurrency(countC % 6);
		singlyLinkedListObj.removeCurrency(countC / 7);

		singlyLinkedListObj.printList();
	}

	//Lab3Main testinstance= new Lab3Main();
	//testinstance.testStack();
	//testinstance.testQueue();



	/*
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

	} */
}