package LinkedList;

public class bubbleSort_ll {
    ListNode head;
    ListNode tail;
    int size;
    class ListNode {
        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
        }
        ListNode(int data, ListNode next){
            this.data = data;
            this.next = next;
        }
    }
    public void bubbleSort(int row, int col){
        if (row == 0){
            return;
        }

//        if (col < row){
//            ListNode first = getMid(col);
//        }
    }

    public ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
    public static void main(String[] args) {

    }
}
