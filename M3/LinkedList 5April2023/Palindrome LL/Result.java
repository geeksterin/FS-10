class Result {

    /*
     * Complete the 'palindromic' function below.
     *
     * The function accepts INTEGER_SINGLY_LINKED_LIST List as parameter.
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    
    public static SinglyLinkedListNode middle_node(SinglyLinkedListNode head) {
        SinglyLinkedListNode slow = head;
        SinglyLinkedListNode fast = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;

    }
    
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
    
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        
        SinglyLinkedListNode c1 = head1;
        SinglyLinkedListNode c2 = head2;
        
        while(c1 != null && c2 != null){
            if(c1.data != c2.data)
                return false;
            
            c1 = c1.next;
            c2 = c2.next;
            
        }
        return true;
    }

    public static void palindromic(SinglyLinkedListNode head) {
    // Write your code here
        SinglyLinkedListNode mid = middle_node(head);
        SinglyLinkedListNode nH = mid.next;
        
        nH = reverse(nH);
        
        boolean ans = compareLists(head, nH);
        if(ans){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        

    }

}