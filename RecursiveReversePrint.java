class Node{
	int data;
	Node next;
}

/**
 * Reverse LinkedList using recursion
 * 
 * @author gouravrusiya
 *
 */
public class RecursiveReversePrint {
	void RecursiveReversePrint(Node head) {

		if (head == null)
			return;

		else {
			RecursiveReversePrint(head.next);
			System.out.println(head.data);
		}
	}
}