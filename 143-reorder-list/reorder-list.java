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
         
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode curr = slow.next;
        ListNode prev = null;
        ListNode temp = curr;
        slow.next = null;
        
    while(curr!=null)
    {
        temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;
    }
    ListNode p1 = head;
    ListNode p2 = prev;
    ListNode t2 = prev;
    ListNode t1 = head;
    while(t2!=null)
    {
      t1 = t1.next;
      t2 = t2.next;

      p1.next = p2;
      p2.next = t1;

      p1 = t1;
      p2 = t2;  
       

    }
    
    }
}