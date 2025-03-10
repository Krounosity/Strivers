class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}

public class Find_length {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        int len = 0;
        
        while(head != null){
            len++;
            head = head.next;
        }
        
        return len;
    }
}