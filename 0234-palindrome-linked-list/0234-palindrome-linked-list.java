/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        int [] arr = linkedListToArray(head);
        int i = 0;
        int j = arr.length - 1;
        while(i <= j){
            if(arr[i] != arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public int[] linkedListToArray(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode current = head;

        while (current != null) {
            list.add(current.val);
            current = current.next;
        }

        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;
    }

    // public Node arrayToLinkedList(int[] arr) {
    //     Node head = null;

    //     for (int value : arr) {
    //         Node newNode = new Node(value);
    //         if (head == null) {
    //             head = newNode;
    //         } else {
    //             Node current = head;
    //             while (current.next != null) {
    //                 current = current.next;
    //             }
    //             current.next = newNode;
    //         }
    //     }

    //     return head;
    // }
}