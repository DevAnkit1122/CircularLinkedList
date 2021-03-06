//Class to perform operations on Linked list
/*conatins two fields: 
 * 	length- number of nodes in linked list.updated after every operation on linked list
 * 	head- 	the current starting node of the linked list
 */
class LinkedList {
	int length;
	LinkNode head;
	/*
	 * Adds a node at beginning of linked list
	 */
	public void addNodeAtStart(int data){
		//tempNode is the temporary object of LinkNode type tp create a node
		LinkNode tempNode= new LinkNode();
		tempNode.setData(data);
		//tempNode points to head.Thus added before head.
		tempNode.setNext(head);
		//tempNode becomes the head
		head=tempNode;
		length++;
	}
	/*
	 * Adds a node at end of linked list
	 */
	public void addNodeAtEnd(int data){
		//tempNode is the temporary object of LinkNode type tp create a node
		LinkNode tempNode= new LinkNode();
		tempNode.setData(data);
		LinkNode currentNode,nextNode;
		
		currentNode=head;
		//traverse to the last node in the following for loop
		while(currentNode.getNext()!=null)
			currentNode=currentNode.getNext();
		//add the temp node reference to the last Node
		currentNode.setNext(tempNode);
		/*for(currentNode=head;(nextNode=currentNode.getNext())!=null;currentNode=nextNode);
		currentNode.setNext(tempNode);*/
		length++;
	}
	
	/*
	 * Adds a node at given of linked list
	 */
	public void addAtPosition(int data,int postion){
		//incase start of linked list
		if(postion==0){
			addNodeAtStart(data);
		}
		//incase end of linked list
		else if(postion==length){
			addNodeAtStart(data);
		}
		//incase position doesnt exists
		else if(postion<0 || postion>length){
			System.out.println("invalid postion not allowed");
		}
		//traverse to the postion node
		else{
			LinkNode tempNode=new LinkNode();
			tempNode.setData(data);
			LinkNode currentNode=head;
			//loop till position-1 to ensure we are at one node behind the designated position
			for(int i=1;i<postion-1;i++){
				currentNode=currentNode.getNext();	
			}
			tempNode.setNext(currentNode.getNext());
			currentNode.setNext(tempNode);
			length++;
		}
	}
	/*
	 * Delete the starting node of a Linked List
	 */
	public void deleteAtStart(){
		//temp to make sure we are actually deleting the node
		LinkNode temp=head;
		head=head.getNext();
		temp=null;
		length--;
	}
	
	/*
	 * Delete the last node of a Linked List
	 */
	public void deleteAtEnd(){
		LinkNode previousNode=head,currentNode=head;
		//two temp variables to keep track of current and previous node
		while(currentNode.getNext()!=null){
			previousNode=currentNode;
			currentNode=currentNode.getNext();
		}
		//set next value of previousNOde to link.
		//hence no connection to the last node
		previousNode.setNext(null);
		currentNode=null;
		length--;
	}
	/*
	 * Delete the last node of a Linked List
	 */
	public void deleteAtPostion(int position){
		if(position>length || position<0){
			System.out.println("node doesnt exist");
		}
		else if(position==0){
			deleteAtStart();
		}
		else if(position ==length){
			deleteAtEnd();
		}
		
		else{
			LinkNode currentNode,previousNode;
			currentNode=head;
			previousNode=head;
			//traverse to the position to be deleted.
			//keep track of the previous node of current node
			for(int i=1;i<position;i++){
				previousNode=currentNode;
				currentNode=currentNode.getNext();
			}
			//point previous to the next of current.
			//this removes connection beween previous and current, 
			//and establishes connection with node next to current with prvious
			previousNode.setNext(currentNode.getNext());
			//delete current node
			currentNode.setNext(null);
			currentNode=null;
			length--;
		}
	}
	public Integer nthNodeFromEnd(int position){
		if(position>length || position<0){
			return null;
		}
		LinkNode currentNode=head;
		int previousNodeOfActualNode=length-position;
		System.out.println();
		System.out.println(previousNodeOfActualNode);
		for(int i=0;i<previousNodeOfActualNode-1;i++){
			currentNode=currentNode.getNext();
		}
		return new Integer(currentNode.getNext().getData()) ;
	}
	
	public Integer nthNodeFromEndWithTwoPointers(int position){
		if(position>length || position<0){
			return null;
		}
		LinkNode firstPointer=head;
		LinkNode secondPointer=head;
		// First pointer moves only after the second pointer moves for first n positions;
		//by the time the second pointer reaches the last node, first pointer is at the nth node from last
		int secondPointerPositionCounter=1;
		while(secondPointer.getNext()!=null){
			
			secondPointer = secondPointer.getNext();
			secondPointerPositionCounter++;
			if(secondPointerPositionCounter>position){
				firstPointer=firstPointer.getNext();
			}
		}
		return firstPointer.getData();
	}
	/*
	 * Take two pointers one moving faster than other.
	 * Consider the following LL:
	 * 			*->*->*->*->*->*->*->*->*
	 * 						   |		|
	 * 						   ^-*<-*<-<
	 * 
	 * If a loop exists , then the fastPointer will out be able to get out of the loop(as it will never ncounter null
	 * And at some point both fast and slow pointer will be pointing to the same node.
	 * 
	 * To test for a positive scenario, overload addNode() with a LinkNode as parameter.
	 */
	public boolean checkIfLoopIsPresentInLL() {
		LinkNode slowPointer=head;
		LinkNode fastPointer=head;
		while(fastPointer!=null && fastPointer.getNext()!=null){
			fastPointer=fastPointer.getNext().getNext();
			slowPointer=slowPointer.getNext();
			if(slowPointer==fastPointer)
				return true;
		}
		return false;
	}
	
	public Integer findHeadOfLoop(){
		boolean loopExists=false;
		LinkNode slowPointer=head;
		LinkNode fastPointer=head;
		while(fastPointer!=null && fastPointer.getNext()!=null){
			fastPointer=fastPointer.getNext().getNext();
			slowPointer=slowPointer.getNext();
			if(slowPointer==fastPointer){
				loopExists=true;
				break;
			}
		}
		if(loopExists){
			slowPointer=head;
			while(slowPointer!=fastPointer){
				slowPointer=slowPointer.getNext();
				fastPointer=fastPointer.getNext();
			}
			return fastPointer.getData();
		}
		return null;
	}
	
	public LinkNode reverseLinkedList(){
		LinkNode current=head;
		LinkNode previous=null;
		while(current!=null){
			LinkNode next= current.getNext();
			current.setNext(previous);
			previous=current;
			current=next;
		}
		return previous;
	}
	
}
