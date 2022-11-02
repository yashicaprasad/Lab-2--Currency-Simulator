
public class Lab3Main {
	public static void main(String[] args) {
		//Testing LinkNode
		Currency b = new Dollar(11.75);
		Currency c = new Dollar(12.50);
		Currency d = new Dollar(10.50);
		Currency e = new Dollar(13.47);
		Currency f = new Dollar(9.33);
		Currency g = new Dollar(7.12);
//		LinkNode test0 = new LinkNode(c);
//		LinkNode test1 = new LinkNode(d);
		//test0.next = test1;
		
		
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
