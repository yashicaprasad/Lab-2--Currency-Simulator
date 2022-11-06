
public class LinkNode {
	private Currency data;
	private LinkNode next;
	
	/*
	purpose: get data for Currency object data and get LinkNode object next 
	pre: N/A 
	post: N/A 
	return: data 
	
	pseudocode: 
	return data;
	*/
	
	/*
	purpose: set data for Currency object data and get LinkNode object next 
	pre: Currency or LinkNode object
	post: sets this.data = data 
	return: NA  
	
	pseudocode: 
	this.data = data; 
	
	*/
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
