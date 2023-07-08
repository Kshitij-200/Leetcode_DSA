package LinkedList;

public class linkedlistcycle2 {
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

    public static int length(Node head){
        Node slow = head;
        Node fast = head;

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

    public static Node detectCycle(Node head){
        int length = 0;


        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow){
                length = length(slow);
                break;
            }
        }

        if (length == 0){
            return null;
        }

        Node f = head;
        Node s = head;

        while (length > 0){
            s = s.next;
            length--;
        }

        while (f != s){
            f = f.next;
            s = s.next;
        }
        return s;
    }

    public static void main(String[] args) {

    }
}
