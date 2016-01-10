package doublyLL;

class DoublyLinkedList {
	int length;
	DoublyLLNode head;
	
	public void displayStraight(){
		DoublyLLNode temp=this.head;
		while(temp!=null){
			System.out.print(temp.getData()+"<=>");
			temp=temp.getNext();
		}
		
	}
	
	public void addNodeAtStart(int data){
		  DoublyLLNode temp = new DoublyLLNode();
		  temp.setData(data);
		  temp.setNext(this.head);
		  if(head!=null){
			  head.setPrevious(temp);
		  }
		  head=temp;
		  length++;
	}
	public void addNodeAtEnd(int data){
		DoublyLLNode temp = new DoublyLLNode();
		temp.setData(data);
		DoublyLLNode currentNode=head;
		while(currentNode.getNext()!=null){
			currentNode=currentNode.getNext();
		}
		currentNode.setNext(temp);
		temp.setPrevious(currentNode);
		temp.setNext(null);
		length++;
	}
	public void insertAtPosition(int data,int position) {
		DoublyLLNode temp = new DoublyLLNode();
		temp.setData(data);
		DoublyLLNode currentNode= head;
		if(position>=0 && position<=length+1){
			if(position==0){
				this.addNodeAtStart(data);
			}
			else{
				for(int i=1;i<position-1;i++){
					currentNode=currentNode.getNext();
				}
				temp.setNext(currentNode.getNext());
				currentNode.setNext(temp);
				temp.setPrevious(currentNode);
				length++;
			}
		}
		else{
			System.out.println("Invalid position");
		}
	}
	
	public void deleteFirstNode(){
		DoublyLLNode temp= new DoublyLLNode();
		temp=head;
		head=head.getNext();
		temp=null;
		length--;
	}
	
	public void deleteLastNode(){
		DoublyLLNode currentNode= new DoublyLLNode();
		currentNode=head;
		while(currentNode.getNext()!=null){
			currentNode=currentNode.getNext();
		}
		currentNode.getPrevious().setNext(null);
		length--;
	}
	
	public void deleteAtPosition(int position){
		DoublyLLNode currentNode=head;
		if(position>=0 && position<=length){
			if(position==0){
				deleteFirstNode();
			}
			else if(position==length){
				deleteLastNode();
			}
			else{
				for (int i=1;i<position;i++){
					currentNode=currentNode.getNext();
				}
				currentNode.getPrevious().setNext(currentNode.getNext());
				currentNode.getNext().setPrevious(currentNode.getPrevious());
			}
		}
		else{
			System.out.println("invalid Postion");
		}
	}
	public void displayReverse(){
		DoublyLLNode currentNode=head;
		while(currentNode.getNext()!=null){
			currentNode=currentNode.getNext();
		}
		while(currentNode.getPrevious()!=null){
			System.out.print(currentNode.getData()+"<=>");
			currentNode=currentNode.getPrevious();
		}
	}
	
}
