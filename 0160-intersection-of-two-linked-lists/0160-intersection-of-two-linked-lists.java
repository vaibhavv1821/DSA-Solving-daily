public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode first = headA;
        ListNode sec = headB;

        HashSet <ListNode> set =new HashSet<>();

        while(first!=null){
            set.add(first);
            first = first.next;
        } 
        while(sec != null){
            if(set.contains(sec)){
                return sec;
            }
            sec = sec.next;
        }
        return null;
    }
}