 static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {
        
        SinglyLinkedListNode curr = new SinglyLinkedListNode(data);
        if(head == null){
            head = curr;
        }
        else{
            curr.next = head;
            head = curr;
        }
        
        return head;
        
    }