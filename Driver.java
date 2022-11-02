
public class Driver {
	public static void main(String[] args) {
		//testing Queue

		Currency a = new Pound(12.34);
		Currency b = new Pound(34.56);
		Currency c = new Pound(34.45);

		Queue queueObj = new Queue();
		System.out.println("a");
		queueObj.enQueue(a);
		System.out.println("b");
		queueObj.enQueue(b);
		System.out.println("c");
		queueObj.enQueue(c);

		System.out.println(queueObj.dequeue());

		/*
		//Testing LinkNode
		Currency b = new Dollar(11.75);
		Currency c = new Dollar(12.50);
		Currency d = new Dollar(10.50);
		LinkNode test0 = new LinkNode(c);
		LinkNode test1 = new LinkNode(d);
		test0.next = test1;

		System.out.println("Print: " + test0.data.currencyWhole);
		System.out.println("Print: " + test1.data.currencyWhole);

		//Testing SinglyLinkedList
		SinglyLinkedList a = new SinglyLinkedList();
		a.start = test0;
		a.end = test1;
		System.out.println("Print a: ");
		a.printList();
		a.addCurrency(2, b);
		System.out.println("\n"+ "Print a: ");
		a.printList();

		System.out.println("\n Find Currency: " + a.findCurrency(c));
		a.printList();

		System.out.println("\n Get Currency: " + a.getCurrency(0));
		a.printList();

		System.out.println("countCurrency: " + a.countCurrency());
		*/

	}
}
