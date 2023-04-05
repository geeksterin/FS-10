public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        if(position == 0){
            SinglyLinkedListNode save = head.next;
            head.next = null;
            head = save;
            return head;
        }
        SinglyLinkedListNode curr = head;
        for(int i = 0; i < position-1; i++){
            curr = curr.next;
        }
        SinglyLinkedListNode save = curr.next.next;
        curr.next.next = null;
        curr.next = save;
        
        return head;
        
    }