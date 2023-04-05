public static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode curr = head;
        
        while(curr != null){
            SinglyLinkedListNode save = curr.next;
            curr.next = prev;
            prev = curr;
            curr = save;
            
        }
        
        head = prev;
        return head;

    }