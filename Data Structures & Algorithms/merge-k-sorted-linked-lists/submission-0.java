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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy=new ListNode();
        ListNode dum=dummy;
        for(ListNode list:lists){
            ListNode curr=list;
            while(curr!=null){
                dum.next=new ListNode(curr.val);
                dum=dum.next;
                curr=curr.next;
            }
        }
        return sort(dummy.next);
    }
    public ListNode sort(ListNode head){
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode curr=head;
        int count=0;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
        curr=head;
        for(int i=0;i<count;i++){
            arr.add(curr.val);
            curr=curr.next;
        }
        Collections.sort(arr);
        ListNode dum=new ListNode(0);
        dum.next=head;
        ListNode d=dum;
        for(int i=0;i<arr.size();i++){
            d.next=new ListNode(arr.get(i));
            d=d.next;
        }
        return dum.next;
    }
}
