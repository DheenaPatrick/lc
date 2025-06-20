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
    public boolean isPalindrome(ListNode head) {
        boolean res = true;
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode curr = slow;
        ListNode prev = null;
        ListNode temp = curr;


    while(curr!=null)
    {
        temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
    }
ListNode p1 = head;
ListNode p2 = prev;
    while(p2!=null)
    {
        if(p1.val!=p2.val)
        {
            res=false;
            break;
        }
        p1 = p1.next;
        p2 = p2.next;

    }
    return res;
        


        
    }
}