package singlyLikedList;

//import java.util.LinkedList;

public class linkedListAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode newNode = new ListNode(14);
		
		//traverseList(newNode);
		
		addAtEndList(newNode,2);
		addAtEndList(newNode,3);
	}
	
	// Traversing the linked list
	public static void traverseList(ListNode head){
		ListNode currentHead = head;
		
		while(currentHead!=null){
			System.out.println(currentHead.data);
			currentHead = currentHead.getNext();
		}
	}
	
	public static void addAtEndList(ListNode head, int data){
		ListNode currentHead = head;
		ListNode nextNode = new ListNode(data);
		System.out.print(currentHead.data);
		System.out.print("->");
		
		while(currentHead.getNext()!=null){
			//System.out.print(currentHead.data);
			currentHead = currentHead.getNext();
		}
		
		currentHead.setNext(nextNode);
		nextNode.setNext(null);
		System.out.print(nextNode.data);
		System.out.print("->" + nextNode.getNext());
		System.out.println("");
	}
}
