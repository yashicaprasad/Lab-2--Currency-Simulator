
public class Lab3Main {
	public static void main(String[] args) {
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

		System.out.println("\n" + a.findCurrency(c));
		a.printList();
		
		System.out.println("\n" + a.getCurrency(0));
		a.printList();
	}
}
