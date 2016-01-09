package doublyLL;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList ll= new DoublyLinkedList();
		ll.addNodeAtStart(40);
		ll.addNodeAtStart(30);
		ll.addNodeAtStart(20);
		ll.addNodeAtStart(10);
		ll.displayStraight();
		ll.addNodeAtEnd(50);
		ll.addNodeAtEnd(70);
		System.out.println();
		ll.displayStraight();
		
		ll.insertAtPosition(60, 7);
		System.out.println();
		ll.displayStraight();
		ll.deleteFirstNode();
		System.out.println();
		ll.displayStraight();
		ll.deleteLastNode();
		System.out.println();
		ll.displayStraight();
		ll.deleteAtPosition(3);
		System.out.println();
		ll.displayStraight();
	}

}
