// Class to define a single node of a Linked List
// data contains the information to be stored.
// next contains the reference of the next node
class LinkNode{
	private int data;
	private LinkNode next;
	//getters and setters
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public LinkNode getNext() {
		return next;
	}
	public void setNext(LinkNode next) {
		this.next = next;
	}
	
}