class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 
public class Search_element {
    static boolean searchKey(int n, Node head, int key) {
        while(head != null){
            if(head.data == key) return true;
            
            head = head.next;
        }
        
        return false;
    }
}