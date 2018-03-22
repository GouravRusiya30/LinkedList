class Node {
     int data;
     Node next;
  }
  
void ReversePrint(Node head) {
    Node prev = null;
    Node currHead = head;
    
    while(currHead != null){
        Node temp = currHead.next;
        currHead.next = prev;
        prev = currHead;
        currHead = temp;
    }
    
    while(prev!=null){
        System.out.println(prev.data);
        prev = prev.next;
    }
}
