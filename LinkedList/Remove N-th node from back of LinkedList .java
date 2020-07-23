//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head,slow=head;
        if(n==1&&head.next==null)
            return null;
        while(n!=0)
        {
            fast=fast.next;
            n--;
        }
        if(fast==null)
        {
            head=slow.next;
        }
    
        else 
        {
            while(fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next;
            }
        }
        
        slow.next=slow.next.next;
        return head;
        
        
        
    }
}
