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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode();
        ListNode dum=dummy;
        ListNode curr1=list1;
        ListNode curr2=list2;
        while(curr1!=null&&curr2!=null){
            if(curr2.val>curr1.val){
                dum.next=curr1;
                dum=dum.next;
                curr1=curr1.next;
            }
            else{
                dum.next=curr2;
                dum=dum.next;
                curr2=curr2.next;
            }
        }
        if(curr1!=null){
            dum.next=curr1;
        }
        else{
            dum.next=curr2;
        }
        return dummy.next;
    }
}