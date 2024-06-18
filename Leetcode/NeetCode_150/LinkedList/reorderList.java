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
    public void reorderList(ListNode head) {
        ListNode slow=head,fast = head;

        while(fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow.next;
        slow.next = null;
        slow = head;
        ListNode reversedMid = reverse(mid);

        boolean flag = true;
        print(slow);
        print(reversedMid);
        ListNode res = new ListNode(-1);
        ListNode dummy = res;
        while( slow != null && reversedMid != null){
            if(flag){
                dummy.next = slow;
                dummy = dummy.next;
                slow = slow.next;
            }else{
                dummy.next = reversedMid;
                dummy = dummy.next;
                reversedMid = reversedMid.next;
            }
            flag = !flag;
        }

        while(slow != null){
            dummy.next = slow;
            dummy = dummy.next;
            slow = slow.next;
        }
        while(reversedMid != null){
            dummy.next = reversedMid;
            dummy = dummy.next;
            reversedMid = reversedMid.next;
        }
        head = res.next;
    }

    void print(ListNode head){
        while(head != null ){
            System.out.print(head.val+  ",");
            head = head.next;
        }
    }

    ListNode reverse(ListNode head){
        ListNode prev = null ,curr = head,next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
