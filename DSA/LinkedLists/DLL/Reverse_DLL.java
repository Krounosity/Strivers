package DSA.LinkedLists.DLL;

class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}

public class Reverse_DLL {
    public DLLNode reverseDLL(DLLNode head) {
        DLLNode front = head;
        DLLNode back = head;
        
        while(back.next != null){
            back = back.next;
        }
        
        while(front != back && front.prev != back){
            int temp = front.data;
            front.data = back.data;
            back.data = temp;
            
            front = front.next;
            back = back.prev;
        }
        
        return head;
    }
}