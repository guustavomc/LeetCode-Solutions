/*You are given the head of a linked list.

Remove every node which has a node with a greater value anywhere to the right side of it.

Return the head of the modified linked list.

Example 1:

Input: head = [5,2,13,3,8]
Output: [13,8]
Explanation: The nodes that should be removed are 5, 2 and 3.
- Node 13 is to the right of node 5.
- Node 13 is to the right of node 2.
- Node 8 is to the right of node 3.

Example 2:

Input: head = [1,1,1,1]
Output: [1,1,1,1]
Explanation: Every node has value 1, so no nodes are removed.
 
Constraints:

The number of the nodes in the given list is in the range [1, 105].
1 <= Node.val <= 105*/
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
    public ListNode removeNodes(ListNode head) {
        ListNode newHead = null;
        ListNode current = head;
        while(current!=null){
            ListNode nextNode = current.next;
            current.next=newHead;
            newHead = current;
            current= nextNode;
        }
        ListNode current1=newHead;
        ListNode maxValue=newHead;
        while(current1!=null){
            if(current1.val< maxValue.val){
                maxValue.next=current1.next;
            }else{
                maxValue=current1;
            }
            current1=current1.next;
                
        }
        ListNode newHead1 = null;
        ListNode current2 = newHead;
        while(current2!=null){
            ListNode nextNode = current2.next;
            current2.next = newHead1;
            newHead1 = current2;
            current2= nextNode;
        }
        return newHead1;
    }
}
