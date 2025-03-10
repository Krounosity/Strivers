package DSA.LinkedLists.DLL;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}

public class Delete_Node_in_DLL {
    public Node deleteNode(Node head, int x) {
        
        if(x == 1){
            head = head.next;
            head.prev.next = null;
            head.prev = null;
            return head;
        }
        
        Node trav = head;
        while(x>1){
            trav = trav.next;
            x--;
        }
        
        if(trav.next == null){
            trav.prev.next = null;
            trav.prev = null;
        } else {
            trav.next.prev = trav.prev;
            trav.prev.next = trav.next;
            trav.next = null;
            trav.prev = null;
        }
        
        return head;
    }
}
