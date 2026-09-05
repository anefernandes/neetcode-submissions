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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode current = head;
        ListNode prev = null; //reverse node

        while(current != null){ 
            ListNode temp = current.next;
            current.next = prev; //link the reverse nodes
            prev = current; //make the reverse nodes
            current = temp;
        }

        return prev;
    }
}

/*
Logical:
        current.next = prev (2 -> 1 -> 0 -> null)
        prev = current (3 -> 2 -> 1 -> 0 -> null)
        current = old next

*/