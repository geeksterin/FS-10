 static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode dummy = new SinglyLinkedListNode(-1);
        
        SinglyLinkedListNode c1 = head1;
        SinglyLinkedListNode c2 = head2;
        SinglyLinkedListNode c = dummy;
        
        while(c1 != null && c2 != null){
            if(c1.data < c2.data ){
                c.next = c1;
                c1 = c1.next;
            }
            else{
                c.next = c2;
                c2 = c2.next;
            }
            
            c = c.next;
        }
        
        if(c1 != null){
            c.next = c1;
        }
        else{
            c.next = c2;
        }
        
        return dummy.next;

    }