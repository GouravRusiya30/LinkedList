/*
Delete without head pointer

You are given a pointer/ reference to the node which is to be deleted from the linked list of N nodes. 
The task is to delete the node. Pointer/ reference to head node is not given. 

Note: No head reference is given to you.
*/
class Node1
{
	int data ;
	Node1 next;
	Node1(int d)
	{
		data = d;
		next = null;
	}
}

public class RemoveNode {
	
	void deleteNode(Node1 node)
    {
         // Your code here
         Node1 prev = new Node1(0);
         while(node.next != null){
             int tempData = node.next.data;
             
             node.next.data = node.data;
             node.data = tempData;
             
             prev = node;
             node = node.next;
         }
         prev.next = null;
    }
}
