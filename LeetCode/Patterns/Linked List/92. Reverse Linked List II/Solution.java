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
    public ListNode reverseBetween(ListNode head, int left, int right) {
     ListNode leftnode = head;
ListNode rightnode = head;

for (int i = 1; i < left; i++) {
    leftnode = leftnode.next;
}

for (int i = 1; i < right; i++) {
    rightnode = rightnode.next;
}
      ListNode temp = new ListNode();
      temp.val = leftnode.val;
      leftnode.val=rightnode.val;
      rightnode.val=temp.val;  
      return head;
    }
}