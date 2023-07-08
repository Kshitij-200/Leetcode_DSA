package LinkedList;

public class circularLL {
    Node head;
    Node tail;
    class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
        Node (int data){
            this.data = data;
        }
    }

    public void insertFirst(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node node = head;
        if (head != null){
            do {
                System.out.print(node.data + "->");
                node = node.next;
            }while (node != head);
        }
    }


//    public int delete(){
//
//    }
    public static void main(String[] args) {
        circularLL cll = new circularLL();
        cll.insertFirst(25);
        cll.insertFirst(2);
        cll.insertFirst(5);
        cll.insertFirst(55);
        cll.insertFirst(225);
        cll.display();

    }
}
