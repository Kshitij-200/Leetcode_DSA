/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode f = head;
        ListNode s = head;
        ListNode e = head;

        while(f != null && f.next != null){
            f = f.next.next;
            s = s.next;
            if(f == s){
                while(e != s){
                    s = s.next;
                    e = e.next;
                }
                return e;
            }
        }
        return null;
    }
}