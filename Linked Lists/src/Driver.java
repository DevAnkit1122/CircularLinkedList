//Driver class to test functionalities
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addNodeAtStart(20);
		ll.addNodeAtStart(40);
		LinkNode temp= ll.head;
		System.out.println();
		while(temp!=null){
			System.out.print(temp.getData()+"->");
			temp=temp.getNext();
		}
		ll.addNodeAtEnd(90);
		ll.addNodeAtEnd(80);
		ll.addNodeAtEnd(70);
		ll.addNodeAtEnd(60);
		ll.addNodeAtEnd(50);
		temp= ll.head;
		System.out.println();
		while(temp!=null){
			System.out.print(temp.getData()+"->");
			temp=temp.getNext();
		}
		ll.addAtPosition(25, 5);
		temp= ll.head;
		System.out.println();
		while(temp!=null){
			System.out.print(temp.getData()+"->");
			temp=temp.getNext();
		}
		ll.deleteAtStart();
		System.out.println();
		temp=ll.head;
		while(temp!=null){
			System.out.print(temp.getData()+"->");
			temp=temp.getNext();
		}
		
		ll.deleteAtEnd();
		System.out.println();
		temp=ll.head;
		while(temp!=null){
			System.out.print(temp.getData()+"->");
			temp=temp.getNext();
		}
		ll.deleteAtPostion(3);
		System.out.println();
		temp=ll.head;
		while(temp!=null){
			System.out.print(temp.getData()+"->");
			temp=temp.getNext();
		}
		System.out.println();
		ll.addNodeAtEnd(75);
		ll.addNodeAtEnd(85);
		ll.addNodeAtEnd(95);
		ll.addNodeAtEnd(105);
		temp=ll.head;
		while(temp!=null){
			System.out.print(temp.getData()+"->");
			temp=temp.getNext();
		}
		System.out.println(ll.length);
		Integer value= ll.nthNodeFromEnd(3);
		System.out.println();
		System.out.println(value.intValue());
		System.out.println(ll.nthNodeFromEndWithTwoPointers(3));
	}

}
