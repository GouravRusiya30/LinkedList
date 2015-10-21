package singlyLikedList;

public class linkedListAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode newNode = new ListNode(1);
		linkedListAll list = new linkedListAll();
		
		// Testing all the methods
		
		// Insertion at End
		newNode = list.addAtEndList(newNode,2);
		newNode = list.addAtEndList(newNode,3);
		newNode = list.addAtEndList(newNode,4);
		
		// Insertion at Begin
		newNode = list.addAtBegin(newNode, 0);
		
		// Insertion at position
		newNode = list.addAtPosition(newNode, 6, 3);
		
		list.traverseList(newNode);
		//System.out.println("Length of List : "+list.lengthOfList(newNode));
		
		newNode = list.delHeadNode(newNode);
		list.traverseList(newNode);
		
		newNode = list.delLastNode(newNode);
		list.traverseList(newNode);
		//System.out.println("Length of List : "+list.lengthOfList(newNode));
		
		newNode = list.delPositionNode(newNode, 3);
		list.traverseList(newNode);
		
		//newNode = list.reverseList(newNode);
		//list.traverseList(newNode);
		
		//newNode = list.clear(newNode);
		//list.traverseList(newNode);
		
		ListNode matchNode = new ListNode(6);
		newNode = list.removeMatched(newNode, matchNode);
		list.traverseList(newNode);
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
		if(head == null)
		{
			head.setData(data);
			return head;
		}
		
		ListNode currentHead = head;
		ListNode nextNode = new ListNode(data);
		
		// Traverse till the last node
		while(currentHead.getNext()!=null){
			currentHead = currentHead.getNext();
		}
		
		currentHead.setNext(nextNode);			// Assign next pointer of current node to newNode
		nextNode.setNext(null);					// Assign null as next pointer to newNode
		
		return head;
	}
	
	// Insert at the begin of the linked list
	public ListNode addAtBegin(ListNode head, int data){
		
		ListNode currentHead = head;
		ListNode newNode = new ListNode(data);	
		
		newNode.setNext(currentHead);			// Update the next pointer of newNode to the currentHead
		
		return newNode;							// Now newNode is updated head of the list to return
	}
	
	// Insert at any specific position in linked list
	public ListNode addAtPosition(ListNode head, int data, int position){
		if(head == null)
		{
			head.setData(data);
			return head;
		}
		
		ListNode tempHead = head;				// To save head in a temp node
		ListNode currentHead = head;
		
		ListNode newNode = new ListNode(data);
		int i = 1;
		
		// Traversing till the position
		while(i<position-1){
			currentHead = currentHead.getNext();
			i++;
		}
		
		newNode.setNext(currentHead.getNext()); // Assign newNode's next pointer to current Node's next pointer
		currentHead.setNext(newNode);			// Assign current node's next pointer to newNode
		
		return tempHead;						// return saved temp node
	}
	
	// Delete first node from the linked list
	public ListNode delHeadNode(ListNode head){
		ListNode newHead = head.getNext();		// Assign new head as currentHead's next pointer
		head.setNext(null);						// Only assign head node's next pointer to null
		
		return newHead;							// return new head
	}
	
	// Delete last node from the linked list
	public ListNode delLastNode(ListNode head){
		ListNode currentHead = head;
		ListNode secondLastNode = null;
		
		while(currentHead.getNext()!=null){
			secondLastNode = currentHead;				// Updating secondLastNode in every iteration
			currentHead = currentHead.getNext();
		}
		
		secondLastNode.setNext(null);					// Assign secondLastNode to null to set it as last node 
		
		return head;
	}
	
	// Delete from position in linked list
	public ListNode delPositionNode(ListNode head, int position){
		ListNode tempHead = head;				// To save head in a temp node
		ListNode currentHead = head;
		
		int i = 1;
		
		// Traversing till the position
		while(i<position-1){
			currentHead = currentHead.getNext();
			i++;
		}
		
		currentHead.setNext(currentHead.getNext().getNext());
		return tempHead;
	}
	
	// Reverse the linked list
	public ListNode reverseList(ListNode head){
		if(head == null)
		{
			return head;
		}
		
		ListNode tempNode = head.getNext();
		ListNode currentNode = head.getNext();
		head.setNext(null);
		
		tempNode.setNext(head);
		
		while(currentNode.getNext() != null){
			tempNode = currentNode.getNext();
			//System.out.println(tempNode.getData());
			tempNode.setNext(currentNode);
			
			
			currentNode = currentNode.getNext();
			//System.out.println(currentNode.getData());
		}
		return tempNode;
	}
	
	// Remove everything from the list
	public ListNode clear(ListNode head){
		head = null;
		
		return head;
	}
	
	// Remove a node matching the specified node from the list
	public synchronized ListNode removeMatched(ListNode head, ListNode node){
		if(head == null)
			return head;
		
		if(node.equals(head))
		{
			head = head.getNext();
			return head;
		}
		
		ListNode tempHead = head;
		ListNode currentHead = head;
		
		while(!(currentHead.equals(node))){
			currentHead = currentHead.getNext();
		}
		
		currentHead.setNext(currentHead.getNext().getNext());
		return tempHead;
	}
}
