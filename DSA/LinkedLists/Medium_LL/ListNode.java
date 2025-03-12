package DSA.LinkedLists.Medium_LL;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Check_LL_Palindrome {
    public boolean isPalindrome(ListNode head) {
        // Find mid of LL
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        // Reversing the LL
        ListNode prev = null, saamne = null;
        while(slow != null){
            saamne = slow.next;
            slow.next = prev;
            prev = slow;
            slow = saamne;
        }

        // Checking for corresponding nodes in the first half of the LL and the second-and-reversed half of the LL
        ListNode first = head, second = prev;
        while(second != null){
               if(first.val != second.val) return false;
               first = first.next;
               second = second.next;
        }

        return true;
    }
}