package circularLL;

class CircularLinkedList {
	int length;
	CircularLLNode tail;
	
	public void addNodeAtStart(int data){
		CircularLLNode temp = new CircularLLNode();
		temp.setData(data);
		if(this.tail==null){
			tail=temp;
			tail.setNext(tail);
		}
		else{
			
			temp.setNext(tail.getNext());
			tail.setNext(temp);
		}
		length++;
		
	}
	
	public void displayCircularLL(){
		CircularLLNode temp = new CircularLLNode();
		temp=tail.getNext();
		while(temp!=tail){
			System.out.print(temp.getData()+"->");
			temp=temp.getNext();
		}
		System.out.print(tail.getData()+"(head)");
	}
	public void deleteLastNode(){
		CircularLLNode temp= new CircularLLNode();
		temp=tail.getNext();
		while(temp.getNext()!=tail){
			temp=temp.getNext();
		}
		temp.setNext(tail.getNext());
		tail=temp;
		length--;
	}
	
	public int removerFirstOccurenceOfElement(int data){
		CircularLLNode currentNode= new CircularLLNode();
		CircularLLNode previousNode= new CircularLLNode();
		currentNode=tail.getNext();
		previousNode=tail;
		if(tail.getData()==data){
			deleteLastNode();
			return 1;
		}
		else{
			while(currentNode!=tail){
				if(currentNode.getData()==data){
					previousNode.setNext(currentNode.getNext());
					currentNode=null;
					return 1;
				}
				previousNode=currentNode;
				currentNode=currentNode.getNext();
			}
		}
		return 0;
	}
	
	public boolean removeAllOccurences(int data){
		CircularLLNode currentNode= new CircularLLNode();
		CircularLLNode previousNode= new CircularLLNode();
		currentNode=tail.getNext();
		previousNode=tail;
		boolean flag=false;
		if(tail.getData()==data){
			deleteLastNode();
			flag=true;
		}
		
		while(currentNode!=tail){
			if(currentNode.getData()==data){
				previousNode.setNext(currentNode.getNext());
				flag=true;
				currentNode=currentNode.getNext();
			}
			else{
				previousNode=currentNode;
				currentNode=currentNode.getNext();
			}
		}
		return flag;
		
	}
}
