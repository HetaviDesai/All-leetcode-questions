class Solution {
    public ListNode removeNodes(ListNode head) {
        head=reverseList(head);
       
int max = head.val;
ListNode previous = head;
ListNode current = head.next;
while (current != null) {

    if (current.val >= max) {
        max = current.val;
        previous = current;
    } 
    else {
        previous.next = current.next;
    }

    current = current.next;
}
head = reverseList(head);

return head;
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;   
        ListNode curr = head; 
        
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;             
            prev = curr;                  
            curr = nextNode;             
        }
        
        return prev;
    }
}