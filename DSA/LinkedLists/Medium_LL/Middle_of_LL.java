package DSA.LinkedLists.Medium_LL;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Middle_of_LL {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(slow != null && fast != null){
            if(fast.next == null) return slow;
            else if(fast.next.next == null) return slow.next;

            fast = fast.next.next;
            slow = slow.next;
        }

        return null;
    }
}
