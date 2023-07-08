package LinkedList;

public class reverseRecursion {

    Node head;
    Node tail;
    int size;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
    public void reverse(Node node){
        if (node == tail){
            head = tail;
            return;
        }

        reverse(node.next);
        tail.next = node;
        tail.next = null;


    }
    public static void main(String[] args) {

    }
}
