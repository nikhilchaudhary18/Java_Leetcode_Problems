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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode prev = null;
        ListNode current = slow;

        while (current != null) {
            ListNode temp = current.next; 
            current.next = prev;          
            prev = current;              
            current = temp;               
        }
        ListNode cycle1 = head;
        ListNode cycle2 = prev;
        while(cycle2 != null){
            if(cycle1.val!=cycle2.val){
            return false;
        } 
        cycle1 = cycle1.next;
        cycle2 = cycle2.next;
        } return true;
        
    }
}