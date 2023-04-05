SinglyLinkedListNode slow = head;
        SinglyLinkedListNode fast = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow.data;