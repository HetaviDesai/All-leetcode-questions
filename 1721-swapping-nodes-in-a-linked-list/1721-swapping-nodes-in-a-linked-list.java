class Solution {
    public ListNode swapNodes(ListNode head, int k) {

        ListNode fast = head;
        for (int i = 1; i < k; i++) {
            fast = fast.next;
        }
        ListNode first = fast;
        ListNode second = head;
        while (fast.next != null) {
            fast = fast.next;
            second = second.next;
        }
        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;
    }
}