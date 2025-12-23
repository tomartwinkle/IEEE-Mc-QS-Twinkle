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
import java.util.*;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        //my logic: Trying to solve by only traversing once. Put each traversed element into a hashset O(1) and as we keep traversing forward if the new element exists in hashset then delete and traverse till list ends.
        HashSet<Integer> set=new HashSet<>();
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            if(set.contains(curr.val)) {
                prev.next=curr.next;
            }
            else {
                set.add(curr.val);
                prev=curr;
            }
            curr=curr.next;
        }
        return head;
    }
}