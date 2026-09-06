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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        
        ListNode counting = head;
        int length = 0;

        while(counting != null){
            length++;
            counting = counting.next;
        }

        ListNode first = head;
        ListNode prev = null;
        int mid = (length + 1) / 2;

        //find the half  
        for(int index = 0; index < mid; index++){
            prev = first;
            first = first.next;
        }
        //split the first list
        prev.next = null;
        
        //split the second list and reverse
        ListNode second = null;
        for(int index = mid; index < length; index++){
            ListNode temp = first.next;
            first.next = second;
            second = first;
            first = temp;
        }
        
        //reorder list using the two splited
        ListNode response = head;

        while (second != null) {
            ListNode firstNext = response.next;
            ListNode secondNext = second.next;

            response.next = second;
            second.next = firstNext;

            response = firstNext;
            second = secondNext;
        }
    }
}
/*
n = 4
/2
0 to 1
1 to 3

Split the node in two
0..n/2 will recieve 1
n/2..last will recieve 2
response will recieve
response.node1
response.node2

*/
