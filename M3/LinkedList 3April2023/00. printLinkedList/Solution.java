 static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode tmp = head;
        while(tmp != null ){
            System.out.println(tmp.data);
            tmp = tmp.next;
        }

    }