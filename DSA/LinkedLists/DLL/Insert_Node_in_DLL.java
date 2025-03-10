package DSA.LinkedLists.DLL;

class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

public class Insert_Node_in_DLL {
    static boolean searchKey(int n, Node head, int key) {
        while(head != null){
            if(head.data == key) return true;
            
            head = head.next;
        }
        
        return false;
    }
}