
public class Lab3Main {
	public static void main(String[] args) {
		//Testing LinkNode
		Currency c = new Dollar(12.50);
		Currency d = new Dollar(10.50);
		LinkNode test0 = new LinkNode(c);
		LinkNode test1 = new LinkNode(d);
		test0.next = test1;
		
		System.out.println("Print: " + test0.data.currencyWhole);
		System.out.println("Print: " + test1.data.currencyWhole);
	}
}
