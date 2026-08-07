package linkedList;

// Node class for the linked list 
class Node {
    int data;
    Node next;

    Node(int d){
        data = d;
        next = null;
    }
}

public class traversal {
    public static void main(String args[]){

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

    }

    public static void traverse(){
        
    }
}
