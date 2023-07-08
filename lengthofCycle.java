package LinkedList;

public class lengthofCycle {
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

    public int length(Node head){
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow){

                Node temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                }while (temp != slow);

                return length;
            }
        }
        return 0;
    }
    public static void main(String[] args) {

    }
}
