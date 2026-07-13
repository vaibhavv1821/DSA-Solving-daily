public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode one = headA;
        ListNode two = headB;

            while (one != two) {
                if(one == null) {
            one = headB;
            } else {
                one = one.next;
            }
            if (two == null) {
                two = headA;
                } else {
                    two = two.next;
        }
}
                return one;
        }
    }


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna