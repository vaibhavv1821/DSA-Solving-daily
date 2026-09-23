public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode first = headA;
        ListNode sec = headB;

        while (first != sec) {

            if (first == null) {
                first = headB;
            } else {
                first = first.next;
            }

            if (sec == null) {
                sec = headA;
            } else {
                sec = sec.next;
            }
        }

        return first;
    }
}