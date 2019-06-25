/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/
public class CycleDetection {
	
	boolean hasCycle(Node head) {
		
		if(head == null){
			return false;
		}
		
		Node slowptr = head;
		Node fastptr = head;

		while (fastptr != null && fastptr.next != null) {
			slowptr = slowptr.next;
			fastptr = fastptr.next.next;

			if (slowptr == fastptr)
				return true;
		}
		
		return false;
	}
}
