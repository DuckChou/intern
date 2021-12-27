public class Solution {
    static class ListNode{
        int num;
        ListNode next;
        public ListNode(int num) {
            this.num=num;
        }
        public ListNode(int num,ListNode next){
            this.num=num;
            this.next=next;
        }
    }

    public ListNode reverseList(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;

    }
}
