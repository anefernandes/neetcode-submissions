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
        List<ListNode> arrayNode = new ArrayList<>();
        ListNode current = head;

        //Add the nodes in the array
        while(current != null){
            arrayNode.add(current);
            current = current.next;
        }
        
        //Remove the node end of the list
        int nodeToRemove = arrayNode.size() - n;
        
        //edge case
        if(nodeToRemove == 0){
            return head.next;
        }

        arrayNode.get(nodeToRemove - 1).next = arrayNode.get(nodeToRemove).next;

        //return the list
        return head;
    }
}
/*

Without Array List.
[1,2,3,4,5,6,7,8,9,10], n = 4
1 - Reverse the node
2 - Remove the node end of the list
3 - put all values again

With ArrayList: 
1 - Add the nodes in the array
2 - Remove the node end of the list
How Remove: 
node to remove: size - n = 10 - 4 = 6
node 5.next = 6.next
return list node
*/