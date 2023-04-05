 public static int node_finding(SinglyLinkedListNode head, int N) {
        int len = 0;
        
        SinglyLinkedListNode curr = head;
        while(curr != null){
            curr = curr.next;
            len++;
        }
        
        int x = len - N;
        
        curr = head;
        for(int  i = 0; i < x; i++){
            curr = curr.next;
        }
        
        return curr.data;
    }