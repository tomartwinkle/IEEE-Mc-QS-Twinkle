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
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return head;
        ListNode i = head;
        ListNode j;
        ListNode minNode;
        for (i = head; i != null; i = i.next) {
            minNode = i;
            for (j = i.next; j != null; j = j.next) {
                if (j.val < minNode.val) {
                    minNode = j;
                }
            }
            if (minNode != i) {
                int temp = i.val;
                i.val = minNode.val;
                minNode.val = temp;
            }
        }
        return head;
    }
}
