package LinkedList;

public class reverseIterative {
    Node head;
    int size;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void reverse(){
        if (size < 2){
            return;
        }

        Node prev = null;
        Node pres = head;
        Node next = pres.next;

        while (pres != null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if (next != null){
                next = next.next;
            }
        }
        head = prev;
    }
    public static void main(String[] args) {

    }
}
