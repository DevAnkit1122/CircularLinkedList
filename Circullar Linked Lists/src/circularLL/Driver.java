package circularLL;

public class Driver {
	public static void main(String[] args) {
		CircularLinkedList cll = new CircularLinkedList();
		cll.addNodeAtStart(10);
		cll.addNodeAtStart(20);
		cll.addNodeAtStart(30);
		cll.addNodeAtStart(40);
		cll.addNodeAtStart(50);
		cll.addNodeAtStart(60);
		cll.addNodeAtStart(70);
		cll.addNodeAtStart(80);
		cll.displayCircularLL();
		System.out.println();
		cll.deleteLastNode();
		cll.displayCircularLL();
		
		if(cll.removerFirstOccurenceOfElement(30)==1){
			System.out.println();
			cll.displayCircularLL();
		}
		else{
			System.out.println("Element not present");
		}
		if(cll.removerFirstOccurenceOfElement(100)==1){
			System.out.println();
			cll.displayCircularLL();
		}
		else{
			System.out.println("Element not present");
		}
		if(cll.removerFirstOccurenceOfElement(20)==1){
			System.out.println();
			cll.displayCircularLL();
		}
		else{
			System.out.println("Element not present");
		}
		cll.addNodeAtStart(30);
		cll.addNodeAtStart(30);
		cll.addNodeAtStart(30);
		cll.addNodeAtStart(20);
		cll.addNodeAtStart(30);
		System.out.println();
		cll.displayCircularLL();
		if(cll.removeAllOccurences(30)){
			System.out.println();
			cll.displayCircularLL();
		}
		else{
			System.out.println("Element not present");
		}
	}
}
