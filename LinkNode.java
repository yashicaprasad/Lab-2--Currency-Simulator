
public class LinkNode {
	private Currency data;
	private LinkNode next;
	
	public Currency getData() {
		return data;
	}

	public void setData(Currency data) {
		this.data = data;
	}

	public LinkNode getNext() {
		return next;
	}

	public void setNext(LinkNode next) {
		this.next = next;
	}

	

    // Constructor
	public LinkNode(Currency d)
    {
        data = d;
        next = null;
    }

	public LinkNode() {
		// TODO Auto-generated constructor stub
	}
}
