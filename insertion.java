package LinkedList;

public class insertion {

    private Node head;
    private Node tail;
    private int size;
    public insertion(){
        this.size = 0;
    }

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

    public void insert_middle(int data, int index){
        if (index == 0){
            insertion_beg(data);
            return;
        }
        if (index == size){
            insert_end(data);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node node = new Node(data, temp.next);
        temp.next = node;
        size++;
    }

    public void insert_end(int data){
        if (tail == null){
            insertion_beg(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;
    }
    void insertion_beg(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }
        size++;
    }

    int deleteFirst(){
        int data = head.data;
        head = head.next;

        if (head == null){
            tail = null;
        }
        size--;
        return data;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++){
             node = node.next;
        }
        return node;
    }

    public Node find(int value){
        Node node = head;
        while (node != null){
            if (node.data == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    int deleteLast(){
        Node secondlast = get(size - 2);
        int data = tail.data;
        tail = secondlast;
        tail.next = null;
        return data;
    }

    int deleteMiddle(int index){
        if (index == 0){
            return deleteFirst();
        }
        if (index == size - 1){
            return deleteLast();
        }

        Node prev = get(index - 1);
        int data = prev.next.data;

        prev.next = prev.next.next;
        return data;
    }

    public void printList(){
         Node temp = head;
         while (temp != null){
             System.out.print(temp.data + " -> ");
             temp = temp.next;
         }
        System.out.println("End");
    }
    public static void main(String[] args) {
        insertion ins = new insertion();
        ins.insertion_beg(5);
        ins.insertion_beg(4);
        ins.insertion_beg(65);
        ins.insertion_beg(8);
        ins.insertion_beg(9);
        ins.insert_end(99);
        ins.printList();
        System.out.println(ins.deleteFirst());
        ins.printList();

        System.out.println(ins.deleteLast());
        ins.printList();

        System.out.println(ins.deleteMiddle(2));
        ins.printList();


    }
}
