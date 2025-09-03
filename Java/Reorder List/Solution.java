/*You are given the head of a singly linked-list. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln
Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
You may not modify the values in the list's nodes. Only nodes themselves may be changed.

 

Example 1:


Input: head = [1,2,3,4]
Output: [1,4,2,3]
Example 2:


Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]
 

Constraints:

The number of nodes in the list is in the range [1, 5 * 104].
1 <= Node.val <= 1000*/
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
        ListNode current = head;
        ListNode rightSide = head;
        
        int length=0;
        while(current!=null){
            length++;
            current=current.next;
        }

        int middle = length/2;
        ListNode middleNode=head;

        for(int i=0;i<middle;i++){
            middleNode=middleNode.next;
        }

        ListNode newHead=null;
        ListNode currentForReversing = middleNode;
        while(currentForReversing!=null){
            ListNode tempNext= currentForReversing.next;
            currentForReversing.next=newHead;
            newHead=currentForReversing;
            currentForReversing=tempNext;
        }

        ListNode firstHead=head;
        ListNode secondHead=newHead;
        int test=0;
        while(secondHead!=null && firstHead!=null){
            
            ListNode firstHeadNext = firstHead.next;
            ListNode secondHeadNext = secondHead.next;

            firstHead.next=secondHead;
            secondHead.next=firstHeadNext;

            firstHead=firstHeadNext;
            secondHead=secondHeadNext;
            test++;

        }

        if(firstHead!=null){
            firstHead.next=null;
        }
        
    }
}
