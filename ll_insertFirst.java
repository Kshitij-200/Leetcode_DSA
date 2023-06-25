package LinkedList;

public class ll_insertFirst {
    Node head;
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

    public void addFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void addLast(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void addMiddle(int data, int index){
        if (index == 0){
            addFirst(data);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++){
            temp = temp.next;
        }
        Node node = new Node(data, temp.next);
        temp.next = node;
    }

    public int deleteFirst(){
        int data = head.data;
        head = head.next;
        return data;
    }

    public void  deleteMiddle(int index){
        Node temp = head;
        for (int i = 1; i < index ; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        ll_insertFirst iff = new ll_insertFirst();
        iff.addFirst(20);
        iff.addFirst(21);
        iff.addFirst(25);
        iff.addFirst(26);
        iff.addFirst(28);
        iff.addFirst(30);
        iff.addFirst(100);
        iff.addLast(110);
        iff.addMiddle(120,3);

        iff.deleteFirst();

        iff.printList();
        iff.deleteMiddle(3);
        iff.printList();
    }

}
