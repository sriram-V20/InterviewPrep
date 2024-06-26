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
    public ListNode mergeTwoLists(ListNode temp1, ListNode temp2) {
        ListNode res = new ListNode(-1);
        ListNode dummy= res;

        while(temp1 != null && temp2 != null){
            if(temp1.val < temp2.val){
                dummy.next = temp1;
                dummy = dummy.next;
                temp1 = temp1.next;
            }else{
                dummy.next = temp2;
                dummy = dummy.next;
                temp2 = temp2.next;
            }
        }

        while(temp1 != null){
            dummy.next = temp1;
            dummy = dummy.next;
            temp1 = temp1.next;
        }

        while(temp2 != null){
            dummy.next = temp2;
            dummy = dummy.next;
            temp2 = temp2.next;
        }

        return res.next;
    }
}