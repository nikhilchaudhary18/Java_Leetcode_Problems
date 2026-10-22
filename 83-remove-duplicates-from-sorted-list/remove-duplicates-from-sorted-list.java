class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> set = new HashSet<>();

        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            if (set.contains(current.val)) {
                prev.next = current.next;
            } else {
                set.add(current.val);
                prev = current;
            }

            current = current.next;
        }

        return head;
    }
}