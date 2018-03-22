class Node {
     int data;
     Node next;
  }

void RecursiveReversePrint(Node head) {
    
    if(head == null)
        return;
    
    else{
        RecursiveReversePrint(head.next);
        System.out.println(head.data);
    }
}
