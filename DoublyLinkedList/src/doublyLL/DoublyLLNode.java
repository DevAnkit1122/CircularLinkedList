package doublyLL;

class DoublyLLNode {
	private DoublyLLNode previous;
	private int data;
	private DoublyLLNode next;

	public DoublyLLNode getPrevious() {
		return previous;
	}
	public void setPrevious(DoublyLLNode previous) {
		this.previous = previous;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DoublyLLNode getNext() {
		return next;
	}
	public void setNext(DoublyLLNode next) {
		this.next = next;
	}
	
}
