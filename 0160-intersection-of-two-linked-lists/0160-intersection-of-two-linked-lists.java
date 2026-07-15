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
    public int getSize(ListNode head){
        ListNode temp=head;
            int count = 0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
    }
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = getSize(headA);
        int sizeB = getSize(headB);
        if(sizeA>sizeB){
            int m = (sizeA-sizeB);
            for(int i=1;i<=m;i++){
                headA=headA.next;
            }
        }else{
            int n = (sizeB-sizeA);
            for(int i=1;i<=n;i++){
                headB=headB.next;
            }
        }
        while(headA!=null&&headB!=null){
            if(headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return  null;

    }
}