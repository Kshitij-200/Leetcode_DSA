package LinkedList;

public class doublyLL {
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
        }

        Node(int data, Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int data){
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void display_reverse(){
        Node last = null;
        Node node = head;

        while (node != null){
            last = node;
            node = node.next;
        }

        while (last != null){
            System.out.print(last.data + "->");
            last = last.prev;
        }
        System.out.println("START");
    }

    public void insertLast(int data){
        Node node = new Node(data);
         Node temp = head;
        if (head == null){
            node.prev = null;
            head = node;
            return;
        }
         while (temp.next != null){
             temp = temp.next;
         }

         temp.next = node;
         node.prev = temp;
         node.next = null;

    }

    public Node find(int data){
        Node node = head;
        while (node != null){
            if (node.data == data){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertMiddle(int aftervalue,int data){
        Node p = find(aftervalue);

        if (p == null){
            System.out.println("Not exist");
            return;
        }

        Node node = new Node(data);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null) {
            node.next.prev = node;
        }
    }

    public static void main(String[] args) {
        doublyLL ll = new doublyLL();
        ll.insertFirst(5);
        ll.insertFirst(7);
        ll.insertFirst(8);
        ll.insertFirst(9);
        ll.insertFirst(10);
        ll.insertLast(50);
        ll.insertLast(100);
        ll.insertMiddle(9,200);
        ll.display();
        ll.display_reverse();

    }
}
