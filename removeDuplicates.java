package LinkedList;

public class removeDuplicates {
    static Node head;
    static Node tail;
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

    public static void remove_duplicates(){
        Node node = head;
        while (node.next != null){
            if (node.data == node.next.data){
                node.next = node.next.next;
            }
            else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;

    }
    public static void main(String[] args) {

    }
}
