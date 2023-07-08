package LinkedList;

public class deleteMiddle {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static ListNode deleteMiddle1(ListNode head) {
        ListNode middle = findMiddle(head);
        ListNode temp = head;

        while(temp != middle){
            temp = temp.next;
        }
        if(temp.next != null){
            temp.next = temp.next.next;
        }
        return head;

    }
    public static ListNode findMiddle(ListNode head){
        ListNode f = head;
        ListNode s = head;

        while(f.next != null && f.next.next != null){
            f = f.next.next;
            s = s.next;
        }
        return s;
    }


    public static void main(String[] args) {
        deleteMiddle dm = new deleteMiddle();


    }
}
