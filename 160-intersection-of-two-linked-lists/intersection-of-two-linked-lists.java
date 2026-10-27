/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1 = 0;
        int l2 = 0;

        ListNode tempA = headA;
        ListNode tempB = headB;

        while (tempA != null) {
            l1++;
            tempA = tempA.next;
        }

        while (tempB != null) {
            l2++;
            tempB = tempB.next;
        }

        int diff;

        if (l1 > l2) {
            diff = l1 - l2;

            while (diff > 0) {
                headA = headA.next;
                diff--;
            }
        } else {
            diff = l2 - l1;

            while (diff > 0) {
                headB = headB.next;
                diff--;
            }
        }

        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }

            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
}
