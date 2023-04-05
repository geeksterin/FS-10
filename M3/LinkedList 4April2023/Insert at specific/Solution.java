 public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        SinglyLinkedListNode curr = llist;      // llist -> head
        SinglyLinkedListNode temp = new SinglyLinkedListNode(data);
        
        for(int i = 0; i < position-1; i++){
            curr = curr.next;
        }
        
        SinglyLinkedListNode save = curr.next;
        curr.next = temp;
        temp.next = save;
        return llist;

    }