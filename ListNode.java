package singlyLikedList;

// Type Declaration of singly linked list
public class ListNode {
	public int data;			//Contains data value
	private ListNode next;		//Pointer to next node
	
	// Constructor to initialize data
	public ListNode(int data){
		this.data = data;
	}
	
	// Assign data value
	public void setData(int data){
		this.data = data;
	}
	
	// To retrieve value of data
	public int getData(){
		return data;
	}
	
	// Assign value of next
	public void setNext(ListNode next){
		this.next = next;
	}
	
	// To retrieve value of next
	public ListNode getNext(){
		return this.next;
	}
}


