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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int l =0;
        ListNode node = head;

        while(node != null){
            l++;
            node = node.next;
        }
        int firstIdx = l-n;
        if(firstIdx == 0) return head.next;
        int counter =0;
        ListNode cur = head;
        ListNode prev = null;
        while(counter < firstIdx){
            prev = cur;
            cur = cur.next;
            counter++;
        }
        
        prev.next = cur.next;
            
        return head;

    }
}
