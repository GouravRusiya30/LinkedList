package singlyLinkedList;

public class linkedListAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode newNode = new ListNode(1);
		linkedListAll list = new linkedListAll();
		
		newNode = list.addAtEndList(newNode,2);	
		newNode = list.addAtEndList(newNode,3);
		newNode = list.addAtEndList(newNode,4);
		
		newNode = list.addAtBegin(newNode, 0);
		
		newNode = list.addAtPosition(newNode, 6, 3);
		list.traverseList(newNode);
		
		int len = list.lengthOfList(newNode);
		System.out.println("Length of List : "+len);
	}
	
	
	// Length of the linked list
	public int lengthOfList(ListNode head){
		ListNode currentHead = head;
		int len = 0;
		
		while(currentHead!=null){
			currentHead = currentHead.getNext();
			len++;
		}
		return len;
	}
	// Traversing the linked list
	public void traverseList(ListNode head){
		ListNode currentHead = head;
		
		while(currentHead!=null){
			System.out.print(currentHead.getData()+" -> ");
			currentHead = currentHead.getNext();
		}
		System.out.println(currentHead);
	}
	
	// Insert at the end of the Linked List
	public ListNode addAtEndList(ListNode head, int data){
		ListNode currentHead = head;
		ListNode nextNode = new ListNode(data);
		
		while(currentHead.getNext()!=null){
			currentHead = currentHead.getNext();
		}
		
		currentHead.setNext(nextNode);
		nextNode.setNext(null);
		
		return head;
	}
	
	// Insert at the begin of the linked list
	public ListNode addAtBegin(ListNode head, int data){
		ListNode currentHead = head;
		ListNode newNode = new ListNode(data);
		
		newNode.setNext(currentHead);
		
		return newNode;
	}
	
	// Insert at any specific position in linked list
	public ListNode addAtPosition(ListNode head, int data, int position){
		ListNode tempHead = head;
		ListNode currentHead = head;
		
		ListNode newNode = new ListNode(data);
		int i = 1;
		
		while(i<position){
			currentHead = currentHead.getNext();
			i++;
		}
		
		newNode.setNext(currentHead.getNext());
		currentHead.setNext(newNode);
		
		return tempHead;
	}
	
	
}
